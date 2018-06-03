package duanzu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.service.ZuKeOrderInfoService;

@Controller
@RequestMapping("/pages/hotel/zuKeOrderInfo")
public class ZuKeOrderInfoController {
	
	@Autowired
	private ZuKeOrderInfoService orderService;
	
	/**
	 * 增加订单信息
	 * @param condition
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addZuKeOrderInfo.do")
	public boolean addZuKeOrderInfo(@RequestParam Map<String,Object> condition){
		boolean result =false;
		result = orderService.addZuKeOrderInfo(condition);
		return result;
	}

	
}
