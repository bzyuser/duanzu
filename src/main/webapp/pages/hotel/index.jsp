<%@page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="UTF-8"%>
<%@include file="/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="../../css/font.css">
<link rel="stylesheet" href="../../css/xadmin.css">
<link rel="stylesheet" href="../../css/hotel.css/kuCity.css">
<link href="../../css/hotel.css/foundation-datepicker.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../../css/hotel.css/example.css">
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript" src="../../js/xadmin.js"></script>
<script src="../../js/hotel.js/moment.min.js" type="text/javascript"></script>
<script src="../../js/hotel.js/demo.js"></script>
<!--<script src="http://www.jq22.com/jquery/jquery-1.9.1.js"></script>-->
<script src="../../js/hotel.js/kuCity.js"></script>
<script src="../../js/hotel.js/sHover.js"></script>
<script src="../../js/hotel.js/sHover.min.js"></script>
<script src="../../js/hotel.js/foundation-datepicker.js"></script>
<script src="../../js/hotel.js/foundation-datepicker.zh-CN.js"></script>
<script src="../../js/hotel.js/bootstrap.min.js"></script>

<script src="../../js/js/index_login_register.js"></script>
<script type="text/javascript" src="../../js/js/index.js"></script>

<script type="text/javascript" src="../../js/js/util.js"></script>


<script type="text/javascript">
	
</script>
<style>
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
/************************************轮播样式*******************************/
.layui-carousel {
	position: relative;
}

.part1 {
	position: absolute;
	margin-top: -590px;
	width: 1366px;
	height: 60px;
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
	float: left;
	margin-left: 1000px;
	margin-top: -25px;
}

.description {
	float: left;
	margin-top: -310px;
	margin-left: 580px;
	position: absolute;
}

.part2 {
	position: absolute;
	margin-top: -85px;
	height: 310px;
	width: 1399px;
}

.search_rent {
	height: 66px;
	width: 1250px;
	/*background: white;*/
	float: left;
	margin-top: 15px;
	margin-left: 50px;
}

.search_city {
	float: left;
	margin-left: 200px;
	margin-top: 18px;
}

.search_time {
	float: left;
	margin-left: 5px;
	margin-top: 18px;
	padding-left: 5px;
}

.searchbutton {
	float: left;
	margin-top: 18px;
	margin-left: 10px;
}

.search {
	margin-left: 20px;
	padding: 7px;
	border: 1px solid rgb(207, 222, 229);
	border-radius: 2px;
	width: 300px;
	float: left;
	margin: 0 auto;
}

.demo {
	margin: 30px 0;
}

/************************************banner样式*******************************/
.banner {
	background-color: lightgray;
	height: 100px;
}

.banner h2 {
	font-size: 25px;
	text-align: center;
}

.banner p {
	font-size: 15px;
	text-align: center;
}

.ban_text {
	width: 1200px;
	height: 50px;
}

.ban_text1 {
	width: 290px;
	height: 50px;
	float: left;
	margin-left: 85px;
	margin-top: 25px;
}

.ban_text2 {
	width: 290px;
	height: 50px;
	float: left;
	margin-top: 25px;
}

.ban_text3 {
	width: 290px;
	height: 50px;
	float: left;
	margin-top: 25px;
}

.ban_text4 {
	width: 290px;
	height: 50px;
	float: right;
	margin-top: -50px;
	margin-right: 0px;
}

/************************************main样式*******************************/
.main {
	background: white;
	height: 1550px;
	width: 1366px;
}
/************************************热门城市样式*******************************/
.main01_city {
	height: 520px;
	width: 1366px;
}

.city_title {
	width: 240px;
	height: 80px;
	text-align: center;
	margin: 40px auto;
}

.city_title span {
	font-size: 30px;
	font-weight: bolder;
}

.city_title p {
	font-size: 20px;
}

.city_box {
	width: 1319px;
	height: 900px;
	padding-left: 30px;
	margin-top: -30px;
}

.city_box1 {
	width: 780px;
	height: 280px;
	float: left;
	margin: 5px 50px;
	position: relative;
}

.chengdu {
	float: left;
	width: 380px;
	height: 280px;
	margin-left: -30px;
	margin-top: 5px;
	margin-bottom: 5px;
}

.city_box2 {
	width: 340px;
	height: 280px;
	float: left;
	margin: 5px 10px;
	padding-left: 40px;
}

.city_box1 .city_pic_text {
	float: left;
	margin-top: -160px;
	position: absolute;
	width: 160px;
	height: 65px;
	text-align: center;
	margin-left: 310px;
}

.city_pic_text {
	float: left;
	margin-top: -160px;
	position: absolute;
	width: 160px;
	height: 65px;
	text-align: center;
}

.city_box1 .city_pic_text {
	margin-left: 310px;
}

.city_box2 .city_pic_text {
	margin-left: 110px;
}

.chengdu .city_pic_text {
	margin-left: 110px;
}

.city_pic1_text {
	font-size: 30px;
	color: white;
	font-family: "微软雅黑";
}

.city_text_describe {
	font-size: 20px;
	color: white;
	font-family: "微软雅黑";
}

/************************************推荐短租公寓样式*******************************/
.main02_hotel {
	background: white;
	height: 700px;
	width: 1366px;
	margin-top: 490px;
}

.hotel_title {
	height: 70px;
	width: 1366px;
	text-align: center;
}

.title_header {
	font-size: 30px;
	font-weight: bolder;
}

.title_footer {
	font-size: 20px;
}

.hotel_pic {
	height: 640px;
	margin-top: -20px;
}

.username {
	float: left;
	margin-left: -60px;
	font-size: 18px;
	color: lightblue;
}

.footer {
	float: left;
	height: 50px;
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
.layui-nav .layui-nav-item a{
	color:#989696;
}
#nav2 dl{
	background:none;
}
</style>
</head>
<body>
	<!-----------------------------header部分--------------------------->
	<div class="header">
		<!--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
		  <legend>填充轮播元素 - 以图片为例</legend>
		</fieldset>    -->
		<div class="layui-carousel" id="test10">
			<div carousel-item="">
				<div>
					<img src="../../images/hotel/header00.jpg">
				</div>
				<div>
					<img src="../../images/hotel/header02.jpg">
				</div>
				<div>
					<img src="../../images/hotel/header01.jpg">
				</div>
			</div>
		</div>
		<script>
			layui.use([ 'carousel', 'form' ], function() {
				var carousel = layui.carousel, form = layui.form;

				//图片轮播
				carousel.render({
					elem : '#test10',
					width : '1366px',
					height : '600px',
					interval : 5000
				});

				//其它示例
				$('.demoTest .layui-btn').on('click', function() {
					var othis = $(this), type = othis.data('type');
					active[type] ? active[type].call(this, othis) : '';
				});
			});
		</script>

		<!------------------------------logo和导航部分------------------------->
		<div class="part1">
			<div class="logo">
				<img src="../../images/hotel/logo.png" alt="logo" width="50px"
					height="50px" />
			</div>
			<div class="name">
				<p>Keda短租</p>
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


		</div>

		<!-----------------------------目的地城市下拉框--------------------------->
		<div class="part2">
			<div class="search_rent">
				<div class="search_city">
					<span style="font-size: 16px;"></span><input type="text"
						id="cityName" class="search" placeholder="目的地、城市"
						style="height: 34px;">
					<script>
						$('.search').kuCity();
					</script>
				</div>


				<!-----------------------------日期下拉框--------------------------->
				<div class="search_time">
					<table class="table">
						<thead>
							<tr>
								<th><input type="text" class="span2" value="" id="dpd1"
									placeholder="请选择入住时间"
									style="font-weight: normal; height: 34px;"></th>
								<th><input type="text" class="span2" value="" id="dpd2"
									placeholder="请选择离开时间"
									style="font-weight: normal; margin-left: 7px; height: 34px;">
								</th>
							</tr>
						</thead>
					</table>
					<script>
						var nowTemp = new Date();
						var now = new Date(nowTemp.getFullYear(), nowTemp
								.getMonth(), nowTemp.getDate(), 0, 0, 0, 0);
						var checkin = $('#dpd1')
								.fdatepicker(
										{
											onRender : function(date) {
												return date.valueOf() < now
														.valueOf() ? 'disabled'
														: '';
											}
										})
								.on(
										'changeDate',
										function(ev) {
											if (ev.date.valueOf() > checkout.date
													.valueOf()) {
												var newDate = new Date(ev.date)
												newDate.setDate(newDate
														.getDate() + 1);
												checkout.update(newDate);
											}
											checkin.hide();
											$('#dpd2')[0].focus();
										}).data('datepicker');
						var checkout = $('#dpd2').fdatepicker(
								{
									onRender : function(date) {
										return date.valueOf() <= checkin.date
												.valueOf() ? 'disabled' : '';
									}
								}).on('changeDate', function(ev) {
							checkout.hide();
						}).data('datepicker');
					</script>
				</div>

				<div class="searchbutton">
					<button type="button" onclick="search();"
						class="layui-btn layui-btn-warm"
						style="width: 120px; height: 34px;">搜索</button>
				</div>
			</div>
		</div>
	</div>
	<div class="description">
		<span style="font-size: 30px;">不住酒店,<i style="font-size: 30px;">住我家。</i></span>
	</div>

	<!-----------------------------banner部分--------------------------->
	<div class="banner">
		<div class="ban_text">
			<div class="ban_text1">
				<h2>轰趴聚会</h2>
				<p>私密空间 亲朋好友进行玩</p>
			</div>
			<div class="ban_text2">
				<h2>家庭出游</h2>
				<p>一房多卧 家人合住好照看</p>
			</div>
			<div class="ban_text3">
				<h2>实惠长住</h2>
				<p>洗衣做饭 设施齐全又省钱</p>
			</div>
			<div class="ban_text4">
				<h2>新奇体验</h2>
				<p>房型丰富 风格迥异更养眼</p>
			</div>
		</div>
	</div>

	<!-----------------------------main部分--------------------------->
	<div class="main">
		<!---------------------------热门短租城市-------------------------->
		<div class="main01_city">
			<div class="city_title">
				<span>热门短租城市</span>
				<p>别人的城市是你眼中的风景</p>
			</div>
			<div class="city_pic">
				<div class="city_box">
					<div class="city_box1">
						<a class="cityUrl" href="北京的链接"><img id="bjImg" src=""
							width="780" height="280" alt="北京" /></a>
						<div class="city_textbox">
							<div class="city_pic_text">
								<span class="city_pic1_text" id="bj"></span><br> <span
									class="city_text_describe" id="bjdesc"></span>
							</div>
						</div>
					</div>

					<div class="chengdu">
						<a class="cityUrl" href="成都的链接"><img id="cdImg" src=""
							width="380" height="280" alt="北京" /></a>
						<div class="city_textbox">
							<div class="city_pic_text">
								<span id="cd" class="city_pic1_text"></span><br> <span
									id="cddesc" class="city_text_describe"></span>
							</div>
						</div>
					</div>
					<div class="city_box2">
						<a class="cityUrl" class="cityUrl" href="大连的链接"><img
							id="dlImg" src="" width="380" height="280" alt="北京" /></a>
						<div class="city_textbox">
							<div class="city_pic_text">
								<span id="dl" class="city_pic1_text"></span><br> <span
									id="dldesc" class="city_text_describe"></span>
							</div>
						</div>
					</div>
					<div class="city_box1">
						<a class="cityUrl" href="北戴河的链接"><img id="bdhImg" src=""
							width="780" height="280" alt="北京" /></a>
						<div class="city_textbox">
							<div class="city_pic_text">
								<span id="bdh" class="city_pic1_text"></span><br> <span
									id="bdhdesc" class="city_text_describe"></span>
							</div>
						</div>
					</div>
					<div class="city_box2">
						<a class="cityUrl" href="青岛的链接"><img id="qdImg" src=""
							width="380" height="280" alt="北京" /></a>
						<div class="city_textbox">
							<div class="city_pic_text">
								<span id="qd" class="city_pic1_text"></span><br> <span
									id="qddesc" class="city_text_describe"></span>
							</div>
						</div>
					</div>
					<div class="city_box2">
						<a class="cityUrl" href="杭州的链接"><img id="hzImg" src=""
							width="380" height="280" alt="北京" /></a>
						<div class="city_textbox">
							<div class="city_pic_text">
								<span id="hz" class="city_pic1_text"></span><br> <span
									id="hzdesc" class="city_text_describe"></span>
							</div>
						</div>
					</div>
					<div class="city_box2">
						<a class="cityUrl" href="上海的链接"><img id="shImg" src=""
							width="380" height="280" alt="北京" /></a>
						<div class="city_textbox">
							<div class="city_pic_text">
								<span id="sh" class="city_pic1_text"></span><br> <span
									id="shdesc" class="city_text_describe"></span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!---------------------------短租公寓推荐-------------------------->
		<div class="main02_hotel">
			<div class="hotel_title">
				<span class="title_header">短租推荐</span>
			</div>
			<div class="hotel_pic">
				<div class="container" id="recommendRent">

					<!-- 
						<div  class="sHoverItem">
							<img  src="../../images/hotel/im/1.jpg">
							<span  class="sIntro">
								<h2></h2>	
								<p>Flowers are so inconsistent! But I was too young to know how to love her</p>
								<button>inconsistent</button>
							</span>
						</div>
						<div id="item2" class="sHoverItem">
							<img src="../../images/hotel/im/2.jpg">
							<span class="sIntro">
								<h2>You know</h2>	
								<p>one loves the sunset, when one is so sad</p>
								<button>sunset</button>
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/3.jpg">
							<span class="sIntro">
								<h2>For</h2>	
								<p>For she did not want him to see her crying. She was such a proud flower</p>
								<button>crying</button>	
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/4.jpg">
							<span class="sIntro">
								<h2>Volcanoes</h2>	
								<p>It is of some use to my volcanoes, and it is of some use to my flower, that I own them. But you are of no </p>
								<button>use to the stars</button>	
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/5.jpg">
							<span class="sIntro">
								<h2>I thought</h2>	
								<p>I thought that I was rich, with a flower that was unique in all the world; and all I had was a common</p>
								<button>rose</button>
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/6.jpg">
							<span class="sIntro">
								<h2>For she</h2>	
								<p>For she did not want him to see her crying. She was such a proud flower</p>
								<button>a proud flower</button>
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/7.jpg">
							<span class="sIntro">
								<h2>Thorns</h2>	
								<p>She has only four thorns to defend herself against the world. And I have left on my planet, all alone!</p>
								<button>alone</button>
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/8.jpg">
							<span class="sIntro">
								<h2>A little boy</h2>	
								<p>To me, you are still nothing more than a little boy who is just like a hundred thousand other little boys.</p>
								<button>boys</button>
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/9.jpg">
							<span class="sIntro">
								<h2>And I</h2>	
								<p>And I have no need of you. And you, on your part, have no need of me.</p>
								<button>no need of me</button>
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/10.jpg">
							<span class="sIntro">
								<h2>Foxes</h2>	
								<p>I am nothing more than a fox like a hundred thousand other foxes.</p>
								<button>nothing</button>
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/11.jpg">
							<span class="sIntro">
								<h2>Tame</h2>	
								<p>But if you tame me, then we shall need each other.</p>
								<button>need</button>
							</span>
						</div>
						<div class="sHoverItem">
							<img src="../../images/hotel/im/12.jpg">
							<span class="sIntro">
								<h2>Unique</h2>	
								<p>To me,you will be unique in all the world. To you, I shall be unique in all the world. </p>
								<button>unique</button>
							</span>
						</div>
						 -->


				</div>
				<script>
					window.onload = function() {
						var a = new sHover("sHoverItem", "sIntro");
						a.set({
							slideSpeed : 5,
							opacityChange : true,
							opacity : 80
						});
					}
				</script>
			</div>
		</div>
	</div>

	<!-----------------------------footer部分--------------------------->
	<div class="footer">
		<p style="text-align: center;">许可证号：晋ICP证180509号 安全联盟 太原科大信息科技有限公司</p>
		<p style="text-align: center;">京公网安备 201420020104号</p>
	</div>
</body>
</html>


















