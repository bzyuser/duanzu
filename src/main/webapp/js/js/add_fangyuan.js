var userId = 1;
$(function(){
	loadhostinfo();
})
//加载房东基本信息
function loadhostinfo(){
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
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
			}
		},
		error:function(){
			layer.msg("加载信息出错");
		}
	})
}

function submit1(){
	//alert("123");
	$.ajax({
		url:contextPath+"/pages/hotel/addfangyuan/commit.do",
		type:"post",
		data:$("#form1").serialize(),
		dataType:"json",
		success:function(){
			
		},
		error:function(){
			
		}
	})
	
}