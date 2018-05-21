package duanzu.service;

import java.util.Map;

public interface LoginService {
	Map<String,Object> checkLogin(String name,String password); 
}
