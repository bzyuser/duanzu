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
	
	/**
	 * 查询热门城市与短租推荐信息
	 */
	@Override
	public Map<String, Object> findIndexPageInfo() {
		// 用于封装返回数据
		Map<String,Object> map = new HashMap<String,Object>();
		// 查询热门城市信息
		List<Map<String,Object>> cityList = indexMapper.findIndexCityInfo();
			//添加到map
			map.put("cityList", cityList);
		// 查询推荐短租信息
		String picture_type = "封面";
		List<Map<String,Object>> duanzuList = indexMapper.findIndexDuanzuInfo(picture_type);
			//添加到map
			map.put("duanzuList", duanzuList);
			
		return map;
	}


	/**
	 * 增加房屋热度等级
	 */
	@Override
	public boolean updateHouseHotLevel(String house_id) {
		boolean result = false;
		result = indexMapper.updateHuseHotLevel(house_id);
		return result;
	}


}
