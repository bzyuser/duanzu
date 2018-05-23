package duanzu.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.entity.HostFamilyInfo;
import duanzu.service.HostFamilyInfoService;

@Controller
@SuppressWarnings("all")
@RequestMapping("/pages/hotel/fangdongManager")
public class FangDongManagerController {
	@Autowired
	private HostFamilyInfoService hostService;
	
	//根据用户id查询该用户绑定的房东详细信息
	@RequestMapping("/loadhostinfo.do")
	@ResponseBody
	public Map<String,Object> loadhostinfo(String userId){
		Map<String,Object> resultMap = new HashMap<>();
		try {
			HostFamilyInfo host = hostService.selectHostInfoByUserId(userId);
			if(host!=null){
				resultMap.put("status", 1);
				resultMap.put("msg", host);
			}else{
				resultMap.put("status", 0);
			}
			
		} catch (SQLException e) {
			System.out.println("查询房东详细信息失败，数据库异常");
			e.printStackTrace();
		}
		return resultMap;
	}
	
	//保存用户绑定的房东的详细信息
	@RequestMapping("/saveInfo.do")
	@ResponseBody
	public Map<String,Object> saveInfo(@RequestParam Map<String,Object> map){
		Map<String,Object> resultMap = new HashMap<>();
		//对前台数据进行封装
		String userId = (String)map.get("userId");
		String name = (String)map.get("name");
		String sex = (String)map.get("sex");
		String age = (String)map.get("age");
		String minzu = (String)map.get("minzu");
		String cardType = (String)map.get("cardtype");
		String cardNum= (String)map.get("cardnum");
		String phone = (String)map.get("phone");
		String job = (String)map.get("job");
		String hostDesc = (String)map.get("hostdesc");
		String remark = (String)map.get("remark");
		HostFamilyInfo hostinfo = new HostFamilyInfo();
		hostinfo.setUserId(userId);
		hostinfo.setRealName(name);
		hostinfo.setSex(sex);
		hostinfo.setAge(age);
		hostinfo.setEthnic(minzu);
		hostinfo.setCardType(cardType);
		hostinfo.setIdCard(cardNum);
		hostinfo.setPhone(phone);
		hostinfo.setJob(job);
		hostinfo.setHostDesc(hostDesc);
		hostinfo.setRemark1(remark);
		//保存数据
		try {
			boolean b = hostService.saveHostInfo(hostinfo);
			if(b){
				resultMap.put("status",1);
				resultMap.put("msg", "保存成功");
			}
			else{
				resultMap.put("status",0);
				resultMap.put("msg", "保存失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("保存房东基本信息失败，数据库异常");
		}
		return resultMap;
	}
	
}
