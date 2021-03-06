package duanzu.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import duanzu.entity.UserTable;
import duanzu.service.LoginService;

@Controller
@RequestMapping("/pages/hotel/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public Map<String,Object> login(String name,String password,HttpServletRequest request){
		Map<String,Object> map = new HashMap<>();
		map = loginService.checkLogin(name, password);
		int status = (Integer)map.get("status");
		//登录成功，将用户信息存到session中
		HttpSession session = request.getSession();
		if(status==1){
			UserTable user = (UserTable)map.get("user");
			session.setAttribute("userId", user.getUserId());//将老师或学生表主键存进去
            session.setAttribute("user", user);
            System.out.println(session.getAttribute("userId"));
		}
		return map;
	}
	@RequestMapping("/exit.do")
	@ResponseBody
	public String exit(HttpServletRequest request){
		
		HttpSession session = request.getSession();
		//删除session中的值
		session.removeAttribute("userId");
		session.removeAttribute("user");
		System.out.println(session.getAttribute("userId"));
		
		return "成功";
	}


}
