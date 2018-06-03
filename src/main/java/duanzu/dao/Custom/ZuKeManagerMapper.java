package duanzu.dao.Custom;

import java.util.List;
import java.util.Map;

public interface ZuKeManagerMapper {
	
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
	public boolean deleteOrderManagerInfo(String order_id);
	
	/**
	 * 删除订单详细信息
	 * @param order_id
	 * @return
	 */
	public boolean deleteOrderDetailInfo(String order_id);
	
	/**
	 * 根据订单id获取订单详情id
	 * @param order_id
	 * @return
	 */
	public String findOrderDetailIdByOrederId(String order_id);
	
	/**
	 * 删除同住人信息
	 * @param order_id
	 * @return
	 */
	public boolean deleteOrderTenantInfo(String order_detail_id);
	
	/**
	 * 删除订单预定时间
	 * @param order_id
	 * @return
	 */
	public boolean deleteOrderTimeInfo(String order_id);
	
}
