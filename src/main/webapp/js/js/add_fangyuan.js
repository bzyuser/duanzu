var userId = null;
$(function(){
	userId = $("#sessionUserId").val();
	//alert(userId);
	
	loadhostinfo();
})
//添加房源
function submit1(){
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	//layer.msg("fang");
	//隐藏用户id
	$("#userId").val(userId);
	$.ajax({
		url:contextPath+"/pages/hotel/addfangyuan/commit.do",
		type:"post",
		data:$("#form1").serialize(),
		dataType:"json",
		success:function(result){
			var status = result.status;
			if(status==1){
				//获取房屋id隐藏房屋id
				$("#houseId").val(result.houseId);
				$("#upload").css("display","");
				layer.msg(result.msg);
				
			}else if(status==2){
				layer.msg(result.msg);
			}else if(status==0){
				
			}
		},
		error:function(){
			
		}
	})
	
}

//加载房东基本信息
function loadhostinfo(){
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	
	$.ajax({
		url:contextPath+"/pages/hotel/fangdongManager/loadhostinfo.do",
		type:"post",
		data:{"userId":userId},
		dataType:"json",
		success:function(result){
			var status = result.status;
			if(status==1){
				var msg = result.msg;
				//显示房东信息
				$("#realname").val(msg.realName);
				$("#idcard").val(msg.idCard);
				$("#phone").val(msg.phone);
				$("#userinforemark").val(msg.remark1);
			} else{
				layer.msg("请先完善个人详细信息");
				//隐藏发布按钮
				$("#submit").css("display","none");
			}
		},
		error:function(){
			layer.msg("加载信息出错");
		}
	})
	});
}
