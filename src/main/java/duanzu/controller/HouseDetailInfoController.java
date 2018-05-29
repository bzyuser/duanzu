package duanzu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.service.HouseDetailInfoService;

@Controller
@RequestMapping("/pages/hotel/findHouse")
public class HouseDetailInfoController {

	@Autowired
	private HouseDetailInfoService houseInfoService;
	
	@ResponseBody
	@RequestMapping("/findHouseDetailInfo.do")
	public Map<String,Object> findHouseDetailInfo(String house_id){
		Map<String,Object> map = new HashMap<String,Object>();
			map = houseInfoService.findHouseDetailInfo(house_id);
		return map;
	}
}
