<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>账户管理-科大短租</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
		<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" href="../../css/font.css">
		<link rel="stylesheet" href="../../css/xadmin.css">
		<link rel="stylesheet" type="text/css" href="../../css/hotel.css/style.css" />

		<script type="text/javascript" src="../../js/jquery.min.js"></script>
		<script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
		<script type="text/javascript" src="../../js/xadmin.js"></script>
		<script type="text/javascript" src="../../iconfont/iconfont.js"></script>
		<script src="../../js/hotel.js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/hotel.js/select.js"></script>
		
		
		
		<script type="text/javascript" src="../../js/js/zhanghuManager.js"></script>
		<script type="text/javascript" src="../../js/js/util.js"></script>
		<style>
			.icon {
				width: 1.8em;
				height: 1.8em;
				vertical-align: -0.15em;
				fill: currentColor;
				overflow: hidden;
				color: lightgrey;
			}
			.icon00{
				width: 5.5em;
				height: 5.5em;
				vertical-align: -0.15em;
				fill: currentColor;
				overflow: hidden;
				margin-left: 12px;
				color: lightgrey;
			}
			/************************************公共样式*******************************/
			* {
				/*去除所有外边距*/
				margin: 0;
				/*去除所有内边距*/
				padding: 0;
			}
			li {
				/*去除列表符*/
				list-style: none;
			}
			a {
				text-decoration: none;
			}
			/************************************header样式*******************************/
			.header {
				height: 60px;
				width: 1366px;
				background: lightgoldenrodyellow;
			}
			.logo {
				float: left;
				margin-left: 50px;
				margin-top: 5px;
			}
			.name {
				float: left;
				margin-left: 15px;
				margin-top: 15px;
			}
			.name>p {
				float: left;
				margin-top: -5px;
				margin-left: 20px;
				font-size: 28px;
				text-shadow: 5px 5px 5px black, 0px 0px 2px black;
				color: white;
			}
			.nav {
				float: right;
				margin-right: 200px;
				margin-top: 20px;
			}
			.tubiao{
				float: left;
				margin-left: -100px;
			}
			.username{
				float: left;
				margin-left: -60px;
				font-size: 18px;
				color: lightblue;
			}
			.exit{
				float: left;
				margin-left: 20px;
				font-size: 18px;
			}
			a:hover{
				color: red;
			}
			.banner{
				width: 1366px;
				height:500px;
				background: lightgoldenrodyellow;
				margin-top: 5px;
			}
			.mimaInfo,.detailInfo{
				width: 1250px;
				height: 330px;
				background: white;
				float: left;
				margin-top: 5px;
				margin-left: 40px;
			}
			
			.kuai{
				width: 10px;
				height: 35px;
				/*border: 2px solid black;*/
				background: lightblue;
				float: left;
				margin-left: 20px;
				margin-top: 20px;
			}
			
			.text1{
				float: left;
				margin-top: 20px;
				margin-left: 10px;
			}
			.line{
				float: left;
				width: 100%;
				height: 2px;
				background: lightblue;
				margin-top: 10px;
			}
			
			.box1{
				float: left;
				margin-top: 20px;
				width: 1000px;
			}
			.text2{
				float:left;
				width: 150px;
				height: 30px;
				text-align: right;
			}
			.form-control{
				height:30px;
				width: 250px;
			}
			.newPassword{
				float: left;
				margin-left: 430px;
				margin-top: -26px;
			}
			.mima2{
				font-size: 16px;
				color: lightgrey;
			}
			select{
				width: 250px;
				height: 30px;
				padding: 5px;
				border-radius: 5px;
				outline: none;
			}
		</style>
	</head>
	<body>
		<div class="header">
			<div class="logo"><img src="../../images/hotel/logo.png" alt="logo" width="50px" height="50px" /></div>
			<div class="name">
			
			
			<!-- //隐藏session中的值 -->
			<input type="text" value="${userId}" id="sessionUserId" style="display:none;"></input>
			
			
			
				<p>
					Keda短租
				</p>
			</div>
			<div class="nav">
				<div class="tubiao">
					<svg class="icon" aria-hidden="true ">
						<use xlink:href="#icon-fangwuxinxi_ruzhuren"></use>
					</svg>
				</div>
				<span class="username">${user.name}</span>
				<div class="exit"><a onclick="exit()" id="exit" style="cursor:pointer;">退出登录</a></div>
			</div>
			
		</div>
		<div class="banner">
			<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
			  	<ul class="layui-tab-title">
				    <li class="layui-this">个人资料</li>
				    <li>修改密码</li>
			  	</ul>
			  	<div class="layui-tab-content" style="height: 100px;">
			    <div class="layui-tab-item layui-show">
			    	<div class="detailInfo">
			    	<!-- 隐藏密码框 -->
			    	<input type="text" style="display:none" id="password"/>
			    	
						<div class="kuai"></div>
						<div class="text1" style="font-size: 25px;">详细信息</div>
						<div class="line"></div>
						<div class="detail">
							<div class="box1">
								<div class="text2"><p style="font-size: 20px;">姓名：</p></div>
								<div class="shurukuang">
								    <input type="text" class="form-control" id="userName"/>
								</div>
							</div>
							<div class="box1">
								<div class="text2"><p style="font-size: 18px;">性别：</p></div>
							    <div class="shurukuang">
							    	<table class="choosesex">
							    		<tr class="sex">
							    			<td style="width:100px;text-align: center;"><input type="radio" name="sex" value="男" id="pri1" checked/><label for="pri1" style="font-size: 20px;">男</label></td>
							    			<td style="width:100px;text-align: center;"><input type="radio" name="sex" value="女" id="pri2"/><label for="pri2" style="font-size: 20px;">女</label></td>
							    		</tr>
							    	</table>
							    </div>
							</div>
							<div class="box1">
								<div class="text2"><p style="font-size: 18px;">出生日期：</p></div>
							    <div class="birthday">
							    	<select name="year" id="year">
										<option>选择年份</option>
									</select>
									<select name="month" id="month">
										<option>选择月份</option>
									</select>
									<select id="days" class="day">
										<option>选择日期</option>
									</select>
							    </div>
							    <script type="text/javascript">
									$(function(){
										$("#date").selectDate()
										
										
									})
								</script>
							</div>
							
							<div class="box1">
								<div class="text2"><p style="font-size: 20px;">手机号：</p></div>
								<div class="shurukuang">
								    <input type="text" class="form-control" maxlength="11" id="phone"/>
								</div>
								<button onclick="saveInfo()" class="button" style="float:right;width:70px;" type="button">保存</button>
							</div>
						</div>
					</div>
					</div>
				    <div class="layui-tab-item">
				    	<div class="mimaInfo">
							<div class="kuai"></div>
							<div class="text1" style="font-size: 25px;">密码设置</div>
							<div class="line"></div>
							<div class="mima">
								<div class="box1">
								    <div class="text2"><p style="font-size: 20px;">旧密码：</p></div>
								    <div class="shurukuang">
								    	<input type="password" class="form-control" id="oldPassword"/>
								    </div>
							    </div>
							    <div class="box1">
								    <div class="text2"><p style="font-size: 20px;">新密码：</p></div>
								    <div class="shurukuang">
								    	<input type="password" class="form-control" id="newPassword"/>
								    </div>
								    <div class="newPassword"><p class="mima2">密码由6-18位数字、字母组成。</p></div>
							    </div>
							    <div class="box1">
								    <div class="text2"><p style="font-size: 20px;">确认密码：</p></div>
								    <div class="shurukuang">
								    	<input type="password" class="form-control" id="surePassword"/>

								    </div>
								    <button onclick="updatePassword()" class="button" style="float:right;width:70px;" type="button">修改</button>
							    </div>
							    
							</div>
							
						</div>
				    </div>
				    
			  	</div>
			</div> 
		</div>
		<!--<div class="main"></div>
		<div class="footer"></div>-->
	
	</body>
</html>
