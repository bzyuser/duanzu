
$(function(){
	
	searchOrderInfo();
	
})

// 根据状态查询订单信息
function searchOrderInfo(){
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	
	//获取用户id
	var user_id = $("#user_id").val();
	// 获取订单状态参数
	var orderStatus = $("#orderStatus").find("option:selected").val();
	
	$.ajax({
		url:contextPath+"/pages/hotel/zukeOrderManager/findZuKeOrderInfo.do",
		type:"post",
		data:{"status":orderStatus,"user_id":user_id},
		dataType:"json",
		success:function(orderList){
			$("#zuKeOrderInfo").html("");
			for(var i=0;i<orderList.length;i++){
				$("#zuKeOrderInfo").append(
					"<tr class='list-content' style='font-size:15px;'>"+
						"<td><p>"+orderList[i].order_num+"</p></td>"+
						"<td><p style='text-align: left;color: lightblue;'>"+orderList[i].house_name+"</p><p style='text-align: left;color: lightgray;'>"+orderList[i].address+"</p></td>"+
						"<td><p>"+orderList[i].check_in_days+"天*1套</p><p style='color: lightgray;'>"+orderList[i].check_in_time+"入住<br>"+orderList[i].check_out_time+"退房</p></td>"+
						"<td><p>订单总金额￥"+orderList[i].total_price+"</p></td>"+
						"<td><p>"+orderList[i].real_name+""+orderList[i].sex+"士</p></td>"+
						"<td><p>"+orderList[i].status+"</p></td>"+
						"<td><input type='button' onclick='calcelOrder(this);' value='取消订单' status='"+orderList[i].status+"' orderId='"+orderList[i].order_id+"'/></td>"+
					"</tr>"
				);
			}
		},
		error:function(){
			layer.msg("信息加载出错");
		}
			
		
	})
	
}

//取消订单
function calcelOrder(obj){
	
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	
	var status = $(obj).attr("status");
	if(status!="待入住"){
		layer.msg(status+" 状态不可取消");
		return;
	}
	var order_id = $(obj).attr("orderId");

	$.ajax({
		url:contextPath+"/pages/hotel/zukeOrderManager/calcelOrder.do",
		type:"post",
		data:{"order_id":order_id},
		dataType:"json",
		success:function(){
			layer.msg("取消订单成功")
		},
		error:function(){
			layer.msg("取消订单出错")
		}
	})
}



