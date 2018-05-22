<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户注册-科大短租</title>
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  		<!--<link rel="stylesheet" href="../../lib/layui/css/layui.css"  media="all">-->
		<link rel="stylesheet" href="../../css/hotel.css/jquery.idcode.css" />
  		<script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
		<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<script src="../../js/hotel.js/jquery.idcode.js"></script>
		
		<script src="../../js/util.js"></script>
		<script src="../../js/js/register.js"></script>
		
		<style>
			.main{
				height: 650px;
				width: 1340px;
				/*border: 1px solid red;*/	
				/*background: yellow;*/
			}
			.register-box{
				float: left;
				height:600px;
				width: 400px;
				background: lightblue;
				margin-left: 460px;
				margin-top: 10px;
			}
			.register-member{
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
			.button{
				float:left;
				margin-top: 25px;
			}
		
		</style>
	</head>
	<body>
			<div class="register-box" style="width:500px">
				<div class="register-member">
					<div class="text">会员注册<div>
				</div>
				<div id="form_container1">
					<br />
					<table>
					<tr>
						<td>
							<input type="text" class="form-control" placeholder="姓名" id="name" />
						</td>
						<td>
							<p id="name_span"></p>
						</td>
					</tr>
					<tr>
						<td>
							<input type="text" class="form-control" placeholder="手机号" id="phone" maxlength="11"/>
						</td>
						<td>
							<p id="phone_span"></p>
						</td>
					</tr>
					<tr>
						<td>
							<input type="text" class="form-control" placeholder="电子邮箱" id="email" />
						</td>
						<td>
							<p id="email_span"></p>
						</td>
					</tr>
					<tr>
						<td>
							<input type="password" class="form-control" placeholder="密码" id="password" />
						</td>
						<td>
							<p id="password_span"></p>
						</td>
					</tr>
					<tr style="heigth:30px">
						<td>
							<input type="password" class="form-control" placeholder="确认密码" id="surepassword" />
						</td>
						<td>
							<span id="surepassword_span"></span>
						</td>
					</tr>
					</table>
					
				
					</div>
					<div class="button">
						<button onclick="register()" type="button" style="height: 35px;width: 295px; background: darkgray;">注册</button>
					</div>
					
				</div>
			</div>
		</div>
	</body>
</html>
