<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>租客管理-科大短租</title>
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
		<!--<script class="resources library" src="../../js/hotel.js/area.js" type="text/javascript"></script>-->
		
		<script type="text/javascript" src="../../js/js/zukeManager.js"></script>
		<script type="text/javascript" src="../../lib/layui/layui.js"
			charset="utf-8"></script>
		<script type="text/javascript" src="../../js/xadmin.js"></script>
		
		
		
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
				height:1000px;
				background: lightgoldenrodyellow;
				margin-top: 5px;
			}
			.mimaInfo,.detailInfo{
				width: 1250px;
				height: 800px;
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
			.type00{
				height: 30px;
				width: 100px;
			}
			.list-group{
				height: 250px;
				width: 1200px;
				float: left;
				margin-left: 10px;
			}
			.list-title td{
				height: 50px;
				width: 171px;
				font-size: 18px;
				text-align: center;
			}
			.list-content td{
				height: 150px;
				width: 171px;
				font-size: 18px;
				text-align: center;
			}
			.list-content td p{
				font-size: 15px;
			}
			.state{
				height: 20px;
				width: 50px;
			/*	border: 1px solid red; */
				background: red;
				float: left;
				margin-left: 60px;
			}
			.delete{
				text-decoration: underline;
			}
		</style>
	</head>
	<body>
	<!-- 从session获取租客id -->
	<input type="hidden" id="user_id" value="${userId }">
	
		<div class="header">
			<div class="logo"><img src="../../images/hotel/logo.png" alt="logo" width="50px" height="50px" /></div>
			<div class="name">
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
				<span class="username">Hi,陈洁</span>
				<div class="exit"><a href="#">退出登录</a></div>
			</div>
			
		</div>
		<div class="banner">
			<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
			  	<ul class="layui-tab-title">
				    <li class="layui-this">订单管理</li>
				    <li>其他联系人</li>
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
											<div class="order0">
										    	<select class="type00">
										    		<option value="1">入住时间 </option>
										    		<option value="2">本周</option>
										    		<option value="3">本月</option>
										    		<option value="4">最近三个月</option>
										    		<option value="5">更早</option>
										    	</select>
										    </div>
										</td>
										<td>房间金额</td>
										<td>房东</td>
										<td>
											<div class="order0">
										    	<select class="type00" value="订单状态" id="orderStatus" onchange="searchOrderInfo();">
										    		<option value="">所有订单 </option>
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
									
									
									<!-- 
									
									<tr class="list-content">
										<td>63635624</td>
										<td><p style="text-align: left;color: lightblue;">高级公寓 好友小聚休闲度假全家出游</p><p style="text-align: left;color: lightgray;">北京昌平区北七家王府公寓（温都水城，王府中西医）</p></td>
										<td><p>1天*1套</p><p style="color: lightgray;">2018-05-23入住<br>2018-05-24退房</p></td>
										<td><p>订单总金额￥780</p></td>
										<td><p>朱女士</p></td>
										<td><div class="state">取消</div></td>
										<td><div class="delete"><a href="#">删除</a></div></td>
									</tr>
									<tr class="list-content">
										<td>63635624</td>
										<td><p style="text-align: left;color: lightblue;">高级公寓 好友小聚休闲度假全家出游</p><p style="text-align: left;color: lightgray;">北京昌平区北七家王府公寓（温都水城，王府中西医）</p></td>
										<td><p>1天*1套</p><p style="color: lightgray;">2018-05-23入住<br>2018-05-24退房</p></td>
										<td><p>订单总金额￥780</p></td>
										<td><p>朱女士</p></td>
										<td><div class="state">取消</div></td>
										<td><div class="delete"><a href="#">删除</a></div></td>
									</tr>
									<tr class="list-content">
										<td>63635624</td>
										<td><p style="text-align: left;color: lightblue;">高级公寓 好友小聚休闲度假全家出游</p><p style="text-align: left;color: lightgray;">北京昌平区北七家王府公寓（温都水城，王府中西医）</p></td>
										<td><p>1天*1套</p><p style="color: lightgray;">2018-05-23入住<br>2018-05-24退房</p></td>
										<td><p>订单总金额￥780</p></td>
										<td><p>朱女士</p></td>
										<td><div class="state">取消</div></td>
										<td><div class="delete"><a href="#">删除</a></div></td>
									</tr>
									
									 -->
									
									
								</table>
							</div>
						</div>
					</div>
					</div>
				    <div class="layui-tab-item">
				    	<div class="mimaInfo">
							<div class="kuai"></div>
							<div class="text1" style="font-size: 25px;">其他联系人</div>
							<div class="line"></div>
							<div class="mima">
								<div class="box1">
								    <div class="text2"><p style="font-size: 20px;">姓名：</p></div>
								    <div class="shurukuang">
								    	<input type="text" class="form-control"/>
								    </div>
							    </div>
							    <div class="box1">
								    <div class="text2"><p style="font-size: 20px;">联系电话：</p></div>
								    <div class="shurukuang">
								    	<input type="text" class="form-control" maxlength="11"/>
								    </div>
							    </div>
							</div>
						</div>
				    </div>
			  	</div>
			</div> 
		</div>
		
		
	</body>
</html>
