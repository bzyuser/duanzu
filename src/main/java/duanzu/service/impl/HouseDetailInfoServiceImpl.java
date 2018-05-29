package duanzu.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.HostFamilyInfoMapper;
import duanzu.dao.HouseBaseInfoMapper;
import duanzu.dao.HouseDetailInfoMapper;
import duanzu.dao.HousePictureUrlMapper;
import duanzu.dao.PriceAndRequestInfoMapper;
import duanzu.entity.HostFamilyInfo;
import duanzu.entity.HouseBaseInfo;
import duanzu.entity.HouseDetailInfo;
import duanzu.entity.HouseDetailInfoExample;
import duanzu.entity.HousePictureUrl;
import duanzu.entity.HousePictureUrlExample;
import duanzu.entity.PriceAndRequestInfo;
import duanzu.entity.PriceAndRequestInfoExample;
import duanzu.service.HouseDetailInfoService;

@Service
public class HouseDetailInfoServiceImpl implements HouseDetailInfoService {

	@Autowired
	private HouseBaseInfoMapper baseMapper;
	@Autowired
	private HouseDetailInfoMapper detailMapper;
	@Autowired
	private PriceAndRequestInfoMapper pqMapper;
	@Autowired
	private HostFamilyInfoMapper hostMapper;
	@Autowired
	private HousePictureUrlMapper picUrlMapper;
	
	@Override
	public Map<String, Object> findHouseDetailInfo(String house_id) {
		// 用于封装房屋所有的信息
		Map<String,Object> map = new HashMap<String,Object>();
		// 查询房屋基础信息
		HouseBaseInfo baseInfo = baseMapper.selectByPrimaryKey(house_id);
			// 添加房屋基本信息到map
			map.put("baseInfo", baseInfo);
		// 获取设施字段，重新处理
		String facility = baseInfo.getFacility();
		String[] facilityArr = facility.split(",");
		List<String> facilityList = Arrays.asList(facilityArr);
			// 添加设施list到map
			map.put("facilityList", facilityList);
		// 查询房屋图片信息
			HousePictureUrlExample housePicExa = new HousePictureUrlExample();
			HousePictureUrlExample.Criteria picCriteria = housePicExa.createCriteria();
			picCriteria.andHouseIdEqualTo(house_id);
			List<HousePictureUrl> housePicInfoList = picUrlMapper.selectByExample(housePicExa);
			HousePictureUrl housePicInfo = new HousePictureUrl();
			if(housePicInfoList.size()!=0){
				for(int i=0;i<housePicInfoList.size();i++){
					if(housePicInfoList.get(i).getPictureType().equals("封面")){
						housePicInfo = housePicInfoList.get(i);
						break;
					}
				}	
			}
			map.put("housePicInfo", housePicInfo);
		// 查询房屋详细信息
		HouseDetailInfoExample detailExaple = new HouseDetailInfoExample();
		HouseDetailInfoExample.Criteria detailCriteria = detailExaple.createCriteria();
		detailCriteria.andHouseIdEqualTo(house_id);
		List<HouseDetailInfo> detailInfoList = detailMapper.selectByExample(detailExaple);
		HouseDetailInfo detailInfo = new HouseDetailInfo();
			if(detailInfoList.size()!=0){
				detailInfo = detailInfoList.get(0);
			}
			// 添加房屋详细信息到map
			map.put("detailInfo", detailInfo);
		// 查询房屋价格及要求信息
		PriceAndRequestInfoExample pqExample = new PriceAndRequestInfoExample();
		PriceAndRequestInfoExample.Criteria pqCriteria = pqExample.createCriteria();
		pqCriteria.andHouseIdEqualTo(house_id);
		List<PriceAndRequestInfo> pqInfoList = pqMapper.selectByExample(pqExample);
		PriceAndRequestInfo pqInfo = new PriceAndRequestInfo();
			if(pqInfoList.size()!=0){
				pqInfo = pqInfoList.get(0);
			}
			// 添加价格及要求信息到map
			map.put("pqInfo", pqInfo);
		// 获取房东id
		String host_family_id = baseInfo.getHostFamilyId();
		// 查询房东详细信息
		HostFamilyInfo hostInfo = hostMapper.selectByPrimaryKey(host_family_id);
			// 添加房东信息到map
			map.put("hostInfo", hostInfo);
			
		return map;
	}
	
}
