package duanzu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.service.ZuKeManagerService;

@Controller
@RequestMapping("/pages/hotel/zukeOrderManager")
public class ZuKeManagerController {

	@Autowired
	private ZuKeManagerService zukeService;
	
	/**
	 * 根据条件查询租客订单列表
	 * @param condition
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findZuKeOrderInfo.do")
	public List<Map<String,Object>> findZukeOrderInfo(@RequestParam Map<String,Object> condition){
		List<Map<String,Object>> orderList = zukeService.findZuKeOrderInfo(condition);
		return orderList;
	}
	
	
	
	
	
}
