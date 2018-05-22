package duanzu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.UserTableMapper;
import duanzu.entity.UserTable;
import duanzu.entity.UserTableExample;
import duanzu.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private UserTableMapper userMapper;

	@Override
	public Map<String, Object> register(UserTable userInfo) {
		Map<String,Object> map = new HashMap<>();
		
		String userName = userInfo.getUserName();
		//查询用户名是否存在
		UserTableExample userEx = new UserTableExample();
		UserTableExample.Criteria criteria = userEx.createCriteria();
		criteria.andUserNameEqualTo(userName);
		List<UserTable> lists = userMapper.selectByExample(userEx);
		if(lists.size()==0){
			//用户名不存在，进行注册
			int n = userMapper.insertSelective(userInfo);
			if(n==1){
				map.put("status", 1);
				map.put("msg", "注册成功");
			} else{
				map.put("status", 0);
				map.put("msg", "注册失败");
			}
		}
		else {
			map.put("status", 2);
			map.put("msg", "用户名存在");
		}
		return map;
	}

}