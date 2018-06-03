package duanzu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.UserTableMapper;
import duanzu.entity.UserTable;
import duanzu.entity.UserTableExample;
import duanzu.service.LoginService;
import duanzu.util.NoteUtil;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserTableMapper userMapper;
	
	@Override
	public Map<String,Object> checkLogin(String name, String password) {
		Map<String,Object> map = new HashMap<>();
		//对密码进行加密
		//String md5Password = NoteUtil.md5(password);
		
		UserTableExample userEx = new UserTableExample();
		UserTableExample.Criteria criteria = userEx.createCriteria();
		criteria.andUserNameEqualTo(name);
		List<UserTable> lists = userMapper.selectByExample(userEx);
		if(lists.size()!=0){
			UserTable user = lists.get(0);
			String truePassword = user.getPassword();
			if(truePassword.equals(password)){
				map.put("status", 1);
				map.put("msg", "密码正确");
				map.put("user", lists.get(0));
			} else{
				map.put("status", 0);
				map.put("msg", "密码错误");
			}
		}
		else{
			map.put("status", 2);
			map.put("msg", "用户名不存在");
		}
		return map;
	}

}
