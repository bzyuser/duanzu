package duanzu.service;

import java.util.Map;

public interface HouseDetailInfoService {

	/**
	 * 根据房屋id查询所有房屋详细信息
	 * @param house_id
	 * @return
	 */
	public Map<String,Object> findHouseDetailInfo(String house_id);
	
}
