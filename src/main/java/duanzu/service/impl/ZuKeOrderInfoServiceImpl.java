package duanzu.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.Custom.ZuKeOrderInfoMapper;
import duanzu.service.ZuKeOrderInfoService;
import duanzu.util.NoteUtil;

@Service
public class ZuKeOrderInfoServiceImpl implements ZuKeOrderInfoService{
	
	@Autowired
	private ZuKeOrderInfoMapper zuKeOrderMapper;
	
	/**
	 * 租客增加订单信息
	 */
	@Override
	public boolean addZuKeOrderInfo(Map<String, Object> condition) {
		// uuid生成成订单id
		String order_id = NoteUtil.createId();
		// uuid生成订单详情id
		String order_detail_id = NoteUtil.createId();
		//
		String time_id = NoteUtil.createId();
		//添加到map
		condition.put("order_id", order_id);
		condition.put("order_detail_id", order_detail_id);
		condition.put("time_id", time_id);
		
		// 增加order_manage
		zuKeOrderMapper.addZuKeOrderManage(condition);
		// 增加order_detail
		zuKeOrderMapper.addZuKeOrderDetail(condition);
		// 增加预定时间安排
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date preset_start_time = null;
		Date preset_end_time = null;
		try {
			preset_start_time = sdf.parse((String)condition.get("check_in_time"));
			preset_end_time = sdf.parse((String)condition.get("check_out_time"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		condition.put("preset_start_time",preset_start_time);
		condition.put("preset_end_time",preset_end_time);
		zuKeOrderMapper.addHouseInOutArrangeInfo(condition);
		// 增加tenant_info
		int dataNum = Integer.parseInt((String)condition.get("dataNum"));
		for(int i=0;i<dataNum;i++){
			// 生成其他同住租客信息id
			String tenant_id = NoteUtil.createId();
			// 获取联系人信息
			String name = (String)condition.get("name"+i);
			String sex = (String)condition.get("sex"+i);
			String id_card = (String)condition.get("id_card"+i);
			String phone = (String)condition.get("phone"+i);
			String remark = (String)condition.get("remark"+i);
			condition.put("tenant_id", tenant_id);
			condition.put("name", name);
			condition.put("sex", sex);
			condition.put("id_card", id_card);
			condition.put("phone", phone);
			condition.put("remark", remark);
			// 添加
			zuKeOrderMapper.addZuKeTenantInfo(condition);
		}
		
		return true;
	}

	
}
