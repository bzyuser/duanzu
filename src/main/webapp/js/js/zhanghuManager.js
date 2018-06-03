var userId = 1;
//页面加载执行查询房东基本信息
$(function(){
	loadUserInfo(userId);
});

//加载该房东的房源信息
function loadUserInfo(userId){
	//向基本信息中隐藏用户id
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	$.ajax({
		url:contextPath+"/pages/hotel/zhanghuManager/loadUserInfo.do",
		type:"post",
		data:{"userId":userId},
		dataType:"json",
		success:function(result){
			var status = result.status;
			if(status==1){
				var msg = result.msg;
				$("#userName").val(msg.name);
				var sex = msg.sex;
				var birth = msg.birth;
				var arrs = birth.split("/");
				var mouth = arrs[1];
				var day = arrs[2];
				var year = arrs[0];
				var phone = msg.phone;
				$("#year").val(year);
				$("#month").val(mouth);
				$("#days").val(day);
				$("#phone").val(phone);
				if(sex=="男"){
					$("#pri1").attr("checked","checked");
				}if(sex=="女"){
					$("#pri2").attr("checked","checked");
				}
				//像页面中隐藏密码
				$("#password").val(msg.password);
				
			}else{
				layer.msg(result.msg);
			}
			
		},
		error:function(){
			layer.msg("加载账户信息出错");
		}
	})
}

function saveInfo(){
	//layer.msg("chenggong");
	var userName = $("#userName").val();
	var year = $("#year").val();
	var month = $("#month").val();
	var day = $("#days").val();
	var phone = $("#phone").val();
	var sex = $('input:radio[name="sex"]:checked').val();
	var birth = year+"/"+month+"/"+day;
	//alert(birth);
	//发送ajax请求
	$.ajax({
		url:contextPath+"/pages/hotel/zhanghuManager/saveUserInfo.do",
		type:"post",
		data:{"userName":userName,"phone":phone,
			"sex":sex,"birth":birth,"userId":userId},
		dataType:"json",
		success:function(result){
			layer.msg(result.msg);
		},
		error:function(){
			layer.msg("保存用户信息i出错");
		}
	})
}
function updatePassword(){
	var password = $("#password").val();
	//layer.msg(oldPassword);
	var oldPassword = $("#oldPassword").val();
	var newPassword = $("#newPassword").val();
	var surePassword = $("#surePassword").val();
	if(password!=oldPassword){
		layer.msg("密码错误");
	} else if(newPassword!=surePassword){
		layer.msg("密码输入不一致");
	}else{
		//发送ajax请求更改密码
		$.ajax({
			url:contextPath+"/pages/hotel/zhanghuManager/updatePassword.do",
			type:"post",
			data:{"password":newPassword,"userId":userId},
			dataType:"json",
			success:function(result){
				layer.msg(result.msg);
			},
			error:function(){
				layer.msg("更改密码出错");
			}
		})
	}
}