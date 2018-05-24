package duanzu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.service.HotelIndexService;

@Controller
@RequestMapping("/pages/hotel/findCityDuanZu")
public class HotelIndexController {
	
	@Autowired
	private HotelIndexService hotelService;
	
	@ResponseBody
	@RequestMapping("/findCityDuanzuInfo.do")
	public List<Map<String,Object>> findCityDuanzuInfo(@RequestParam Map<String,Object> condition,String[] houseType,String[] rentType,String[] facility){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
			list = hotelService.findCityDuanzuInfo(condition,houseType,rentType,facility);
		return list;
	}


}
