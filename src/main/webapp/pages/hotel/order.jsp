<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>订单确认-科大短租</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
		<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" href="../../css/font.css">
		<link rel="stylesheet" href="../../css/xadmin.css">
		<link rel="stylesheet" type="text/css" href="../../css/hotel.css/style.css" />
		<!--<link rel="stylesheet" type="text/css" href="../../iconfont/iconfont.css">-->
		<!--<link href="../../css/hotel.css/foundation-datepicker.css" rel="stylesheet" type="text/css">-->
		<!--<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">-->

		<script type="text/javascript" src="../../js/jquery.min.js"></script>
		<script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
		<script type="text/javascript" src="../../js/xadmin.js"></script>
		<script type="text/javascript" src="../../iconfont/iconfont.js"></script>
		<!--<script src="../../js/hotel.js/foundation-datepicker.js"></script>-->
		<!--<script src="../../js/hotel.js/foundation-datepicker.zh-CN.js"></script>-->
		<script src="../../js/hotel.js/bootstrap.min.js"></script>
		<!--<script type="text/javascript" src="../../js/hotel.js/modernizr.custom.79639.js"></script>-->
		<!--<noscript><link rel="stylesheet" type="text/css" href="css/noJS.css" /></noscript>-->
		
		<script type="text/javascript" src="../../js/js/order.js"></script>
		
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
				margin-right: 100px;
				margin-top: 8px;
			}
		
			.banner {
				width: 1366px;
				height: 60px;
				background: lightgoldenrodyellow;
				margin-top: 20px;
			}
			.myorder{
				width: 1250px;
				height: 50px;
				background: lightgray;
				float: left;
				margin-left: 50px;
				margin-top: 5px;
			}
			.ord{
				float: left;
				margin-left: 20px;
				font-size: 30px;
				font-weight: bolder;
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
			.main{
				width: 1366px;
				height:680px;
				/*background: lightgoldenrodyellow;*/
				margin-top: 5px;
			}
			.orderInfo {
				width: 1250px;
				/*height: 650px;*/
				background: white;
				float: left;
				margin-left: 50px;
				margin-top: 5px;
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
			.xinxitable{
				width:1100px;
				height: 100px;
				border: 2px solid lightgoldenrodyellow;
				float: left;
				margin-top: 20px;
				margin-left: 80px;
			}
			.jibentable td{
				height: 30px;
				width: 200px;
				text-align: center;
			}
			
			.userInfo{
				width: 1250px;
				height: 400px;
				background: white;
				float: left;
				margin-top: 5px;
			}
			.usertable{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 342px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
			}
			
			/*.user{
				float: left;
				border: 1px solid yellow;
				height:500px;
				width: 1000px;
				margin-left: 50px;
				margin-top: 20px;
			}*/
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
				float: left;
				height:30px;
				width: 300px;
			}
			.beizhu{
				width: 500px;
				height: 50px;
				float: left;
			}
			
			.submit{
				float: left;
				height: 50px;
				width: 100%;
				/*margin: 0 auto;*/
				margin-left: 500px;
			}
			
			.footer{
				float: left;
				height: 80px;
				width: 1366px;
				background: lightgrey;	
				/*position: relative;*/
				/*margin-left: 50px;*/
				margin-top: 5px;
			}
			
		</style>
	</head>
	<body>
		<div class="header">
			<div class="logo"><img src="../../images/hotel/logo.png" alt="logo" width="50px" height="50px" /></div>
			<div class="name">
				<p>
					Keda短租
				</p>
			</div>
			<div class="nav">
				<ul class="layui-nav">
				  	<li class="dropDownLi" style="border: 1px solid rgb(255, 255, 255);">
			            <a class="dropDownTrigger" style="background-position: right 12px;">我是租客</a>
			            <dl class="TopullDown" style="display: none;">
			                <dd><a href="#" target="_self">退出</a></dd>
			            </dl>
        			</li>
				</ul>
			</div>
			
		</div>
		<div class="banner">
			<div class="myorder">
				<span class="ord">>&nbsp;&nbsp;&nbsp;我的订单</span>
			</div>
		</div>
		<div class="main">
			<div class="orderInfo">
				<div class="jibenInfo">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">基本信息</div>
					<div class="line"></div>
					<div class="xinxitable">
						<table class="jibentable" border="1px" cellspacing="0">
							<tr class="xinxititle" style="height: 50px; background: lightgoldenrodyellow; font-weight: bolder;">
								<td>入住时间</td>
								<td>退房时间</td>
								<td>入住天数</td>
								<td>入住人数</td>
								<td>预定套数</td>
								<td>单价</td>
								<td>总价</td>
							</tr>
							<tr class="xinxicontent" style="height: 50px;">
								<td id="startTime">${param.startTime }</td>
								<td id="endTime">${param.endTime }</td>
								<td id="checkIndays"></td>
								<td><a id="check_in_people_num">${param.personNum }</a>人</td>
								<td>1套</td>
								<td>￥<a id="price">${param.day_price }</a>元</td>
								<td>￥<a id="totalPrice"></a>元</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="userInfo">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">用户信息</div>
					<div class="line"></div>
					
					<form id="otherInfo" method="post">
						<!-- 存放 同住人信息，用于表单提交 -->
					</form>
					<div class="userInfo" style="height:160px;"></div>
					<!-- 
					<div class="usertable">
						<div class="box1">
						    <div class="text2"><p style="font-size: 20px;">姓名：</p></div>
						    <div class="shurukuang">
						    	<input type="text" class="form-control" placeholder="请输入用户姓名" id="name" />
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 20px;">证件号码：</p></div>
						    <div class="shurukuang">
						    	<input type="text" class="form-control" placeholder="请输入身份证号" id="IDcard" maxlength="18"/>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 20px;">手机号码：</p></div>
						    <div class="shurukuang">
						    	<input type="text" class="form-control" placeholder="请输入手机号码" id="phone" maxlength="11"/>
						    </div>
					    </div>
					    <div class="box1">
					    	<div class="text2"><p style="font-size: 20px;">备注：</p></div>
					    	<div class="beizhu">
					      		<textarea placeholder="请输入内容" class="layui-textarea" name="desc"></textarea>
					    	</div>
					  	</div>
					</div>
					
					 -->	
					
					
				</div>
				
				<!-- 
				<div class="submit">
					<button type="button" onclick="submitOrder();" style="height: 35px;width: 295px; background: lightgreen;">提交订单</button>
				</div>
				 -->
				 
				<!-- 放需要传的订单数据，用于表单提交 -->
				<form action="" method="post" id="orderInfo">
					<input type="hidden" name="house_id" value="${param.house_id }">
					<input type="hidden" name="check_in_time" value="${param.startTime }">
					<input type="hidden" name="check_out_time" value="${param.endTime }">
					<input type="hidden" name="check_in_days" id="check_in_days" value="">
					<input type="hidden" name="check_in_people_num" value="${param.personNum }">
					<input type="hidden" name="total_price" id="total_price" value="">
					<input type="hidden" name="user_id" value="${userId }">
					<input type="hidden" name="name" value="${user.name }">
					<input type="hidden" name="id_card" value="${user.remark }">
					<input type="hidden" name="phone" value="${user.phone }">
					<input type="hidden" name="status" value="待入住">
				</form>
				
			
			</div>
		</div>
		
		<div class="footer">	
			<p style="text-align: center;">许可证号：晋ICP证180509号    安全联盟   太原科大信息科技有限公司</p>
			<p style="text-align: center;text-line:5px;">京公网安备 201420020104号</p>
			<div class="submit">
				<button type="button" onclick="submitOrder();" style="height: 35px;width: 295px; background: lightgreen;margin-top:-120px;">提交订单</button>
			</div>
		</div>
	</body>
</html>
