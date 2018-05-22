$(function(){
	var name = getAddressParameter("name");
	if(name!=null){
		$("#login_name").val(name);
	}
})

function login(){
	var name = $("#login_name").val();
	var password = $("#login_password").val();
	var IsBy = $.idcode.validateCode();
	$("#passwordmsg").html("");
	$("#namemsg").html("");
	if(!IsBy){
		alert("验证码错误！！！")
	}else{
		$.ajax({
			url:contextPath+"/pages/hotel/login/login.do",
			type:"post",
			data:{"name":name,"password":password},
			dataType:"json",
			success:function(result){
				var status = result.status;
				if(status==1){
					window.location.href=contextPath+"/pages/hotel/index.jsp";
				} else if(status==0){
					$("#passwordmsg").html(result.msg);
				} else{
					$("#namemsg").html(result.msg);
				}
			},
			error:function(){
				
			}
		})
	}
	
}