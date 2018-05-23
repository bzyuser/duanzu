package duanzu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.service.IndexService;


@Controller
@RequestMapping("/pages/hotel/findDuanZu")
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	@ResponseBody
	@RequestMapping("/findIndexPageInfo.do")
	public Map<String,Object> findIndexPageInfo(){
		Map<String,Object> map = indexService.findIndexPageInfo();
		
		return map;
	}
	
	
	
	@ResponseBody
	@RequestMapping("/findCityInfo.do")
	public List<Map<String,Object>> findCityInfo(@RequestParam Map<String,Object> condition){
		
		return null;	
	}

}
