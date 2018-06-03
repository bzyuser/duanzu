package duanzu.service;

import java.util.List;
import java.util.Map;

public interface ZuKeManagerService {

	/**
	 * 根据条件查询租客的订单信息列表
	 * @param condition
	 * @return
	 */
	public List<Map<String,Object>> findZuKeOrderInfo(Map<String,Object> condition);

	/**
	 * 删除订单信息
	 * @param order_id
	 * @return
	 */
	public boolean deleteOrderInfo(String order_id);
}
