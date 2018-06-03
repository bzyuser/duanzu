package duanzu.service;

import java.util.List;
import java.util.Map;

public interface HotelIndexService {
	
	/**
	 * 根据条件查询城市短租信息
	 * @return
	 */
	public List<Map<String,Object>> findCityDuanzuInfo(Map<String,Object> condition,String[] houseTypeArray,String[] rentTypeArray,String[] facilityArray);
	
	

}
