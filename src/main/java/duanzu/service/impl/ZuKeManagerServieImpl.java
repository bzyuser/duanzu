package duanzu.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.Custom.ZuKeManagerMapper;
import duanzu.service.ZuKeManagerService;


@Service
public class ZuKeManagerServieImpl implements ZuKeManagerService {

	@Autowired
	private ZuKeManagerMapper zkMapper;
	
	@Override
	public List<Map<String, Object>> findZuKeOrderInfo(Map<String, Object> condition) {
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list = zkMapper.findZuKeOrderInfo(condition);
		
		return list;
	}

	@Override
	public boolean deleteOrderInfo(String order_id) {
		
		boolean result = false;
		
		//删除订单信息
		result = zkMapper.deleteOrderManagerInfo(order_id);
		
		//删除订单详细信息
		result = zkMapper.deleteOrderDetailInfo(order_id);
		
		//删除同住人信息
		String order_detail_id = zkMapper.findOrderDetailIdByOrederId(order_id);
		result = zkMapper.deleteOrderTenantInfo(order_detail_id);
		
		//删除订单预定时间
		result = zkMapper.deleteOrderTimeInfo(order_id);
		
		return true;
	}

}
