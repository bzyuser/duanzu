package duanzu.service;

import java.util.Map;

public interface ZuKeOrderInfoService {

	/**
	 * 租客提交订单（增加订单）
	 * @param condition
	 * @return
	 */
	public boolean addZuKeOrderInfo(Map<String,Object> condition);
	
}
