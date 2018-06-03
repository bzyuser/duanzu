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
	
	/**
	 * 查询热门城市信息与短租推荐信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findIndexPageInfo.do")
	public Map<String,Object> findIndexPageInfo(){
		Map<String,Object> map = indexService.findIndexPageInfo();
		
		return map;
	}
	
	
	/**
	 * 增加房屋热度等级
	 * @param house_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateHouseHotLevel.do")
	public boolean updateHouseHotLevel(String house_id){
		boolean result = false;
		result = indexService.updateHouseHotLevel(house_id);
		return result;
	}
	
	
}
