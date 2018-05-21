<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>添加房源-科大短租</title>
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
		<script class="resources library" src="../../js/hotel.js/area.js" type="text/javascript"></script>

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
		
			.banner {
				width: 1366px;
				height: 60px;
				background: lightgoldenrodyellow;
				margin-top: 20px;
			}
			.myfangyuan{
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
				height:4180px;
				background: lightgoldenrodyellow;
				margin-top: 5px;
			}
			
			.fangyuanInfo {
				width: 1250px;
				height: 4150px;
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
			.form-control1{
				height: 30px;
				width: 770px;
				margin-left: 150px;
				margin-top: 18px;
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
				height: 300px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
			}
			
			.fangjianInfo{
				width: 1250px;
				height: 660px;
				background: white;
				float: left;
				margin-top: 5px;
			}
			.typetable,.days{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 560px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
			}
			.type00{
				height: 28px;
				width: 200px;
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
			
			.fangjiandecription{
				width: 1250px;
				height: 650px;
				background: white;
				float: left;
				margin-top: 5px;
			}
			.description_table{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 550px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
			}
			.box2{
				float: left;
				margin-top: 70px;
				width: 1000px;
			}
			
			.bianlisheshi{
				width: 1250px;
				height: 630px;
				background: white;
				float: left;
				margin-top: 5px;
			}
			.sheshi{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 520px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
			}
			.weiyu{
				float: left;
				margin-top: 20px;
				width: 1000px;
				margin-left: 100px;
				height: 80px;
			}
			.tr{
				float: left;
				margin-top: 15px;
			}
			.td{
				height: 20px;
				width: 200px;
			}
			
			.jiating,.wuye,.fuwu{
				float: left;
				margin-top: 20px;
				width: 1000px;
				margin-left: 100px;
				height: 110px;
			}
			
			.upload{
				width: 1250px;
				height: 630px;
				background: white;
				float: left;
				margin-top: 5px;
			}
			.shangchuan{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 520px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
				/*图片的大小640*480*/
			}
			
			.priceInfo{
				width: 1250px;
				height: 330px;
				background: white;
				float: left;
				margin-top: 5px;
			}
			.price{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 230px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
			}
			
			.shiyongguize{
				width: 1250px;
				height: 240px;
				background: white;
				float: left;
				margin-top: 5px;
			}
			.shiyong{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 135px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
			}
			
			.ruzhuxuzhi{
				width: 1250px;
				height: 320px;
				background: white;
				float: left;
				margin-top: 5px;
			}
			.xuzhitable{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 230px;
				border: 2px solid lightgoldenrodyellow;
				margin-top: 20px;
				margin-left: 80px;
			}
			.type01{
				height: 28px;
				width: 91px;
			}
			.zhi{
				float: left;
				margin-top: -27px;
				margin-left: 100px;
			}	
			
			.time{
				float: left;
				margin-left: 50px;
				width:1100px;
				height: 20px;
				/*border: 2px solid lightgoldenrodyellow;*/
				margin-top: -30px;
				margin-left: 280px;
			}
			.yaoqiu{
				float: left;
				margin-top: -27px;
				margin-left: 400px;
			}
					
			.submit{
				float: left;
				height: 50px;
				width: 100%;
				margin-left: 500px;
			}
			
			.footer{
				float: left;
				height: 100px;
				width: 1366px;
				background: lightgrey;	
				position: relative;
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
			<div class="myfangyuan">
				<span class="ord">>&nbsp;&nbsp;&nbsp;发布您的房源</span>
			</div>
		</div>
		<div class="main">
			<div class="fangyuanInfo">
				<div class="weizhiInfo">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">位置信息</div>
					<div class="line"></div>
					<div class="weizhitable">
						<div class="box1">
						    <div class="text2"><p style="font-size: 20px;">房源地址：</p></div>
						    <div>
								<select id="s_province" name="s_province" style="width: 25%;height: 30px;"></select>  
							    <select id="s_city" name="s_city" style="width: 25%;height: 30px;"></select>  
							    <select id="s_county" name="s_county" style="width: 25%;height: 30px;"></select>
							    <script type="text/javascript">_init_area();</script>
							  	<input type="text" class="form-control1" placeholder="请输入房间具体位置" id="IDcard"/>
							</div>
						</div>
						<!--<div id="show"></div>-->
					
						<script type="text/javascript">
							var Gid  = document.getElementById ;
							var showArea = function(){
								Gid('show').innerHTML = "<h3>省" + Gid('s_province').value + " - 市" + 	
								Gid('s_city').value + " - 县/区" + 
								Gid('s_county').value + "</h3>"
							}
							Gid('s_county').setAttribute('onchange','showArea()');
							
						</script>

					</div>
				</div>
				<div class="userInfo">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">户主信息</div>
					<div class="line"></div>
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
					
				</div>
				<div class="fangjianInfo">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">房间情况</div>
					<div class="line"></div>
					<div class="typetable">
						<div class="box1">
						    <div class="text2"><p style="font-size: 18px;">房屋类型：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="1">公寓</option>
						    		<option value="2">民宿</option>
						    		<option value="3">旅馆</option>
						    		<option value="4">别墅</option>
						    		<option value="5">活动场地</option>
						    		<option value="6">农家院</option>
						    		<option value="7">客栈</option>
						    		<option value="">其他</option>
						    	</select>
						    	<!--<input type="text" class="form-control" placeholder="请输入用户姓名" id="name" />-->
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">出租类型：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="1">整套出租</option>
						    		<option value="2">单间出租</option>
						    		<option value="3">床位出租</option>
						    		<option value="4">客厅沙发</option>
						    	</select>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">卧室数量：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="1">1</option>
						    		<option value="2">2</option>
						    		<option value="3">3</option>
						    		<option value="4">4</option>
						    		<option value="5">5</option>
						    		<option value="6">6</option>
						    		<option value="7">7</option>
						    		<option value="8">8</option>
						    		<option value="9">9</option>
						    		<option value="10">10</option>
						    		<option value="11">11</option>
						    		<option value="12">12</option>
						    		<option value="13">13</option>
						    		<option value="14">14</option>
						    		<option value="15">15</option>
						    		<option value="16">16</option>
						    		<option value="17">17</option>
						    		<option value="18">18</option>
						    		<option value="19">19</option>
						    		<option value="20">20及以上</option>
						    		<option value="21">21</option>
						    		<option value="22">22</option>
						    		<option value="23">23</option>
						    		<option value="24">24</option>
						    		<option value="25">25</option>
						    		<option value="26">26</option>
						    		<option value="27">27</option>
						    		<option value="28">28</option>
						    		<option value="29">29</option>
						    		<option value="30">30+</option>
						    	</select>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">床位数量 ：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="1">1</option>
						    		<option value="2">2</option>
						    		<option value="3">3</option>
						    		<option value="4">4</option>
						    		<option value="5">5</option>
						    		<option value="6">6</option>
						    		<option value="7">7</option>
						    		<option value="8">8</option>
						    		<option value="9">9</option>
						    		<option value="10">10</option>
						    		<option value="11">11</option>
						    		<option value="12">12</option>
						    		<option value="13">13</option>
						    		<option value="14">14</option>
						    		<option value="15">15</option>
						    		<option value="16">16</option>
						    		<option value="17">17</option>
						    		<option value="18">18</option>
						    		<option value="19">19</option>
						    		<option value="20">20</option>
						    		<option value="21">21</option>
						    		<option value="22">22</option>
						    		<option value="23">23</option>
						    		<option value="24">24</option>
						    		<option value="25">25</option>
						    		<option value="26">26</option>
						    		<option value="27">27</option>
						    		<option value="28">28</option>
						    		<option value="29">29</option>
						    		<option value="30">30+</option>
						    	</select>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">标准可住人数：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="1">1</option>
						    		<option value="2">2</option>
						    		<option value="3">3</option>
						    		<option value="4">4</option>
						    		<option value="5">5</option>
						    		<option value="6">6</option>
						    		<option value="7">7</option>
						    		<option value="8">8</option>
						    		<option value="9">9</option>
						    		<option value="10">10</option>
						    		<option value="11">11</option>
						    		<option value="12">12</option>
						    		<option value="13">13</option>
						    		<option value="14">14</option>
						    		<option value="15">15</option>
						    		<option value="16">16</option>
						    		<option value="17">17</option>
						    		<option value="18">18</option>
						    		<option value="19">19</option>
						    		<option value="20">20</option>
						    		<option value="21">21</option>
						    		<option value="22">22</option>
						    		<option value="23">23</option>
						    		<option value="24">24</option>
						    		<option value="25">25</option>
						    		<option value="26">26</option>
						    		<option value="27">27</option>
						    		<option value="28">28</option>
						    		<option value="29">29</option>
						    		<option value="30">30+</option>
						    	</select>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">床型：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="1">双人床</option>
						    		<option value="2">单人床</option>
						    		<option value="3">沙发床</option>
						    		<option value="4">榻榻米</option>
						    	</select>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">额外可增加人数：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="15">15</option>
						    		<option value="1">0</option>
						    		<option value="2">1</option>
						    		<option value="3">2</option>
						    		<option value="4">3</option>
						    	</select>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">卫生间数量：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="1">1</option>
						    		<option value="2">2</option>
						    		<option value="3">3</option>
						    		<option value="4">4</option>
						    		<option value="5">5</option>
						    		<option value="6">6</option>
						    		<option value="7">7</option>
						    		<option value="8">8</option>
						    		<option value="9">9</option>
						    		<option value="10">10+</option>
						    	</select>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">卫生间类型：</p></div>
						    <div class="houseType">
						    	<table class="choosetoilet">
						    		<tr>
						    			<td style="width:150px;"><input type="radio" name="toilet" id="pri1"/><label for="pri1" style="font-size: 20px;">公共卫生间</label></td>
						    			<td style="width:150px;"><input type="radio" name="toilet" id="pri2"/><label for="pri2" style="font-size: 20px;">独立卫生间</label></td>
						    		</tr>
						    	</table>
						    </div>
					    </div>
						<div class="box1">
						    <div class="text2"><p style="font-size: 18px;">楼层：</p></div>
						    <div class="houseType">
						    	<input type="text" style="height: 25px;width: 50px;"/>&nbsp;&nbsp;层/共&nbsp;&nbsp;<input type="text" style="height: 25px;width: 50px;">
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">房间面积：</p></div>
						    <div class="houseType">
						    	<input type="text" style="height: 25px;width: 80px;" placeholder="请输入整数"/>&nbsp;&nbsp;平方米&nbsp;&nbsp;
						    </div>
					    </div>
						
					</div>
				</div>
				<div class="fangjiandecription">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">房间描述</div>
					<div class="line"></div>
					<div class="description_table">
						<div class="box1">
						    <div class="text2"><p style="font-size: 20px;">标题：</p></div>
						    <div class="shurukuang">
						    	<input type="text" class="form-control" placeholder="好的标题会让你的房间成为一个亮点" id="name" maxlength="17"/><p style="font-size: 18px;color: lightgray;">&nbsp;&nbsp;最长不超过17个汉字</p>
						    </div>
					    </div>
					    <div class="box1">
					    	<div class="text2"><p style="font-size: 20px;">房屋介绍：</p></div>
					    	<div class="beizhu">
					      		<textarea placeholder="如户型、面积、装修、家具家电、网络情况等" class="layui-textarea" name="desc"></textarea>
					    	</div>
					  	</div>
					  	<div class="box2">
					    	<div class="text2"><p style="font-size: 20px;">交通情况：</p></div>
					    	<div class="beizhu">
					      		<textarea placeholder="如公交站、地铁线路、如何去往机场或火车站等" class="layui-textarea" name="desc"></textarea>
					    	</div>
					  	</div>
					    <div class="box2">
						    <div class="text2"><p style="font-size: 20px;">周边情况：</p></div>
						    <div class="beizhu">
						    	<textarea placeholder="如商场、超市、银行、医院等" class="layui-textarea" name="desc"></textarea>
						    </div>
					    </div>
					    <div class="box2">
						    <div class="text2"><p style="font-size: 20px;">其他：</p></div>
						    <div class="beizhu">
						    	<textarea class="layui-textarea" name="desc"></textarea>
						    </div>
					    </div>
					</div>
				</div>
				<div class="bianlisheshi">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">便利设施</div>
					<div class="line"></div>
					<div class="sheshi">
						<div class="weiyu">
							<table>
								<label style="font-size: 20px;font-weight: bolder;">卫浴设施</label>
								<tr id="chooseweiyu" class="tr">
						    		<td class="td">
						    			<input type="checkbox" name="weiyu" id="weiyu1"/><label for="weiyu1" style="font-size: 18px;">&nbsp;&nbsp;洗浴用品</label>
						    		</td >
						    		<td class="td">
						    			<input type="checkbox" name="weiyu" id="weiyu2"/><label for="weiyu2" style="font-size: 18px;">&nbsp;&nbsp;拖鞋</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="weiyu" id="weiyu3"/><label for="weiyu3" style="font-size: 18px;">&nbsp;&nbsp;24h热水</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="weiyu" id="weiyu4"/><label for="weiyu4" style="font-size: 18px;">&nbsp;&nbsp;热水浴缸</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="weiyu" id="weiyu5"/><label for="weiyu5" style="font-size: 20px;">&nbsp;&nbsp;淋浴</label>
						    		</td>
						    	</tr>
					    	</table>
						</div>
						<div class="jiating">
							<table class="table1" style="table-layout: fixed;width: 1000px;">
								<label style="font-size: 20px;font-weight: bolder;">家庭及网络</label>
								<tr class="tr">
						    		<td class="td">
						    			<input type="checkbox" name="jiating" id="jiating1"/><label for="jiating1" style="font-size: 18px;">&nbsp;&nbsp;电视</label>
						    		</td >
						    		<td class="td">
						    			<input type="checkbox" name="jiating" id="jiating2"/><label for="jiating2" style="font-size: 18px;">&nbsp;&nbsp;电冰箱</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="jiating" id="jiating3"/><label for="jiating3" style="font-size: 18px;">&nbsp;&nbsp;电脑</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="jiating" id="jiating4"/><label for="jiating4" style="font-size: 18px;">&nbsp;&nbsp;洗衣机</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="jiating" id="jiating5"/><label for="jiating5" style="font-size: 18px;">&nbsp;&nbsp;空调</label>
						    		</td>
						    	</tr>
						    	<tr class="tr">
						    		<td class="td">
						      			<input type="checkbox" name="jiating" id="jiating6"/><label for="jiating6" style="font-size: 18px;">&nbsp;&nbsp;暖气</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="jiating" id="jiating7"/><label for="jiating7" style="font-size: 18px;">&nbsp;&nbsp;有线网络</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="jiating" id="jiating8"/><label for="jiating8" style="font-size: 18px;">&nbsp;&nbsp;无线网络</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="jiating" id="jiating9"/><label for="jiating9" style="font-size: 18px;">&nbsp;&nbsp;饮水机</label>
						    		</td>
						    	</tr>
					    	</table>
						</div>
						<div class="wuye">
							<table class="table1" style="table-layout: fixed;width: 1000px;">
								<label style="font-size: 20px;font-weight: bolder;">物业及房源其他设施</label>
								<tr class="tr">
						    		<td class="td">
						    			<input type="checkbox" name="wuye" id="wuye1"/><label for="wuye1" style="font-size: 18px;">&nbsp;&nbsp;电梯</label>
						    		</td >
						    		<td class="td">
						    			<input type="checkbox" name="wuye" id="wuye2"/><label for="wuye2" style="font-size: 18px;">&nbsp;&nbsp;无障碍设施</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="wuye" id="wuye3"/><label for="wuye3" style="font-size: 18px;">&nbsp;&nbsp;保安</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="wuye" id="wuye4"/><label for="wuye4" style="font-size: 18px;">&nbsp;&nbsp;自动麻将桌</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="wuye" id="wuye5"/><label for="wuye5" style="font-size: 18px;">&nbsp;&nbsp;停车位</label>
						    		</td>
						    	</tr>
						    	<tr class="tr">
						    		<td class="td">
						      			<input type="checkbox" name="wuye" id="wuye6"/><label for="wuye6" style="font-size: 18px;">&nbsp;&nbsp;对讲门禁系统</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="wuye" id="wuye7"/><label for="wuye7" style="font-size: 18px;">&nbsp;&nbsp;免费健身房</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="wuye" id="wuye8"/><label for="wuye8" style="font-size: 18px;">&nbsp;&nbsp;免费游泳池</label>
						    		</td>
						    	</tr>
					    	</table>
						</div>
						<div class="fuwu">
							<table class="table1" style="table-layout: fixed;width: 1000px;">
								<label style="font-size: 20px;font-weight: bolder;">物业及房源其他设施</label>
								<tr class="tr">
						    		<td class="td">
						    			<input type="checkbox" name="fuwu" id="fuwu1"/><label for="fuwu1" style="font-size: 18px;">&nbsp;&nbsp;可以接送</label>
						    		</td >
						    		<td class="td">
						    			<input type="checkbox" name="fuwu" id="fuwu2"/><label for="fuwu2" style="font-size: 18px;">&nbsp;&nbsp;免费早餐</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="fuwu" id="fuwu3"/><label for="fuwu3" style="font-size: 18px;">&nbsp;&nbsp;可接待家庭/孩子</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="fuwu" id="fuwu4"/><label for="fuwu4" style="font-size: 18px;">&nbsp;&nbsp;适合举办活动</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="fuwu" id="fuwu5"/><label for="fuwu5" style="font-size: 18px;">&nbsp;&nbsp;可用厨房</label>
						    		</td>
						    	</tr>
						    	<tr class="tr">
						    		<td class="td">
						      			<input type="checkbox" name="fuwu" id="fuwu6"/><label for="fuwu6" style="font-size: 18px;">&nbsp;&nbsp;可以携带宠物</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="fuwu" id="fuwu7"/><label for="fuwu7" style="font-size: 18px;">&nbsp;&nbsp;行李寄存</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="fuwu" id="fuwu8"/><label for="fuwu8" style="font-size: 18px;">&nbsp;&nbsp;加床服务</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="fuwu" id="fuwu9"/><label for="fuwu9" style="font-size: 18px;">&nbsp;&nbsp;票务代理</label>
						    		</td>
						    		<td class="td">
						      			<input type="checkbox" name="fuwu" id="fuwu10"/><label for="fuwu10" style="font-size: 18px;">&nbsp;&nbsp;可以吸烟</label>
						    		</td>
						    	</tr>
					    	</table>
						</div>
					</div>
					
				</div>
				<div class="upload">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">上传图片</div>
					<div class="line"></div>
					<div class="shangchuan">
					</div>
				</div>
				<div class="priceInfo">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">价格规则</div>
					<div class="line"></div>
					<div class="price">
						<div class="box1">
						    <div class="text2"><p style="font-size: 20px;">日价格：</p></div>
						    <div class="shurukuang">
						    	<input type="text" class="form-control" placeholder="RMB" id="price1" />
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 20px;">周价格：</p></div>
						    <div class="shurukuang">
						    	<input type="text" class="form-control" placeholder="RMB" id="price2"/>
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 20px;">清洁费：</p></div>
						    <div class="shurukuang">
						    	<input type="text" class="form-control" placeholder="RMB" id="price3"/>
						    </div>
					    </div>
					    <div class="box1">
					    	<div class="text2"><p style="font-size: 20px;">押金 ：</p></div>
					    	<div class="shurukuang">
						    	<input type="text" class="form-control" placeholder="RMB" id="price4"/>
						    </div>
					  	</div>
					</div>
					
				</div>
				<div class="shiyongguize">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">使用规则</div>
					<div class="line"></div>
					<div class="shiyong">
					    <div class="box1">
					    	<div class="text2"><p style="font-size: 20px;">房屋使用规则：</p></div>
					    	<div class="beizhu">
					      		<textarea class="layui-textarea" name="desc">* 请带好您的有效身份证件办理入住。
* 请爱护房间内设施和物品。
* 请勿将房间用于违法活动。
					      		</textarea>
					    	</div>
					    </div>
					</div>
				</div>
				<div class="ruzhuxuzhi">
					<div class="kuai"></div>
					<div class="text1" style="font-size: 25px;">房间情况</div>
					<div class="line"></div>
					<div class="xuzhitable">
						<div class="box1">
						    <div class="text2"><p style="font-size: 18px;">最少入住天数：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="1">1</option>
						    		<option value="2">2</option>
						    		<option value="3">3</option>
						    		<option value="4">4</option>
						    		<option value="5">5</option>
						    		<option value="6">6</option>
						    		<option value="7">7</option>
						    		<option value="8">8</option>
						    		<option value="9">9</option>
						    		<option value="10">10</option>
						    		<option value="11">11</option>
						    		<option value="12">12</option>
						    		<option value="13">13</option>
						    		<option value="14">14</option>
						    		<option value="15">15</option>
						    		<option value="16">16</option>
						    		<option value="17">17</option>
						    		<option value="18">18</option>
						    		<option value="19">19</option>
						    		<option value="20">20</option>
						    		<option value="21">21</option>
						    		<option value="22">22</option>
						    		<option value="23">23</option>
						    		<option value="24">24</option>
						    		<option value="25">25</option>
						    		<option value="26">26</option>
						    		<option value="27">27</option>
						    		<option value="28">28</option>
						    		<option value="29">29</option>
						    		<option value="30">30</option>
						    	</select>
						    	<!--<input type="text" class="form-control" placeholder="请输入用户姓名" id="name" />-->
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">最多住天数：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option>没有限制</option>
						    		<option value="1">1</option>
						    		<option value="2">2</option>
						    		<option value="3">3</option>
						    		<option value="4">4</option>
						    		<option value="5">5</option>
						    		<option value="6">6</option>
						    		<option value="7">7</option>
						    		<option value="8">8</option>
						    		<option value="9">9</option>
						    		<option value="10">10</option>
						    		<option value="11">11</option>
						    		<option value="12">12</option>
						    		<option value="13">13</option>
						    		<option value="14">14</option>
						    		<option value="15">15</option>
						    		<option value="16">16</option>
						    		<option value="17">17</option>
						    		<option value="18">18</option>
						    		<option value="19">19</option>
						    		<option value="20">20</option>
						    		<option value="21">21</option>
						    		<option value="22">22</option>
						    		<option value="23">23</option>
						    		<option value="24">24</option>
						    		<option value="25">25</option>
						    		<option value="26">26</option>
						    		<option value="27">27</option>
						    		<option value="28">28</option>
						    		<option value="29">29</option>
						    		<option value="30">30+</option>
						    		<option value="31">31</option>
						    		<option value="32">32</option>
						    		<option value="33">33</option>
						    		<option value="34">34</option>
						    		<option value="35">35</option>
						    		<option value="36">36</option>
						    		<option value="37">37</option>
						    		<option value="38">38</option>
						    		<option value="39">39</option>
						    		<option value="40">40</option>
						    		<option value="41">41</option>
						    		<option value="42">42</option>
						    		<option value="43">43</option>
						    		<option value="44">44</option>
						    		<option value="45">45</option>
						    		<option value="46">46</option>
						    		<option value="47">47</option>
						    		<option value="48">48</option>
						    		<option value="49">49</option>
						    		<option value="50">50</option>
						    		<option value="51">51</option>
						    		<option value="52">52</option>
						    		<option value="53">53</option>
						    		<option value="54">54</option>
						    		<option value="55">55</option>
						    		<option value="56">56</option>
						    		<option value="57">57</option>
						    		<option value="58">58</option>
						    		<option value="59">59</option>
						    		<option value="60">60</option>
						    	</select>
						    	<!--<input type="text" class="form-control" placeholder="请输入用户姓名" id="name" />-->
						    </div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">入住时间：</p></div>
						    <div class="houseType">
						    	<select class="type01">
						    		<option value="0">00:00</option>
						    		<option value="1">01:00</option>
						    		<option value="2">02:00</option>
						    		<option value="3">03:00</option>
						    		<option value="4">04:00</option>
						    		<option value="5">05:00</option>
						    		<option value="6">06:00</option>
						    		<option value="7">07:00</option>
						    		<option value="8">08:00</option>
						    		<option value="9">09:00</option>
						    		<option value="10">10:00</option>
						    		<option value="11">11:00</option>
						    		<option value="12">12:00</option>
						    		<option value="13">13:00</option>
						    		<option value="14" selected="selected">14:00</option>
						    		<option value="15">15:00</option>
						    		<option value="16">16:00</option>
						    		<option value="17">17:00</option>
						    		<option value="18">18:00</option>
						    		<option value="19">19:00</option>
						    		<option value="20">20:00</option>
						    		<option value="21">21:00</option>
						    		<option value="22">22:00</option>
						    		<option value="23">23:00</option>
						    		<option value="24">24:00</option>
						    	</select>
						    </div>
						    <div class="zhi"><span style="font-size: 18px;">至</span></div>
						    <div class="time">
						    	<select class="type01">
						    		<option value="0">00:00</option>
						    		<option value="1">01:00</option>
						    		<option value="2">02:00</option>
						    		<option value="3">03:00</option>
						    		<option value="4">04:00</option>
						    		<option value="5">05:00</option>
						    		<option value="6">06:00</option>
						    		<option value="7">07:00</option>
						    		<option value="8">08:00</option>
						    		<option value="9">09:00</option>
						    		<option value="10">10:00</option>
						    		<option value="11">11:00</option>
						    		<option value="12">12:00</option>
						    		<option value="13">13:00</option>
						    		<option value="14">14:00</option>
						    		<option value="15">15:00</option>
						    		<option value="16">16:00</option>
						    		<option value="17">17:00</option>
						    		<option value="18">18:00</option>
						    		<option value="19">19:00</option>
						    		<option value="20">20:00</option>
						    		<option value="21">21:00</option>
						    		<option value="22">22:00</option>
						    		<option value="23">23:00</option>
						    		<option value="24" selected="selected">24:00</option>
						    	</select>
						    </div>
						    <div class="yaoqiu"><span style="font-size: 16px;">要求租客在此时间段内办理入住</span></div>
					    </div>
					    <div class="box1">
						    <div class="text2"><p style="font-size: 18px;">退房时间：</p></div>
						    <div class="houseType">
						    	<select class="type00">
						    		<option value="0">00:00</option>
						    		<option value="1">01:00</option>
						    		<option value="2">02:00</option>
						    		<option value="3">03:00</option>
						    		<option value="4">04:00</option>
						    		<option value="5">05:00</option>
						    		<option value="6">06:00</option>
						    		<option value="7">07:00</option>
						    		<option value="8">08:00</option>
						    		<option value="9">09:00</option>
						    		<option value="10">10:00</option>
						    		<option value="11">11:00</option>
						    		<option value="12" selected="selected">12:00</option>
						    		<option value="13">13:00</option>
						    		<option value="14">14:00</option>
						    		<option value="15">15:00</option>
						    		<option value="16">16:00</option>
						    		<option value="17">17:00</option>
						    		<option value="18">18:00</option>
						    		<option value="19">19:00</option>
						    		<option value="20">20:00</option>
						    		<option value="21">21:00</option>
						    		<option value="22">22:00</option>
						    		<option value="23">23:00</option>
						    		<option value="24">24:00</option>
						    	</select>
						    </div>
					    </div>
					</div>
				</div>
				<div class="submit">
					<button style="font-size: 22px; height: 35px;width: 295px; background: lightgreen;">确认发布</button>
				</div>
			</div>
		</div>
		<div class="footer">
			<p style="text-align: center;">许可证号：晋ICP证180509号    安全联盟   太原科大信息科技有限公司</p>
			<p style="text-align: center;">京公网安备 201420020104号</p>
		</div>
	</body>
</html>
