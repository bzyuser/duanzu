package duanzu.dao.Custom;

import java.util.Map;

public interface ZuKeOrderInfoMapper {

	/**
	 * 租客增加订单(订单管理)
	 * @return
	 */
	public boolean addZuKeOrderManage(Map<String,Object> condition);
	
	/**
	 * 增加订单详细信息
	 * @param condition
	 * @return
	 */
	public boolean addZuKeOrderDetail(Map<String,Object> condition);
	
	/**
	 * 增加同住人员信息
	 * @param condition
	 * @return
	 */
	public boolean addZuKeTenantInfo(Map<String,Object> condition);
	
	/**
	 * 添加预定时间信息
	 * @param condition
	 * @return
	 */
	public boolean addHouseInOutArrangeInfo(Map<String,Object> condition);
}
