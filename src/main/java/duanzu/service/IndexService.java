package duanzu.service;

import java.util.List;
import java.util.Map;

public interface IndexService {
	
	/**
	 * 查询首页显示信息
	 * @return
	 */
	public Map<String,Object> findIndexPageInfo();
	
	/**
	 * 根据条件查询 短租信息
	 * @param condition
	 * @return
	 */
	public List<Map<String,Object>> findCityInfo(Map<String,Object> condition);
	
}
