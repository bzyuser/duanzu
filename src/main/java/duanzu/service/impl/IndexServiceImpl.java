package duanzu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.Custom.IndexPageInfoMapper;
import duanzu.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private IndexPageInfoMapper indexMapper;
	
	@Override
	public Map<String, Object> findIndexPageInfo() {
		// 用于封装返回数据
		Map<String,Object> map = new HashMap<String,Object>();
		// 查询热门城市信息
		List<Map<String,Object>> cityList = indexMapper.findIndexCityInfo();
			//添加到map
			map.put("cityList", cityList);
		// 查询推荐短租信息
		List<Map<String,Object>> duanzuList = indexMapper.findIndexCityInfo();
			//添加到map
			map.put("duanzuList", duanzuList);
			
		return map;
	}

	
	@Override
	public List<Map<String, Object>> findCityInfo(Map<String, Object> condition) {
		
		return null;
	}


}
