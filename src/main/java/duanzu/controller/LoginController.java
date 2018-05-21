package duanzu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.service.LoginService;

@Controller
@RequestMapping("/pages/hotel/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public Map<String,Object> login(String name,String password){
		Map<String,Object> map = new HashMap<>();
		map = loginService.checkLogin(name, password);
		return map;
	}

}
