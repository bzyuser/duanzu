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
import duanzu.util.NoteUtil;



@Controller
@RequestMapping("/pages/hotel/register")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/register.do")
	@ResponseBody
	public Map<String,Object> login(String name,String password,String email,String phone){
		Map<String,Object> map = new HashMap<>();
		UserTable userInfo = new UserTable();
		userInfo.setUserId(NoteUtil.createId());
		userInfo.setUserName(name);
		userInfo.setPhone(phone);
		userInfo.setEmail(email);
		userInfo.setPassword(password);
		try {
			map = registerService.register(userInfo);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("注册失败，数据库异常");
		}
		return map;
	}

}
