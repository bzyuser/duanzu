package duanzu.service.impl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import duanzu.dao.CityMapper;
import duanzu.dao.HostFamilyInfoMapper;
import duanzu.dao.HouseBaseInfoMapper;
import duanzu.dao.HouseDetailInfoMapper;
import duanzu.dao.HousePictureUrlMapper;
import duanzu.dao.PriceAndRequestInfoMapper;
import duanzu.dao.Custom.FangDongManagerMapper;
import duanzu.entity.City;
import duanzu.entity.CityExample;
import duanzu.entity.HostFamilyInfo;
import duanzu.entity.HostFamilyInfoExample;
import duanzu.entity.HouseBaseInfo;
import duanzu.entity.HouseBaseInfoExample;
import duanzu.entity.HouseDetailInfo;
import duanzu.entity.HouseDetailInfoExample;
import duanzu.entity.HousePictureUrl;
import duanzu.entity.HousePictureUrlExample;
import duanzu.entity.PriceAndRequestInfo;
import duanzu.entity.PriceAndRequestInfoExample;
import duanzu.service.AddFangyuanService;
import duanzu.util.FileHandleUtil;
import duanzu.util.NoteUtil;

@Service
@Transactional
public class AddFangyuanServiceImpl implements AddFangyuanService {
	@Autowired
	private HostFamilyInfoMapper hostMapper;
	@Autowired
	private CityMapper cityMapper;;
	@Autowired
	private HouseBaseInfoMapper houseBaseInfoMapper;
	@Autowired
	private HouseDetailInfoMapper houseDetailInfoMapper;
	@Autowired
	private PriceAndRequestInfoMapper priceAndRequestMapper;
	@Autowired
	private HousePictureUrlMapper pictureMapper;
	@Autowired
	private FangDongManagerMapper houseCustomMapper;

	
	
	@Override
	public Map<String, Object> saveHouseInfo(Map<String, Object> map) throws SQLException {
		Map<String, Object> resultMap = new HashMap<>();
		String hostId = null;
		String cityId = null;
		String houseId = NoteUtil.createId();
		String houseDetailInfoId = NoteUtil.createId();
		String housePriceAndRequestId = NoteUtil.createId();
		//获取map中的数据
		String userId = (String)map.get("userId");
		String cityName = (String)map.get("s_city");
		//获取城市所在ID和房东ID
		HostFamilyInfoExample userEx = new HostFamilyInfoExample();
		HostFamilyInfoExample.Criteria criteria = userEx.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<HostFamilyInfo> lists = hostMapper.selectByExample(userEx);
		if(lists.size()!=0){
			HostFamilyInfo hostInfo = lists.get(0);
			hostId = hostInfo.getHostFamilyId();
		} else{
			resultMap.put("status",2);
			resultMap.put("msg","请先完善个人详细信息");
			return resultMap;
		}
		CityExample cityEx = new CityExample();
		CityExample.Criteria criteria1 = cityEx.createCriteria();
		criteria1.andCityNameEqualTo(cityName);
		List<City> lists1 = cityMapper.selectByExample(cityEx);
		if(lists1.size()!=0){
			City city = lists1.get(0);
			cityId = city.getCityId();
		} else{
			resultMap.put("status",2);
			resultMap.put("msg","您所选择的城市暂时无信息，添加失败");
			return resultMap;
		}
		//获取房屋基本信息，封装为对象
		String address = (String)map.get("s_province")+(String)map.get("s_city")
				+(String)map.get("s_county")+(String)map.get("detailInfo");
		HouseBaseInfo houseBaseInfo = new HouseBaseInfo();
		houseBaseInfo.setHouseId(houseId);
		houseBaseInfo.setCityId(cityId);
		houseBaseInfo.setHostFamilyId(hostId);
		houseBaseInfo.setHouseName((String)map.get("houseName"));
		houseBaseInfo.setRentOutType((String)map.get("rentOutType"));
		houseBaseInfo.setHouseType((String)map.get("houseType"));
		houseBaseInfo.setHomeType((String)map.get("homeType"));
		houseBaseInfo.setPrice((String)map.get("dayPrice"));
		houseBaseInfo.setAddress(address);
		houseBaseInfo.setFacility((String)map.get("facility"));
		houseBaseInfo.setHouseDesc((String)map.get("houseDesc"));
		houseBaseInfo.setTraffic((String)map.get("traffic"));
		houseBaseInfo.setRimDesc((String)map.get("rimDesc"));
		houseBaseInfo.setOther((String)map.get("other"));
		String time = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		time = sdf.format(date);
		houseBaseInfo.setTime(time);
		houseBaseInfo.setHotLevel("0");
		houseBaseInfo.setStatus("0");
		int i = houseBaseInfoMapper.insertSelective(houseBaseInfo);
		//封装房屋详细信息表
		HouseDetailInfo houseDetailInfo = new HouseDetailInfo();
		houseDetailInfo.setDetailId(houseDetailInfoId);
		houseDetailInfo.setHouseId(houseId);
		houseDetailInfo.setHomeNum((String)map.get("homeNum"));
		houseDetailInfo.setBedNum((String)map.get("bedNum"));
		houseDetailInfo.setAvailablePeopleNum((String)map.get("availablePeopleNum"));
		houseDetailInfo.setBedType((String)map.get("bedType"));
		houseDetailInfo.setExtraAddPeopleNum((String)map.get("extraAddPeopleNum"));
		houseDetailInfo.setToiletNum((String)map.get("toiletNum"));
		houseDetailInfo.setToiletType((String)map.get("toiletType"));
		houseDetailInfo.setTowerLevel((String)map.get("towerLevel"));
		houseDetailInfo.setTotalLevel((String)map.get("totalLevel"));
		houseDetailInfo.setArea((String)map.get("area"));
		int i1 = houseDetailInfoMapper.insertSelective(houseDetailInfo);
		//封装房屋价格及要求说明
		PriceAndRequestInfo priceAndRequest = new PriceAndRequestInfo();
		priceAndRequest.setPriceInfoId(housePriceAndRequestId);
		priceAndRequest.setHouseId(houseId);
		priceAndRequest.setDayPrice((String)map.get("dayPrice"));
		priceAndRequest.setWeekPrice((String)map.get("weekPrice"));
		priceAndRequest.setCleanPrice((String)map.get("cleanPrice"));
		priceAndRequest.setCashPledge((String)map.get("cashPledge"));
		priceAndRequest.setLessDay((String)map.get("lessDay"));
		priceAndRequest.setMoreDay((String)map.get("moreDay"));
		priceAndRequest.setCheckInStartTime((String)map.get("checkInStartTime"));
		priceAndRequest.setCheckInEndTime((String)map.get("checkInEndTime"));
		priceAndRequest.setCheckOutTime((String)map.get("checkOutTime"));
		int i2 = priceAndRequestMapper.insertSelective(priceAndRequest);
		if(i==1&&i1==1&&i2==1){
			resultMap.put("status",1);
			resultMap.put("msg","添加成功，请上传图片");
			resultMap.put("houseId",houseId);
		}
		else{
			resultMap.put("status",0);
		}
		return resultMap;
	}


	@Override
	public boolean saveHousePicture(String houseId, String picName,String picType) throws SQLException {
		HousePictureUrl picurl = new HousePictureUrl();
		picurl.setHousePictureUrlId(NoteUtil.createId());
		picurl.setHouseId(houseId);
		picurl.setPictureUrl(picName);
		picurl.setPictureType(picType);
		int n = pictureMapper.insertSelective(picurl);
		if(n==1){
			return true;
		}
		return false;
	}


	@Override
	public List<HouseBaseInfo> selectAllFangYuanByUserId(String userId) {
		List<HouseBaseInfo> houses = houseCustomMapper.selectAllFangYuanByUserId(userId);
		//对图片信息路径进行处理
		String path = FileHandleUtil.getValue("path","requestHotelFile");
		for(HouseBaseInfo house:houses){
			List<HousePictureUrl> pictures = house.getPictures();
			for(HousePictureUrl picture:pictures){
				picture.setPictureUrl(path+picture.getPictureUrl());
			}
		}
		
		return houses;
	}


	@Override
	public boolean deleteFangyuanById(String housiId) throws SQLException {
		//删除房源详细信息
		HouseDetailInfoExample houseEx = new HouseDetailInfoExample();
		HouseDetailInfoExample.Criteria criteria = houseEx.createCriteria();
		criteria.andHouseIdEqualTo(housiId);
		int num1 = houseDetailInfoMapper.deleteByExample(houseEx);
		//删除房源价格信息
		PriceAndRequestInfoExample priceEx = new PriceAndRequestInfoExample();
		PriceAndRequestInfoExample.Criteria criteriaPrice = priceEx.createCriteria();
		criteriaPrice.andHouseIdEqualTo(housiId);
		int num2 = priceAndRequestMapper.deleteByExample(priceEx);
		//删除房源基本信息
		HouseBaseInfoExample baseEx = new HouseBaseInfoExample();
		HouseBaseInfoExample.Criteria criteriaBase = baseEx.createCriteria();
		criteriaBase.andHouseIdEqualTo(housiId);
		int num3 = houseBaseInfoMapper.deleteByExample(baseEx);
		//查询出图片信息，并从文件中删除，然后删除数据中的信息
		HousePictureUrlExample pictureEx = new HousePictureUrlExample();
		HousePictureUrlExample.Criteria criteriapic = pictureEx.createCriteria();
		criteriapic.andHouseIdEqualTo(housiId);
		List<HousePictureUrl> urls = pictureMapper.selectByExample(pictureEx);
		//循环遍历删除文件夹中的图片信息
		for(HousePictureUrl url:urls){
			String urlName = url.getPictureUrl();
			 FileHandleUtil.deletePlainFile("path", "attachmentFile", urlName);
		}
		//删除数据库中的图片信息
		int num4 = pictureMapper.deleteByExample(pictureEx);
		if(num3!=0){
			return true;
		}
		return false;
	}

}










