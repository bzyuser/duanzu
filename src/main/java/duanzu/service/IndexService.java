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
	 * 增加房屋热度等级
	 * @param house_id
	 * @return
	 */
	public boolean updateHouseHotLevel(String house_id);
	
}
