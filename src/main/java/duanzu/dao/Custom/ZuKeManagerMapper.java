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

}
