<%@page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="UTF-8"%>
<%@include file="/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>房东管理-科大短租</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="../../css/font.css">
<link rel="stylesheet" href="../../css/xadmin.css">
<link rel="stylesheet" type="text/css"
	href="../../css/hotel.css/style.css" />

<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript" src="../../js/xadmin.js"></script>
<script type="text/javascript" src="../../iconfont/iconfont.js"></script>
<script src="../../js/hotel.js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../js/hotel.js/select.js"></script>
<!--<script class="resources library" src="../../js/hotel.js/area.js" type="text/javascript"></script>-->

<script type="text/javascript" src="../../js/js/fangdongManager.js"></script>

<style>
.icon {
	width: 1.8em;
	height: 1.8em;
	vertical-align: -0.15em;
	fill: currentColor;
	overflow: hidden;
	color: lightgrey;
}

.icon00 {
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

.tubiao {
	float: left;
	margin-left: -100px;
}

.username {
	float: left;
	margin-left: -60px;
	font-size: 18px;
	color: lightblue;
}

.exit {
	float: left;
	margin-left: 20px;
	font-size: 20px;
}

a:hover {
	color: red;
}

.banner {
	width: 1366px;
	height: 1000px;
	background: lightgoldenrodyellow;
	margin-top: 5px;
}

.mimaInfo, .detailInfo, .fangjianInfo {
	width: 1250px;
	
	background: white;
	float: left;
	margin-top: 5px;
	margin-left: 40px;
}

.kuai {
	width: 10px;
	height: 35px;
	/*border: 2px solid black;*/
	background: lightblue;
	float: left;
	margin-left: 20px;
	margin-top: 20px;
}

.text1 {
	float: left;
	margin-top: 20px;
	margin-left: 10px;
}

.line {
	float: left;
	width: 100%;
	height: 2px;
	background: lightblue;
	margin-top: 10px;
}

.box1 {
	float: left;
	margin-top: 20px;
	width: 1000px;
}

.text2 {
	float: left;
	width: 150px;
	height: 30px;
	text-align: right;
}

.form-control {
	height: 30px;
	width: 250px;
}

.newPassword {
	float: left;
	margin-left: 430px;
	margin-top: -26px;
}

.mima2 {
	font-size: 16px;
	color: lightgrey;
}

select {
	width: 250px;
	height: 30px;
	padding: 5px;
	border-radius: 5px;
	outline: none;
}

.type00 {
	height: 30px;
	width: 100px;
}

.list-group {
	height: 250px;
	width: 1200px;
	float: left;
	margin-left: 10px;
}

.list-title td {
	height: 50px;
	width: 171px;
	font-size: 18px;
	text-align: center;
}

.list-content td {
	height: 150px;
	width: 171px;
	font-size: 18px;
	text-align: center;
}

.state {
	height: 20px;
	width: 50px;
	/*	border: 1px solid red; */
	background: red;
	float: left;
	margin-left: 60px;
}

.delete {
	text-decoration: underline;
}
/*.box2{
				float: left;
				margin-top: 70px;
				width: 1000px;
			}*/
.box3 {
	height: 180px;
	width: 1000px;
	float: left;
	margin-left: 100px;
	/*border: 1px solid yellow;*/
}

.left {
	height: 140px;
	width: 160px;
	/*border: 1px solid red;*/
	float: left;
	margin-top: 20px;
	/*width: 1000px;*/
}

.picture {
	border: 1px solid green;
	width: 134px;
	height: 86px;
	float: left;
	margin-left: 13px;
	margin-top: 10px;
}

.middle {
	height: 140px;
	width: 160px;
	/*border: 1px solid red;*/
	float: left;
	margin-top: 40px;
	margin-left: 20px;
}

.middle h2 {
	font-size: 20px;
}

.right {
	height: 140px;
	width: 160px;
	/*border: 1px solid red;*/
	float: right;
	margin-top: 60px;
	margin-left: 20px;
}

.button {
	height: 30px;
	width: 100px;
	border-radius: 10px;
}
</style>
</head>
<body>
	<div class="header">
		<div class="logo">
			<img src="../../images/hotel/logo.png" alt="logo" width="50px"
				height="50px" />
			
			
				
				<!-- //隐藏session中的值 -->
			<input type="text" value="${userId}" id="sessionUserId" style="display:none;"></input>
			
			
		</div>
		<div class="name">
			<p>Keda短租</p>
		</div>
		<div class="nav">
			<div class="tubiao">
				<svg class="icon" aria-hidden="true ">
						<use xlink:href="#icon-fangwuxinxi_ruzhuren"></use>
					</svg>
			</div>
			<span class="username">${user.name}</span>
			<div class="exit">
				<a onclick="exit()" id="exit" style="cursor:pointer;">退出登录</a>
			</div>
		</div>

	</div>
	<div class="banner">
		<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
			<ul class="layui-tab-title">
				<li class="layui-this">订单管理</li>
				<li>房源管理</li>
				<li>详细信息</li>
			</ul>
			<div class="layui-tab-content" style="height: 100px;">
				<div class="layui-tab-item layui-show">
					<div class="detailInfo">
						<div class="kuai"></div>
						<div class="text1" style="font-size: 25px;">住宿订单列表</div>
						<div class="line"></div>
						<div class="detail">
							<div class="order-list">
								<table class="list-group">
								<thead>
									<tr class="list-title">
										<td>订单号</td>
										<td>房间</td>
										<td>
											日期
										</td>
										<td>房费</td>
										<td>租客</td>
										<td>
											<div class="order0">
												<select class="type00"  id="orderStatus" onchange="loadhostorderInfo()">
													<option value="">所有订单</option>
													<option value="待付款">待付款</option>
													<option value="待入住">待入住</option>
													<option value="入住中">入住中</option>
													<option value="取消">取消</option>
												</select>
											</div>
										</td>
										<td>操作</td>
									</tr>
									</thead>
									<tbody id="zuKeOrderInfo">
									
									</tbody>
									<!-- <tr class="list-content">
										<td>63635624</td>
										<td><p style="text-align: left; color: lightblue;">高级公寓
												好友小聚休闲度假全家出游</p>
											<p style="text-align: left; color: lightgray;">北京昌平区北七家王府公寓（温都水城，王府中西医）</p></td>
										<td><p>1天*1套</p>
											<p style="color: lightgray;">
												2018-05-23入住<br>2018-05-24退房
											</p></td>
										<td><p>订单总金额￥780</p></td>
										<td><p>朱女士</p></td>
										<td><div class="state">取消</div></td>
										<td><div class="delete">
												<a href="#">删除</a>
											</div></td>
									</tr>
									<tr class="list-content">
										<td>63635624</td>
										<td><p style="text-align: left; color: lightblue;">高级公寓
												好友小聚休闲度假全家出游</p>
											<p style="text-align: left; color: lightgray;">北京昌平区北七家王府公寓（温都水城，王府中西医）</p></td>
										<td><p>1天*1套</p>
											<p style="color: lightgray;">
												2018-05-23入住<br>2018-05-24退房
											</p></td>
										<td><p>订单总金额￥780</p></td>
										<td><p>朱女士</p></td>
										<td><div class="state">取消</div></td>
										<td><div class="delete">
												<a href="#">删除</a>
											</div></td>
									</tr>
									<tr class="list-content">
										<td>63635624</td>
										<td><p style="text-align: left; color: lightblue;">高级公寓
												好友小聚休闲度假全家出游</p>
											<p style="text-align: left; color: lightgray;">北京昌平区北七家王府公寓（温都水城，王府中西医）</p></td>
										<td><p>1天*1套</p>
											<p style="color: lightgray;">
												2018-05-23入住<br>2018-05-24退房
											</p></td>
										<td><p>订单总金额￥780</p></td>
										<td><p>朱女士</p></td>
										<td><div class="state">取消</div></td>
										<td><div class="delete">
												<a href="#">删除</a>
											</div></td>
									</tr> -->
								</table>
							</div>
						</div>
					</div>
				</div>

				<div class="layui-tab-item">
					<div class="mimaInfo">
						<div class="kuai"></div>
						<div class="text1" style="font-size: 25px;">全部房源</div>
						<div class="line"></div>
						<div class="mima" id="mima1">
							
							
							<!--<div class="box3">
								<div class="left">
									<div class="picture"></div>
									<div class="text">
										<p style="text-align: center;">2018年5月20日发布</p>
										<p style="text-align: center;">房间编号： 323763</p>
									</div>
								</div>
								<div class="middle">
									<a href="#"><h2>你好欢迎光临</h2></a>
									<p>万柏林区窊流路66号太原科技大学，千峰街道</p>
									<p style="color: lightgray">* 2室 3卫，120平 共1套</p>
								</div>
								<div class="right">
									<button class="button">删除房源</button>
								</div>
							</div>
							<div class="box3">
								<div class="left">
									<div class="picture"></div>
									<div class="text">
										<p style="text-align: center;">2018年5月20日发布</p>
										<p style="text-align: center;">房间编号： 323763</p>
									</div>
								</div>
								<div class="middle">
									<a href="#"><h2>你好欢迎光临</h2></a>
									<p>万柏林区窊流路66号太原科技大学，千峰街道</p>
									<p style="color: lightgray">* 2室 3卫，120平 共1套</p>
								</div>
								<div class="right">
									<button class="button">删除房源</button>
								</div>
							</div> -->
						</div>
					</div>
				</div>
				
				<div class="layui-tab-item">
					<form action="" method="post" id="forminfo">
						<div class="fangjianInfo">
							<div class="kuai"></div>
							<div class="text1" style="font-size: 25px;">详细信息</div>
							<div class="line"></div>
							<div class="typetable">
								<input type="text" style="display:none" id="userId" name="userId"/>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 20px;">真实姓名：</p>
									</div>
									<div class="shurukuang">
										<input type="text" class="form-control"
											placeholder="请输入户主真实姓名" id="name" name="name" />
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 18px;">性别：</p>
									</div>
									<div class="shurukuang">
										<table class="choosesex">
											<tr>
												<td style="width: 100px; text-align: center;"><input
													type="radio" name="sex" id="sex1" value="男" checked/> <label for="pri1"
													style="font-size: 20px;">男</label></td>
												<td style="width: 100px; text-align: center;"><input
													type="radio" name="sex" id="sex2" value="女"/> <label for="pri2"
													style="font-size: 20px;">女</label></td>
											</tr>
										</table>
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 20px;">年龄：</p>
									</div>
									<div class="shurukuang">
										<input type="text" class="form-control" placeholder="请输入户主年龄"
											id="age" name="age" />
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 18px;">民族：</p>
									</div>
									<div class="houseType">
										<select class="type00" name="minzu" id="minzu">
											<option value="汉族">汉族</option>
											<option value="满足">满族</option>
											<option value="其他">其他</option>
										</select>
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 18px;">证件类型：</p>
									</div>
									<div class="houseType">
										<select class="type00" name="cardtype" id="cardtype">
											<option value="身份证">身份证</option>
											<option value="军人证">军人证</option>
											<option value="居住证">居住证</option>
										</select>
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 20px;">证件号码：</p>
									</div>
									<div class="shurukuang">
										<input type="text" class="form-control" id="cardnum" name="cardnum"
											placeholder="请输入户主证件号码" />
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 20px;">手机号码：</p>
									</div>
									<div class="shurukuang">
										<input type="text" class="form-control" id="phone" name="phone"
											placeholder="请输入户主手机号码" maxlength="11" />
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 20px;">职业：</p>
									</div>
									<div class="shurukuang">
										<input type="text" class="form-control" id="job" name="job"
										placeholder="请输入户主职业" />
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 20px;">简介：</p>
									</div>
									<div class="beizhu">
										<textarea placeholder="户主简介" class="layui-textarea" id="hostdesc" name="hostdesc"
											 style="width: 600px;"></textarea>
									</div>
								</div>
								<div class="box1">
									<div class="text2">
										<p style="font-size: 20px;">备注：</p>
									</div>
									<div class="beizhu">
										<textarea class="layui-textarea" name="remark" id="remark"
											style="width: 600px;"></textarea>
											<button onclick="saveInfo()" class="button" style="float:right" type="button">保存</button>
									</div>
								</div>
								
							</div>
						</div>
					</form>
				</div>
				

			</div>
		</div>
	</div>
</body>
</html>
