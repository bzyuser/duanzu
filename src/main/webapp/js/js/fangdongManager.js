var userId = 1;
//页面加载执行查询房东基本信息
$(function(){
	loadhostinfo(userId);
});

//加载房东信息
function loadhostinfo(id){
	//向基本信息中隐藏用户id
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	
	$("#userId").val(userId);
	$.ajax({
		url:contextPath+"/pages/hotel/fangdongManager/loadhostinfo.do",
		type:"post",
		data:{"userId":id},
		dataType:"json",
		success:function(result){
			var status = result.status;
			if(status==1){
				var msg = result.msg;
				//显示房东信息
				$("#name").val(msg.realName);
				var sex = msg.sex;
				if(sex=="男"){
					$("#sex1").prop("checked","true");
				}else{
					$("#sex2").prop("checked","true");
				}
				$("#age").val(msg.age);
				$("#phone").val(msg.phone);
				$("#cardtype").val(msg.cardType);
				$("#cardnum").val(msg.idCard);
				$("#minzu").val(msg.ethnic);
				$("#job").val(msg.job);
				$("#hostdesc").val(msg.hostDesc);
				$("#remark").val(msg.remark1);
			}
		},
		error:function(){
			layer.msg("加载房东信息出错");
		}
	})
}
//对进本信息进行保存
function saveInfo(){
	//向基本信息中隐藏用户id
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	
	$("#userId").val(userId);
	$.ajax({
		url:contextPath+"/pages/hotel/fangdongManager/saveInfo.do",
		type:"post",
		data:$("#forminfo").serialize(),
		dataType:"json",
		success:function(result){
			var status = result.status;
			if(status==1){
				layer.msg(result.msg);
			}else{
				layer.msg(result.msg);
			}
		},
		error:function(){
			layer.msg("保存出错");
		}
	})
}