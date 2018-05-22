
function register(){
	var name = $("#name").val();
	var phone = $("#phone").val();
	var email = $("#email").val();
	var password = $("#password").val();
	var surepassword = $("#surepassword").val();
	//清空提示框
	$("#name_span").html("");
	$("#phone_span").html("");
	$("#email_span").html("");
	$("#password_span").html("");
	$("#surepassword_span").html("");
	if(password!=surepassword){
		$("#surepassword_span").html("密码不一致");
	} else{
		$.ajax({
			url:contextPath+"/pages/hotel/register/register.do",
			type:"post",
			data:{"name":name,"phone":phone,"email":email,"password":password},
			dataType:"json",
			success:function(result){
				var status = result.status;
				if(status==0){
					alert("注册失败");
				}
				else if(status==1){
					window.location.href=contextPath+"/pages/hotel/login.jsp"+"?name="+name;
				}
				else{
					$("#name_span").html(result.msg);
				}
			},
			error:function(){
				alert("出错！！！");
			}
		})
	}
}