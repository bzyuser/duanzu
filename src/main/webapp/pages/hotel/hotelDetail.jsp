<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>房屋</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
		<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" href="../../css/font.css">
		<link rel="stylesheet" href="../../css/xadmin.css">
		<link rel="stylesheet" type="text/css" href="../../css/hotel.css/style.css" />
		<!--<link rel="stylesheet" type="text/css" href="../../iconfont/iconfont.css">-->
		<link href="../../css/hotel.css/foundation-datepicker.css" rel="stylesheet" type="text/css">
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

		<script type="text/javascript" src="../../js/jquery.min.js"></script>
		<script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
		<script type="text/javascript" src="../../js/xadmin.js"></script>
		<script type="text/javascript" src="../../iconfont/iconfont.js"></script>
		<script src="../../js/hotel.js/foundation-datepicker.js"></script>
		<script src="../../js/hotel.js/foundation-datepicker.zh-CN.js"></script>
		<script src="../../js/hotel.js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/hotel.js/modernizr.custom.79639.js"></script>
		<!--<noscript><link rel="stylesheet" type="text/css" href="css/noJS.css" /></noscript>-->
		
		<script src="../../js/js/index_login_register.js"></script>
		<script type="text/javascript" src="../../js/js/hotelDetail.js"></script>
		<script type="text/javascript" src="../../js/js/util.js"></script>
		
		<style>
			.layui-bg-gray{
				border-top: 6px solid lightgoldenrodyellow;
			}
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
			/*.fangyuanInfo{
				float:left;
				margin-top: 8px;
				margin-left: 730px;
				background: orange;
				font-size: 30px;
			}*/
			
			.banner {
				width: 1366px;
				height: 680px;
				background: lightgoldenrodyellow;
				margin-top: 20px;
			}
			.part1 {
				width: 750px;
				height: 645px;
				background: white;
				float: left;
				margin-left: 100px;
				margin-top: 20px;
			}
			.picture {
				/*border: 2px solid rad;*/
				float: left;
				margin-left: 50px;
				margin-top: 15px;
			}
			/*.picture h2{
				font-size: 24px;
			}*/
			.location {
				float: left;
				margin-top: 15px;
			}
			.pic {
				float: left;
				margin-top: 15px;
			}
			.part2 {
				width: 340px;
				height: 500px;
				background: white;
				float: left;
				margin-left: 50px;
				position: fixed;
				left: 850px;
				bottom:400px;
				top: 100px;
			}
			.pric {
				height: 50px;
				width: 340px;
				background: lightyellow;
			}
			#prices {
				float: left;
				margin-top: 10px;
				margin-left: 20px;
			}
			.search_rent {
				height: 66px;
				width: 340px;
				background: white;
				float: left;
				margin-top: 15px;
				/*margin-left: 50px;*/
			}
			.icon1 {
				width: 2em;
				height: 2em;
				vertical-align: -0.15em;
				fill: currentColor;
				overflow: hidden;
				float: right;
				margin-right: 60px;
				margin-top: 3px;
			}
			.icon2 {
				width: 2em;
				height: 2em;
				vertical-align: -0.15em;
				fill: currentColor;
				overflow: hidden;
				float: right;
				margin-right: -58px;
				margin-top: -8px;
			}
			.bossInfo{
				float: left;
				margin-top: 250px;
				text-align: center;
				background: lightyellow;
				width: 100%;
			}
			
			.search_time {
				width: 300px;
				float: left;
				margin-left: 20px;
				margin-top: 15px;
			}
			/*.btn-group{
				float: left;
				margin-top: -15px;
				margin-left: 10px;
			}*/
			.wrapper-demo {
				float: left;
				margin-top: -20px;
				margin-left: 15px;
			}
			.totalPrice {
				float: left;
				margin-top: 30px;
				margin-left: -195px;
			}
			.button-order {
				float: left;
				margin-top: 10px;
				margin-left: 10px;
			}
			
			.main {
				width: 1366px;
				height: 1900px;
				background: lightgoldenrodyellow;
				margin-top: 5px;
			}
			.hotel_info {
				width: 750px;
				/* height: 1850px; */
				background: white;
				float: left;
				margin-left: 100px;
				margin-top: 18px;
			}
			.sheshi {
				/*border: 2px solid red;*/
				float: left;
				margin-left: 50px;
				margin-top: 15px;
				width: 645px;
			}
			.sheshi-left {
				width: 100px;
			}
			.sheshi-right {
				/*border: 1px solid yellow;*/
				width: 525px;
				
				float: right;
				margin-top: -142px;
			}
			.bianlisheshi {
				margin-left: 5px;
			}
			.sheshiDisplay{
				height: 55px;
			}
			
			.line{
				/*float: left;*/
				margin-top: 10px;
			}
			.xinxi{
				/*border:  2px solid yellow;*/
				float: left;
				margin-left: 50px;
				margin-top: 0px;
				height: 160px;
				width: 645px;
			}
			.xinxi-left{
				width: 100px;
			}
			.xinxi-left p{
				text-align: center;
			}
			.xinxi-right{
				/*border: 1px solid red;*/
				width: 525px;
				height: 160px;
				float: right;
				margin-top: -142px;
			}
			.xinxi-right .td{
				width: 260px;
				overflow: hidden;
				font-size: 14px;
			}
			
			.jieshao{
				/* border:  2px solid red; */
				float: left;
				margin-left: 50px;
				margin-top: 0px;
				height: 150px;
				width: 645px;
			}
			.jieshao-left{
				width: 100px;
			}
			.jieshao-left p{
				text-align: center;
			}
			.jieshao-right{
				/* border: 1px solid yellow; */
				width: 525px;
				height: 150px;
				float: right;
				margin-top: -142px;
			}
			.jieshao-right > p{
				font-size: 14px;
				line-height: 30px;
			}
			
			.jiaotong{
				/* border:  2px solid red; */
				float: left;
				margin-left: 50px;
				margin-top: 0px;
				height: 150px;
				width: 645px;
			}
			.jiaotong-left{
				width: 100px;
				/*text-align: center;*/
			}
			.jiaotong-left p{
				text-align: center;
			}
			.jiaotong-right{
				/* border: 1px solid yellow;*/
				width: 525px;
				height: 150px;
				float: right;
				margin-top: -142px;
			}
			.jiaotong-right > p{
				font-size: 14px;
				line-height: 30px;
			}
			
			.zhoubian{
				/* border:  2px solid red; */
				/*float: left;*/
				margin-left: 50px;
				/*margin-top: 0px;*/
				height: 150px;
				width: 645px;
				position: relative;
			}
			.zhoubian-left{
				width: 100px;
				/*height: 150px;*/
				/*position: absolute;*/
			}
			.zhoubian-left p {
				/*height: 150px;*/
				line-height: 150px;
				text-align: center;
			}
			.zhoubian-right{
				/* border: 1px solid yellow;*/
				width: 525px;
				height: 150px;
				position: absolute;
				left: 113px;
				float: right;
				margin-top: -163px;
				line-height: 150px;
				/*float: right;
				margin-top: -75px;*/	
			}
			.text{
				display: inline-block;
				vertical-align: middle;
				font-size: 14px;
				line-height: 22px;
				letter-spacing: 2px;
				margin: 9px;
			}
			
			.qita{
				/* border:  2px solid red; */
				/*float: left;*/
				margin-left: 50px;
				/*margin-top: 0px;*/
				height: 150px;
				width: 645px;
				position: relative;
			}
			.qita-left{
				width: 100px;
				/*height: 150px;*/
				/*position: absolute;*/
			}
			.qita-left p {
				/*height: 150px;*/
				line-height: 150px;
				text-align: center;
			}
			.qita-right{
				/* border: 1px solid yellow; */
				width: 525px;
				height: 150px;
				position: absolute;
				left: 113px;
				float: right;
				margin-top: -163px;	
			}
			.qita-right p{
				font-size: 14px;
				line-height: 30px;
			}

			.xuzhi{
				/* border:  2px solid red; */
				float: left;
				margin-left: 50px;
				margin-top: 0px;
				height: 160px;
				width: 645px;
			}
			.xuzhi td{
				width: 250px;
				line-height: 20px;
				font-size: 14px;
			}
		
			.shiyong{
			  /*	border:  2px solid red; */
				float: left;
				margin-left: 50px;
				margin-top: 0px;
				height: 160px;
				width: 645px;
			}
			
			.footer{
				float: left;
				height: 100px;
				width: 1366px;
				background: lightgrey;	
				position: relative;
				/*margin-left: 50px;*/
				margin-top: 10px;
			}
		#nav2 {
			float:right;
			margin-right:30px;
			
		}
		#nav2 dl{
			background:none;
		}
		
		</style>
		<script type="text/javascript">
			var house_id;
			<%
				String house_id = request.getParameter("house_id");
			%>
			house_id = "<%=house_id%>";
			$(function(){
				hasSession();
				$("#house_id").text(house_id);
				// 调用查询
				findHouseDetail(house_id);
			})
			
		</script>
		
	</head>

	<body>
		<div class="header">
			<div class="logo"><img onclick="toIndex();" style="cursor:pointer;" src="../../images/hotel/logo.png" alt="logo" width="50px" height="50px" /></div>
			<div class="name">
				<p>
					Keda短租
				</p>
			</div>
			
			<div id="nav2">
				<input type="hidden" id="session" value="${user.userId}"/>
				<ul class="layui-nav" style="background:none;" style="display: none">
					
					<li class="layui-nav-item"><a>欢迎 ${user.userName}</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="/duanzu/pages/hotel/fangdongManager.jsp">我是房东</a>
							</dd>
							<dd>
								<a href="/duanzu/pages/hotel/zukeManager.jsp">我是租客</a>
							</dd>
							
						</dl>
					</li>	
					<li class="layui-nav-item"><a>个人信息</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="/duanzu/pages/hotel/zhanghuManager.jsp">修改信息</a>
							</dd>
							<dd>
								<a onclick="exit();" style="cursor:pointer;">退出登录</a>
							</dd>	
						</dl>
					</li>
				</ul>
			</div>

			<div class="nav" id="nav1" style="display: none">
				<button type="button" onclick="toLogin()"
					class="layui-btn layui-btn-lg layui-btn-primary layui-btn-radius">登录</button>
				<button type="button" onclick="toRegister()"
					class="layui-btn layui-btn-lg layui-btn-primary layui-btn-radius">注册</button>
			</div>
			
			<!--<div class="fangyuanInfo">
				<button class="layui-btn layui-btn-lg layui-btn-primary">房源信息</button>
			</div>-->
		</div>
		<div class="banner">
			<div class="part1">
				<div class="picture">
					<div class="title">
						<h2 style="font-size: 24px;" id="house_name"></h2>
					</div>
					<div class="location">
						<p style="font-size: 18px; font-weight: normal;">
							<svg class="icon" aria-hidden="true">
								<use xlink:href="#icon-location"></use>
							</svg>
							<a id="address"></a></p>
					</div>
					<div class="pic">
						<img id="houseImg" src="" alt="短租图片" style="width: 640px; height: 480px;" />
					</div>
				</div>
			</div>
			<div class="part2">
				<div class="price">
					<div class="pric">
						<p style="font-size: 24px;" id="prices"><span style="color: orange; font-size: 26px;" id="day_price"></span>元/日均</p>
					</div>
					<div class="select">
						<div class="search_rent">
							<div class="search_time">
								<table class="table" height="20px" width="30px">
									<tr>
										<span style="font-size: 16px; font-weight: normal;">入住: </span>
										<input type="text" class="span2" value="" id="dpd1" placeholder="请选择入住时间" style="font-weight: normal; line-height: 30px;">
									</tr>
									<svg class="icon1" aria-hidden="true">
										<use xlink:href="#icon-rili"></use>
									</svg>
									<tr>
										<span style="font-size: 16px; font-weight: normal;"><br /><br />退房: </span>
										<input type="text" class="span2" value="" id="dpd2" placeholder="请选择离开时间" onchange="calculTotalPrice();" style="font-weight: normal; line-height: 30px;">
									</tr>
									<svg class="icon1 " aria-hidden="true ">
										<use xlink:href="#icon-rili "></use>
									</svg>
								</table>
								<script>
									var nowTemp = new Date();
									var now = new Date(nowTemp.getFullYear(), nowTemp.getMonth(), nowTemp.getDate(), 0, 0, 0, 0);
									var checkin = $('#dpd1').fdatepicker({
										onRender: function (date) {
											return date.valueOf() < now.valueOf() ? 'disabled' : '';
										}
									}).on('changeDate', function (ev) {
										if (ev.date.valueOf() > checkout.date.valueOf()) {
											var newDate = new Date(ev.date)
											newDate.setDate(newDate.getDate() + 1);
											checkout.update(newDate);
										}
										checkin.hide();
										$('#dpd2')[0].focus();
									}).data('datepicker');
									var checkout = $('#dpd2').fdatepicker({
										onRender: function (date) {
											return date.valueOf() <= checkin.date.valueOf() ? 'disabled' : '';
										}
									}).on('changeDate', function (ev) {
										checkout.hide();
									}).data('datepicker');
								</script>
							</div>
							<div class="wrapper-demo ">
								<div id="dd" class="wrapper-dropdown-3" tabindex="1 ">
									<span id="personNum">人数</span>
									<ul class="dropdown" id="peopleNum">
										<!-- 
										<li><a href="# ">1人</a></li>
										<li><a href="# ">2人</a></li>
										<li><a href="# ">3人</a></li>
										<li><a href="# ">4人</a></li>
										<li><a href="# ">5人</a></li>
										<li><a href="# ">6人</a></li>
										<li><a href="# ">7人</a></li>
										<li><a href="# ">8人</a></li>
										<li><a href="# ">9人</a></li>
										<li><a href="# ">10人及以上</a></li>
										 -->
									</ul>
									<svg class="icon2 " aria-hidden="true ">
										<use xlink:href="#icon-fangwuxinxi_ruzhuren "></use>
									</svg>
								</div>
								
							<script type="text/javascript">
								function DropDown(el) {
									this.dd = el;
									this.placeholder = this.dd.children('span');
									this.opts = this.dd.find('ul.dropdown > li');
									this.val = '';
									this.index = -1;
									this.initEvents();
								}
							
								DropDown.prototype = {
									initEvents: function() {
										var obj = this;
										obj.dd.on('click', function(event) {
											$(this).toggleClass('active');
											return false;
										});
										obj.opts.on('click', function() {
											var opt = $(this);
											obj.val = opt.text();
											obj.index = opt.index();
											obj.placeholder.text(obj.val);
										});
									},
							
									getValue: function() {
										return this.val;
									},
									getIndex: function() {
										return this.index;
									}
							
								}
							
								$(function() {
									var dd = new DropDown($('#dd'));
									$(document).click(function() {
										// all dropdowns
										$('.wrapper-dropdown-3').removeClass('active');
									});
								});
							</script>
			
							​</div>
							<div class="totalPrice ">
								<p style="font-size: 20px; ">总计：<span style="color: lightblue;font-size: 22px; " id="totalPrice"></span></p>
							</div>
							<div class="button-order">
								<span style="display:none;" id="house_id"></span>
								<button type="button" onclick="toSubmit();" style="height: 40px;width: 300px;background: ; ">立即预定</button>
							</div> 
						</div>
					</div>
					<div class="bossInfo">
						<h2 id="hostName"></h2>
						<p style="color: orange;font-size: 24px;" id="hostPhone"></p>
					</div>
				</div>
			</div>
		</div>
		<div class="main ">
			<div class="hotel_info ">
				<div class="sheshi ">
					<div class="sheshi-left ">
						<!--<svg class="icon " aria-hidden="true " style="height: 50px; width: 50px; " id="icon00 ">
						  	<use xlink:href="#icon-sheshi "></use>
						</svg>-->
						<svg class="icon00" aria-hidden="true">
							<use xlink:href="#icon-sheshi"></use>
						</svg>
						<p style="font-size: 22px; font-weight: bolder;"><br />便利设施</p>
					</div>
					
					
					
					<div class="sheshi-right">
						<div class="bianlisheshi " width="540px" id="sheshiInfo">
								<!-- 
							<tr class="sheshiDisplay">
							
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 16px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay">
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin"></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay">
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay">
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay">
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay">
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay">
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay">
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay" height="80px ">
								<td width="180px " height="30px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							<tr class="sheshiDisplay">
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-xiyuyongpin "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;洗浴用品</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
								<td width="180px ">
									<svg class="icon " aria-hidden="true " style="width: 30px; height: 30px; ">
									  	<use xlink:href="#icon-tuoxie "></use>
									  	<span style="font-size: 18px; ">&nbsp;&nbsp;拖鞋</span>
									</svg>
								</td>
							</tr>
							
							 -->
							
						</div>
					</div>
					
					
					
					
				</div>
				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<div class="xinxi ">
					<div class="xinxi-left">
						<svg class="icon00" aria-hidden="true">
							<use xlink:href="#icon-fangwuxinxi"></use>
						</svg>
						<p style="font-size: 22px; font-weight: bolder;"><br />房屋信息</p>
					</div>
					<div class="xinxi-right">
						<table style="font-size: 20px;line-height: 40px;width: 520;">
							<tr style="line-width: 260px;">
								<td class="td" id="house_type"></td>
								<td class="td" id="toilet_num"></td>
							</tr>
							<tr>
								<td class="td" id="rent_out_type"></td>
								<td class="td" id="available_people_num"></td>
							</tr>
							<tr>
								<td class="td" id="home_num"></td>
								<td class="td" id="extraAddPeopleNum"></td>
							</tr>
							<tr>
								<td class="td" id="bed_num"></td>
								<td class="td" id="louceng"></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<div class="jieshao ">
					<div class="jieshao-left">
						<svg class="icon00" aria-hidden="true">
							<use xlink:href="#icon-fangwuxinxi1"></use>
						</svg>
						<p style="font-size: 22px; font-weight: bolder;"><br />房屋介绍</p>
					</div>
					<div class="jieshao-right">
						<p id="houseDesc"></p>
					</div>
				</div>
				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<div class="jiaotong ">
					<div class="jiaotong-left">
						<svg class="icon00" aria-hidden="true">
							<use xlink:href="#icon-jiaotong"></use>
						</svg>
						<p style="font-size: 22px; font-weight: bolder;"><br />交通情况</p>
					</div>
					<div class="jiaotong-right">
						<p id="traffic">地铁：靠近地铁9号线泗泾站，有车接送，提前联系房东<br>公交：松莘线B线（泗砖南路站）<br>驾车：沪闵高架路-杭州方向-中春路下-莘砖公路右转-泗砖南路左转-目的地<br>高速公路：G15莘砖公路下-左转-泗砖南路左转-目的地</p>
					</div>
				</div>
				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<div class="zhoubian ">
					<div class="zhoubian-left">
						<p style="font-size: 22px; font-weight: bolder;">周边情况</p>
					</div>
					<div class="zhoubian-right">
						<span class="text" id="rimDesc"></span>
					</div>
				</div>
				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<div class="qita ">
					<div class="qita-left">
						<p style="font-size: 22px; font-weight: bolder;">其他</p>
					</div>
					<div class="qita-right">
						<p id="otherMsg"></p>
					</div>				
				</div>
				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<div class="xuzhi">
					<h3>入住须知</h3>
					<table style="margin-left:60px;">
						<tr>
							<td id="checkInTime"></td>
							<td id="cleanPrice"></td>
						</tr>
						<tr>
							<td id="lessDay"></td>
							<td>接受外宾：接受</td>
						</tr>
						<tr>
							<td id="checkOutTime"></td>
							<td id="cashPledge"></td>
						</tr>
						<tr>
							<td>发票：提供</td>
							<td>是否与房东共住：否</td>
						</tr>
						
						
						
					</table>
				</div>
				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<div class="shiyong">
					<p style="font-size: 22px; font-weight: bolder;">房屋使用规则</p>
					<p style="font-size: 14px;line-height: 30px;margin-left:60px;">* 请带好您的有效身份证件办理入住。<br>* 请爱护房间内设施和物品。<br>* 请勿将房间用于违法活动。</p>
				</div>
				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<!--<div class="benfangpingjia "></div>-->
			</div>
		</div>
		<div class="footer ">
			<p style="text-align: center;">许可证号：晋ICP证180509号    安全联盟   太原科大信息科技有限公司</p>
			<p style="text-align: center;">京公网安备 201420020104号</p>
		</div>
	
	</body>
	

</html>