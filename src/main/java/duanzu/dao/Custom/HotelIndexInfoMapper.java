package duanzu.dao.Custom;

import java.util.List;
import java.util.Map;

public interface HotelIndexInfoMapper {

	/**
	 * 查询城市短租信息
	 * @return
	 */
	public List<Map<String,Object>> findCityDuanzuInfo(Map<String,Object> condition);
	
	/**
	 * 查询房屋的出租预定时间信息
	 * @param house_id
	 * @return
	 */
	public List<Map<String,Object>> findHousePreSetTimeInfo(String house_id);
}
