//退出登录
function exit(){
	//发送ajax请求
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	
	$.ajax({
		url:contextPath+"/pages/hotel/login/exit.do",
		type:"post",
		dataType:"text",
		success:function(){
			window.location.href=contextPath+"/pages/hotel/index.jsp";
		},
		error:function(){
			layer.msg("服务器出错！！");
		}
	})
	});
}

// 判斷session是否有數據
function hasSession(){
	var session = $("#session").val();
	if(session!=null && session!=""){
		$("#nav1").css("display","none");
		$("#nav2").css("display","");
	}else{
		$("#nav2").css("display","none");
		$("#nav1").css("display","");
	}
}

//
function toIndex(){
	window.location.href=contextPath+"/pages/hotel/index.jsp";
}



