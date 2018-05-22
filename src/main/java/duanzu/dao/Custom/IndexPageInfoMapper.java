package duanzu.dao.Custom;

import java.util.List;
import java.util.Map;

public interface IndexPageInfoMapper {
	
	/**
	 * 查询热门城市信息
	 * @return
	 */
	public List<Map<String,Object>> findIndexCityInfo();
	
	/**
	 * 查询短租推荐信息
	 * @return
	 */
	public List<Map<String,Object>> findIndexDuanzuInfo();
	
}
