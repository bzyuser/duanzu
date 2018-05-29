package duanzu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import duanzu.service.HotelIndexService;

@Controller
@RequestMapping("/pages/hotel/findCityDuanZu")
public class HotelIndexController {
	
	@Autowired
	private HotelIndexService hotelService;
	
	@ResponseBody
	@RequestMapping("/findCityDuanzuInfo.do")
	public PageInfo<Map<String,Object>> findCityDuanzuInfo(@RequestParam Map<String,Object> condition,String[] houseType,String[] rentType,String[] facility){
		// 每页显示数据量
		int pageSize = 7;
		if(condition.get("pageSize")!=null && condition.get("pageSize")!=""){
			pageSize = Integer.parseInt((String)condition.get("pageSize"));
		}
		// 当前页
		int pageNum = 1;
		if(condition.get("pageNum")!=null && condition.get("pageNum")!=""){
			pageNum = Integer.parseInt((String)condition.get("pageNum"));
		}
		//只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
		PageHelper.startPage(pageNum,pageSize);
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
			list = hotelService.findCityDuanzuInfo(condition,houseType,rentType,facility);
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}


}
