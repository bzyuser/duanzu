package duanzu.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.entity.UserTable;
import duanzu.service.RegisterService;

@Controller
@SuppressWarnings("all")
@RequestMapping("/pages/hotel/zhanghuManager")
public class ZhanghuManagerController {
	@Autowired
	private RegisterService registerService;
	
	//获取账户的基本信息
		@RequestMapping("/loadUserInfo.do")
		@ResponseBody
		public Map<String,Object> loadUserInfo(String userId){
			Map<String,Object> map = new HashMap<>();
			UserTable user = null;
			try {
				user = registerService.selectByUserId(userId);
				if(user!=null){
					map.put("status", 1);
					map.put("msg", user);
				}
				else{
					map.put("status", 0);
					map.put("msg", "暂无用户信息");
				}
			} catch (SQLException e) {
				
			}
	        return map;
		}
		

		//保存张华基本信息
			@RequestMapping("/saveUserInfo.do")
			@ResponseBody
			public Map<String,Object> save(String userId,String phone,String birth,String sex,String userName){
				Map<String,Object> map = new HashMap<>();
				UserTable userInfo = new UserTable();
				userInfo.setUserId(userId);
				userInfo.setName(userName);
				userInfo.setBirth(birth);
				userInfo.setSex(sex);
				userInfo.setPhone(phone);
				boolean b = false;
				try {
					b = registerService.saveByUserId(userInfo);
					if(b){
						map.put("msg", "保存成功！");
					}else{
						map.put("msg", "保存失败！");
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		        return map;
			}
			//更改密码
			@RequestMapping("/updatePassword.do")
			@ResponseBody
			public Map<String,Object> updatePassword(String userId,String password){
				Map<String,Object> map = new HashMap<>();
				UserTable userInfo = new UserTable();
				userInfo.setUserId(userId);
				userInfo.setPassword(password);
				boolean b = false;
				try {
					b = registerService.saveByUserId(userInfo);
					if(b){
						map.put("msg", "修改成功！");
					}else{
						map.put("msg", "修改失败！");
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		        return map;
			}
	
}
