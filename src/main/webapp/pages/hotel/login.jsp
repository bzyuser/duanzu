<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  		<!--<link rel="stylesheet" href="../../lib/layui/css/layui.css"  media="all">-->
		<link rel="stylesheet" href="../../css/hotel.css/jquery.idcode.css" />
  		<script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
		<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<script src="../../js/hotel.js/jquery.idcode.js"></script>
		
		<script src="../../js/util.js"></script>
		<script src="../../js/js/login.js"></script>
		<style>
			.main{
				height: 650px;
				width: 1340px;
			}
			.login-box{
				float: left;
				height:600px;
				width: 400px;
				background: lightblue;
				/*border:2px solid lightblue;*/
				margin-left: 460px;
				margin-top: 10px;
			}
			.login-member{
				height:400px;
				width:300px;
				/*background: white;*/
				float:left;
				margin-top: 50px;
				margin-left: 50px;
			}
			.text{
				height: 40px;
				font-size: 24px;
				font-family: "微软雅黑";
				font-weight: bolder;
				float:left;
				text-align: center;
			}
			.form-control{
				height: 40px;
				width: 290px;
				margin-top: 20px;
			}
			.txtVerification{
				height:20px;
				width:125px;
				margin-left: 3px;
				float:left;
				margin-top: 20px;
			}
			.button{
				float:left;
				margin-left: -130px;
				margin-top: 50px;
			}
			.saveLogin{
				float:left;
				margin-top: 55px;
				margin-left: 40px;
				font-size: 20px;
				font-weight: normal;
				font-family: "bodoni mt";
			}
		</style>
	</head>
	<body>
		<div class="main">
			<div class="login-box">
				<div class="login-member">
					<div class="text">会员登录<div>
					<!--<div class="line">
						<hr class="layui-bg-black">
					</div>-->
				</div>
				<div id="form_container1">
					<br />
					<input type="text" class="form-control" placeholder="用户名" id="login_name"/>
					<span id="namemsg"></span>
					<input type="password" class="form-control" placeholder="密码" id="login_password" />
					<span id="passwordmsg"></span>
					<div id="identify_code">
						<input type="text" id="Txtidcode" class="txtVerification" placeholder="请输入验证码"/>
						<span id="idcode"></span>
						<!-- <div>
							<button type="button" id="btns">验证</button>
						</div>  -->
	
						<script>
							$.idcode.setCode();
							
							$("#btns").click(function (){
								var IsBy = $.idcode.validateCode(); 
								alert(IsBy);
								console.log(IsBy);
							});
						</script>
					</div>
					<div class="button">
						<button type="button" onclick="login()" style="height: 35px;width: 130px; background: lightgray;">登录</button>
					</div>
					<div class="saveLogin" pane="">
						<label class="savelogin">
					    	<input type="checkbox" value="false" id="remember_me" name="remeber_me">记住密码
					    </label>
					    	<!--<div class="layui-unselect layui-form-checkbox layui-form-checked" lay-skin="primary"><span>写作</span></div>-->
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
