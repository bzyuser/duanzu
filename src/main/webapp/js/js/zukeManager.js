
$(function(){
	
	searchOrderInfo();
	
})

// 根据状态查询订单信息
function searchOrderInfo(){
	
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
						"<td><div class='state'><p>"+orderList[i].status+"</p></div></td>"+
						"<td><div class='delete'><a href='#'>删除</a></div></td>"+
					"</tr>"
				);
			}
		},
		error:function(){
			alert("信息加载出错");
		}
	})
	
}