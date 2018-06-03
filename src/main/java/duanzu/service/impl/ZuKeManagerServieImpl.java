package duanzu.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.Custom.ZuKeManagerMapper;
import duanzu.service.ZuKeManagerService;


@Service
public class ZuKeManagerServieImpl implements ZuKeManagerService {

	@Autowired
	private ZuKeManagerMapper zkMapper;
	
	@Override
	public List<Map<String, Object>> findZuKeOrderInfo(Map<String, Object> condition) {
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list = zkMapper.findZuKeOrderInfo(condition);
		
		return list;
	}

}
