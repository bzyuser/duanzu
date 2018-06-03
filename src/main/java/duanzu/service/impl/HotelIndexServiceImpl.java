package duanzu.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.Custom.HotelIndexInfoMapper;
import duanzu.service.HotelIndexService;

@Service
public class HotelIndexServiceImpl implements HotelIndexService {

	@Autowired
	private HotelIndexInfoMapper hotelMapper;
	
	@Override
	public List<Map<String, Object>> findCityDuanzuInfo(Map<String,Object> condition,String[] houseTypeArray,String[] rentTypeArray,String[] facilityArray) {
		// 处理参数
		String city_name = (String)condition.get("city_name");
		String preset_start_time = (String)condition.get("preset_start_time");
		String preset_end_time = (String)condition.get("preset_end_time");
		String price_min = (String)condition.get("price_min");
		String price_max = (String)condition.get("price_max");
		String price = (String)condition.get("price");
		if(price!=null){
			int num = price.indexOf("-");
			price_min = price.substring(0, num);
			price_max = price.substring(num+1);
		}
		
		// 把处理后的参数添加到map中
		Map<String,Object> map = new HashMap<String,Object>();
			map.put("city_name", city_name);
			map.put("preset_start_time", preset_start_time);
			map.put("preset_end_time", preset_end_time);
			map.put("price_min", price_min);
			map.put("price_max", price_max);
			map.put("house_type_Array", houseTypeArray);
			map.put("home_type_Array", rentTypeArray);
			map.put("facility_Array", facilityArray);
		
		List<Map<String,Object>> list = hotelMapper.findCityDuanzuInfo(map);
	
		// 将预定日期转换成long型
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		long StartTime = 0;
		long EndTime = 0;
		if(preset_start_time!=""){
			try {
				Date presetStartTime = sdf.parse(preset_start_time);
				StartTime = presetStartTime.getTime();
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if(preset_end_time!=""){
			try {
				
				Date presetEndTime = sdf.parse(preset_end_time);
				EndTime = presetEndTime.getTime();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		// 用于存储最终返回的信息
		List<Map<String,Object>> infoList = new ArrayList<Map<String,Object>>();
		for(int i=0;i<list.size();i++){
			String url = (String)list.get(i).get("picture_url");
			String picture_url = "/pic/house/"+url;
				list.get(i).put("picture_url",picture_url);
			String house_id = (String)list.get(i).get("house_id");
			List<Map<String,Object>> timeList = hotelMapper.findHousePreSetTimeInfo(house_id);
			// 日期交叉判断值
			int midNum = 0;
			int minNum = 0;
			int maxNum = 0;
			for(int j=0;j<timeList.size();j++){
				// 获取现存有的时间信息
				Date Start = (Date)timeList.get(j).get("preset_start_time");
				Date End = (Date)timeList.get(j).get("preset_end_time");
				// 转换成long型
				long start = Start.getTime();
				long end = End.getTime();
				// 预定开始日期，结束日期   都小于存有的开始日期
				int a =0;
				for(int z=0;z<timeList.size();z++){
					long start1 = ((Date)timeList.get(z).get("preset_start_time")).getTime();
					if(StartTime<start1 && EndTime<start1){
						a++;
					}
				}
				if(a>=timeList.size()){
					minNum++;
					a=0;
				}
				
				// 预定开始日期，退房日期   都大于存有的结束日期
				int b =0;
				for(int z=0;z<timeList.size();z++){
					long end1 = ((Date)timeList.get(z).get("preset_end_time")).getTime();
					if(StartTime>end1 && EndTime>end1){
						b++;
					}
				}
				if(b>=timeList.size()){
					maxNum++;
					b=0;
				}
				// 中间日期交叉判断
				if(StartTime>end){
					int c=0;
					int d=0;
					for(int z=0;z<timeList.size();z++){
						if(z!=j){
							// 获取存有的结束时间依次跟预定开始时间比较
							long start2 = ((Date)timeList.get(z).get("preset_start_time")).getTime();
							if(EndTime<start2){
								c++;
							}
							long end2 = ((Date)timeList.get(z).get("preset_end_time")).getTime();
							if(EndTime>=end2){
								d++;
							}
						}
					}
					if(c>=(timeList.size()-d-1)){
						midNum++;
						c = 0;
						d = 0;
					}
				}
				
			
				
			}
			if(minNum>0 || maxNum>0 || midNum>0){
				// 将符合条件的数据添加到infoList
				infoList.add(list.get(i));
				//清空
				midNum = 0;
				minNum = 0;
				maxNum = 0;
			}
		}
		
		
		return infoList;
	}

}
