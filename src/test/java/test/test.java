package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import duanzu.dao.Custom.HotelIndexInfoMapper;


public class test {
	
	@Autowired
	private HotelIndexInfoMapper hotelMapper;
	
	
	@Test
	public void test1(){
//		
//		String preset_start_time = "5/10/2018";
//		String preset_end_time = "5/20/2018";
//		
//		// 将预定日期转换成long型
//				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//				long StartTime = 0;
//				long EndTime = 0;
//				try {
//					Date presetStartTime = sdf.parse(preset_start_time);
//					StartTime = presetStartTime.getTime();
//					Date presetEndTime = sdf.parse(preset_end_time);
//					EndTime = presetEndTime.getTime();
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//		
//		List<Map<String,Object>> timeList = hotelMapper.findHousePreSetTimeInfo("1");
//		// 日期交叉判断值
//		int midNum = 0;
//		int minNum = 0;
//		int maxNum = 0;
//		for(int j=0;j<timeList.size();j++){
//			// 获取现存有的时间信息
//			Date Start = (Date)timeList.get(j).get("preset_start_time");
//			Date End = (Date)timeList.get(j).get("preset_end_time");
//			// 转换成long型
//			long start = Start.getTime();
//			long end = End.getTime();
//			// 预定开始日期，结束日期   都小于存有的开始日期
//			if(StartTime<start && EndTime<start){
//				minNum++;
//			}
//			// 预定开始日期，退房日期   都大于存有的结束日期
//			if(StartTime>end && EndTime>end){
//				maxNum++;
//			}
//			// 中间日期交叉判断
//			if(StartTime>end){
//				for(int z=0;z<timeList.size();z++){
//					if(z!=j){
//						// 获取存有的结束时间依次跟预定开始时间比较
//						long ends = ((Date)timeList.get(z).get(preset_end_time)).getTime();
//						if(EndTime<ends){
//							midNum++;
//						}
//					}
//				}
//			}
//			
//			System.out.println(minNum+","+maxNum+","+midNum);
//			
//		}
//		
//		
		
	}
}
