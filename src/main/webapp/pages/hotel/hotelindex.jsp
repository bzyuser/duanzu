<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<%@ page import="java.util.*" %>
<%@ page import="java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>科大短租</title>
		<meta name="renderer" content="webkit">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	    <meta name="viewport"
	          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
	    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
	    <link rel="stylesheet" href="../../css/font.css">
	    <link rel="stylesheet" href="../../css/xadmin.css">
	    <link rel="stylesheet" href="../../css/hotel.css/kuCity.css">
	    <link rel="stylesheet" type="text/css" href="../../css/hotel.css/style.css" />
	    <!--<link href="../../css/hotel.css/foundation.min.css" rel="stylesheet" type="text/css">-->
	    <link href="../../css/hotel.css/foundation-datepicker.css" rel="stylesheet" type="text/css">
	    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	    <script type="text/javascript" src="../../js/jquery.min.js"></script>
	    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
	    <script type="text/javascript" src="../../js/xadmin.js"></script>
	    <script type="text/javascript" src="../../iconfont/iconfont.js"></script>
	    <script src="../../js/hotel.js/kuCity.js"></script>
	    <script src="../../js/hotel.js/foundation-datepicker.js"></script>
	    <script src="../../js/hotel.js/foundation-datepicker.zh-CN.js"></script>	
	    <script src="../../js/hotel.js/bootstrap.min.js"></script>
	    <!--<script src="http://www.jq22.com/jquery/jquery-1.9.1.js"></script>-->
	    <!--<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
	    
	    <script src="../../js/js/index_login_register.js"></script>
	    <script type="text/javascript" src="../../js/js/hotelIndex.js"></script>
	    <script type="text/javascript" src="../../js/js/util.js"></script>
	    
	    <style>
	    	/************************************阿里巴巴图标库的引入*******************************/
	    	.icon {
			   width: 1.8em; height: 1.8em;
			   vertical-align: -0.15em;
			   fill: currentColor;
			   overflow: hidden;
			}
	    	/************************************公共样式*******************************/
			*{
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
	       	.header{
	       		height:60px;
	       		width: 1366px;
	       		background: lightgoldenrodyellow;
	       	}
			.logo{
				float:left;
				margin-left: 50px;
				margin-top: 5px;
			}
			.name{
				float: left;
				margin-left: 15px;
				margin-top: 15px;
			}
			.name > p{
				float: left;
				margin-top: -5px;
				margin-left: 20px;
				font-size: 28px;
			    text-shadow: 5px 5px 5px black, 0px 0px 2px black;
			    color: white;
			}
			.nav{
				float: right;
				margin-right: 100px;
				margin-top: 8px;
			}
			.search_city{
				float:left;
				margin-left: 100px;
				margin-top: 18px;
			}
			.search {
		        /*margin-left: 20px;*/
		        padding: 7px;
		        border: 1px solid rgb(207, 222, 229);
		        border-radius: 2px;
		        width: 150px;
		    }
			.search_time{
				float:left;
				margin-left: 50px;
				margin-top: 10px;
			}
			.btn-group{
				float: left;
				margin-top: 15px;
				margin-left: 50px;
			}
			.span2{
				border: 1px solid rgb(207,222,229);
				border-radius: 2px;
				width: 200px;
				height: 30px;
			}
		    
		    .banner{
		    	height: 310px;
	    		width: 1366px;
	    		background: lightgoldenrodyellow;
	    		margin-top: 10px;
		    }
			.search_rent{
				height: 66px;
	    		width: 1250px;
	    		background: white;
	    		float: left;
	    		margin-top: 15px;
	    		margin-left: 50px;
			}
			
		    .search_type{
		    	height:240px;
		    	width:1250px;
		    	float:left;
		    	margin-left: 50px;
		    	margin-top: 10px;
		    	
		    }
		    .wrapper-demo{
		    	float: left;
		    	/*margin-top: -50px;*/
		    	margin-left: 50px;
		    	margin-top: 18px;
		    }
			.choice label{
				font-weight: normal;
			}
		    .price-box-min{
		    	float: left;
		    	margin-top: 8px;
		    	margin-left: 10px;
		    }
		    .price-box-mid{
		    	float:left;
		    	margin-top: 2px;
		    	margin-left: 10px;
		    }
		    .price-box-max{
		    	float: left;
		    	margin-left: 10px;
		    	margin-top: 8px;
		    }
		   
	    	.Select input{
	    		width: 50px;
	    	}
	    	.Select table{
	    		width:1250px;
	    		margin:10px auto;
	    		background: white;
	    		border-width: 1px 0 0 1px;
	    	}
	    	
	    	.allselect{
	    		height: 50px;
	    		width: 1250px;
	    		float: left;
	    		margin-left: 78px;
	    	}
	    	.main{
	    		height: 1600px;
	    		width: 1366px;
	    		background: lightgoldenrodyellow;
	    		margin-top: 10px;
	    	}
	    	.main_box{
	    		height: 1600px;
	    		width: 1250px;
	    		background: white;
	    		float: left;
	    		margin-top: 10px;
	    		margin-left: 50px;
	    	}
	    	.main_text{
	    		height:56px;
	    		width: 1250px;
	    		float: left;
	    		margin-left: 50px;
	    	}
	    	#main-txt{
	    		float: left;
	    		margin-top: 10px;
	    		margin-left: 20px;
	    	}
	    	.hotel{
	    		height:250px;
	    		width: 1250px;
	    		margin-top: 10px;
	    	}
	    	.hotel-pic{
	    		float: left;
	    		margin-left: 50px;
	    		margin-top: 5px;
	    	}
	    	.hotel-info{
	    		float: left;
	    		height: 250px;
	    		width: 720px;
	    		/*background: yellow;*/
	    		margin-left: 50px;
	    		margin-top: 10px;
	    	}
	    	.hotel-title h3{
	    		font-size: 20px;
	    		font-weight: normal;
	    		margin-top: 10px;
	    	}
	    	.hotel-title .hotel-price{
	    		font-size: 30px;
	    		color:orange;
	    		float:right;
	    		margin-top: -35px;
	    	}
	    	.house-title-left{
	    		height: 100px;
	    		margin-top: 10px;
	    	}
	    	.boss{
	    		float: left;
	    		margin-top: 40px;
	    	}
	    	.boss p{
	    		font-size: 24px;
	    	}
	    	.boss span{
	    		font-size: 24px;
	    		font-weight: bolder;
	    	}
			#pageDiv{
	    		margin-left: 490px;
	    	}
			.footer{
				float: left;
				height: 100px;
				width: 1366px;
				background: lightgrey;	
				position: relative;
				/*margin-left: 50px;*/
				margin-top: 50px;
			}
			#sousuoAnNiu{
				width:100px;
			}
			#sousuoAnNiu:hover{
				color:yellow;
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
			#nav2 dd{
				margin-top:10px;
			}
			
	  </style>
	  <script type="text/javascript">
	  		// 获取get参数
	  		var city_name;
	  		var preset_start_time;
	  		var preset_end_time;
	  		$(function(){
	  			hasSession();
	  			<%
	  				String city_name = request.getParameter("city_name");
	  					if(city_name!=null){
	  						city_name = URLDecoder.decode(city_name, "utf-8");
	  					}
	  				String preset_start_time = request.getParameter("preset_start_time");
	  				String preset_end_time = request.getParameter("preset_end_time");
	  			%>
	  			city_name = "<%=city_name%>";
	  			preset_start_time = "<%=preset_start_time%>";
	  			preset_end_time = "<%=preset_end_time%>";		
	  			
	  			// 非空则赋值
	  			if(city_name!=null && city_name!=""){
	  				$("#cityGoal").val(city_name);
	  			}
				if(preset_start_time!=null&&preset_start_time!=""){
					$("#dpd1").val(preset_start_time);
	  			}
				if(preset_end_time!=null&&preset_end_time!=""){
					$("#dpd2").val(preset_end_time);
				}
				// 页面加载时根据条件查询
				searchDuanzuInfo();
	  			
	  		})
	  		
	  </script>
	</head>
	<body>
		<div class="header">
			<div class="logo"><img onclick="toIndex();" style="cursor:pointer;" src="../../images/hotel/logo.png" alt="logo" width="50px" height="50px"/></div>
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
			
			
		</div>
		<div class="banner">
			<div class="search_rent">
				<div class="search_city">
					<span style="font-size: 16px;">目的地:</span><input id="cityGoal" type="text" class="search" placeholder="请选择目的地">
					<script>
						$('.search').kuCity();
					</script>
				</div>
				<div class="search_time">
					<table class="table">
						<thead>
							<tr>
								<th><span style="font-size: 16px; font-weight: normal;">入住: </span>
									<input type="text" class="span2" value="" id="dpd1" placeholder="请选择入住时间" style="font-weight: normal;">
								</th>
								<th><span style="font-size: 16px; font-weight: normal;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退房:</span>
									<input type="text" class="span2" value="" id="dpd2" placeholder="请选择离开时间" style="font-weight: normal;">
								</th>
							</tr>
						</thead>
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
				<div class="wrapper-demo">
					
					<input type="button" id="sousuoAnNiu" class="wrapper-dropdown-3" onclick="searchDuanzuInfo();" value="搜&nbsp;索"/>
					
					<!-- 
					<div id="dd" class="wrapper-dropdown-3" tabindex="1">
					
						<span>人数</span>
						<ul class="dropdown">
							<li>
								<a href="#">1人</a>
							</li>
							<li>
								<a href="#">2人</a>
							</li>
							<li>
								<a href="#">3人</a>
							</li>
							<li>
								<a href="#">4人</a>
							</li>
							<li>
								<a href="#">5人</a>
							</li>
							<li>
								<a href="#">6人</a>
							</li>
							<li>
								<a href="#">7人</a>
							</li>
							<li>
								<a href="#">8人</a>
							</li>
							<li>
								<a href="#">9人</a>
							</li>
							<li>
								<a href="#">10人及以上</a>
							</li>
						</ul>
					
					</div>
					 -->
				
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
				
			</div>
			
			
			<form id="findCondition" action="" method="post">
				
				<!-- 隐藏查询条件 -->
				<input type="hidden" name="city_name" id="city_name"/>
				<input type="hidden" name="preset_start_time" id="preset_start_time"/>
				<input type="hidden" name="preset_end_time" id="preset_end_time"/>
				
				<!-- 隐藏分页信息 -->
				<input type="hidden" name="pageNum">
				<input type="hidden" name="pageSize">
				
			<div class="search_type">
				<div class="layui-form-item" pane="">
				    <div class="Select">
				    	<table class="choice" style="line-height: 40px;background:none;">
					    	<tr id="choosePrice">
					    		<td style="font-size: 22px; font-weight: normal;">价格:</td>
					    		
					    		
					    		<td>
					    			<input type="radio" name="price" id="pri2" value="0-100"/><label for="pri2" style="font-size: 20px;">100元以下</label>
					    		</td>
					    		<td>

					      			<input type="radio" name="price" id="pri3" value="101-200"/><label for="pri3" style="font-size: 20px;">101-200元</label>
					    		</td>
					    		<td>
					      			<input type="radio" name="price" id="pri4" value="201-300"/><label for="pri4" style="font-size: 20px;">201-300元</label>
					    		</td>
					    		<td>
					      			<input type="radio" name="price" id="pri5" value="301-500"/><label for="pri5" style="font-size: 20px;">301-500元</label>
					    		</td>
					    		<td>
					      			<input type="radio" name="price" id="pri6" value="500-*"/><label for="pri6" style="font-size: 20px;">500元以上</label>
					    		</td>
					    		<td colspan="3">
									<div class="price-box-min">
									    <input type="text" name="price_min" placeholder="￥" class="layui-input" style="width: 72px; height: 27px;">
									</div>
									<div class="price-box-mid">-</div>
									<div class="price-box-max">
									    <input type="text" name="price_max" placeholder="￥" class="layui-input" style="width: 72px; height: 27px;">
									</div>
					    		</td>
					    	</tr>
					    	<tr id="chooseHouseType">
					    		<td style="font-size: 24px;font-weight: normal;">房型:</td>
					    		
					    		
					    		
					    		<td>
					    			<input type="checkbox" name="houseType" id="houtyp2" value="公寓"/><label for="houtyp2" style="font-size: 20px;">公寓</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="houseType" id="houtyp3" value="民宿"/><label for="houtyp3" style="font-size: 20px;">民宿</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="houseType" id="houtyp4" value="旅馆"/><label for="houtyp4" style="font-size: 20px;">旅馆</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="houseType" id="houtyp5" value="别墅"/><label for="houtyp5" style="font-size: 20px;">别墅</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="houseType" id="houtyp6" value="活动场地"/><label for="houtyp6" style="font-size: 20px;">活动场地</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="houseType" id="houtyp7" value="农家院"/><label for="houtyp7" style="font-size: 20px;">农家院</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="houseType" id="houtyp8" value="客栈"/><label for="houtyp8" style="font-size: 20px;">客栈</label>
					    		</td>
					    	</tr>
					    	<tr id="choosetype">
					    		<td style="font-size: 24px;font-weight: normal;">户型:</td>
					    		
					    		
					    		<td>
					    			<input type="checkbox" name="rentType" id="typ2" value="一居"/><label for="typ2" style="font-size: 20px;">一居</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="rentType" id="typ3" value="二居"/><label for="typ3" style="font-size: 20px;">二居</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="rentType" id="typ4" value="三居"/><label for="typ4" style="font-size: 20px;">三居</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="rentType" id="typ5" value="四居"/><label for="typ5" style="font-size: 20px;">四居</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="rentType" id="typ6" value="四居以上"/><label for="typ6" style="font-size: 20px;">四居以上</label>
					    		</td>
					    		
					    	</tr>
					    	<tr id="facilities">
					    		<td style="font-size: 24px;font-weight: normal;">设施：</td>
					    		
					    		
					    		<td>
					    			<input type="checkbox" name="facility" id="fac2" value="无线网络"/><label for="fac2" style="font-size: 20px;">无线网络</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="facility" id="fac3" value="电视"/><label for="fac3" style="font-size: 20px;">电视</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="facility" id="fac4" value="淋浴"/><label for="fac4" style="font-size: 20px;">淋浴</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="facility" id="fac5" value="空调"/><label for="fac5" style="font-size: 20px;">空调</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="facility" id="fac6" value="暖气"/><label for="fac6" style="font-size: 20px;">暖气</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="facility" id="fac7" value="厨房"/><label for="fac7" style="font-size: 20px;">厨房</label>
					    		</td>
					    		<td>
					      			<input type="checkbox" name="facility" id="fac8" value="24h热水"/><label for="fac8" style="font-size: 20px;">24h热水</label>
					    		</td>
					    	</tr>
					    </table>
				    </div>
				    
				</div>
			</div>
			
			</form>
			
			
			
		</div>
		<div class="main">
			<div class="main_box">
				<div class="main_text">
					<div id="main-txt"><span style="color: lightblue; font-size: 24px;">短租房源</span></div>
				</div>

				<div class="line">
					<hr class="layui-bg-gray">
				</div>
				<div class="main_picture" id="dispalyInfo">
				
				
				<!-- 
				
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
							<div class="boss">
								<p>朱女士&nbsp;&nbsp;&nbsp;&nbsp;
									<svg class="icon" aria-hidden="true">
										<use xlink:href="#icon-dianhua"></use>
									</svg>
									<span style="color: orange;">400-8130-400 转 49136</span>
								</p>
							</div>
						</div>
					</div>
					
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					
					
					
					
					
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
						
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
						
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
						
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
						
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
						
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
						
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
						
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div class="hotel">
						<div class="hotel-pic"><img src="../../images/hotel/3.jpg" alt="短租房间图片" height="240px" width="360px"></div>
						<div class="hotel-info">
							<div class="hotel-title">
								<h3>大东海旅游度假区三房一厅海景家庭套</h3>
								<div class="hotel-price">￥458</div>
							</div>
							<div class="house-title-left">
								<p style="font-size: 16px;">三亚大东海大东海大东海花园</p>
								<p style="font-size: 16px;">房屋类型-出租类型-卧室数量-可住人数</p>
							</div>
						</div>
						
					</div>
					<div class="line">
						<hr class="layui-bg-darkgray">
					</div>
					<div id="demo4"></div>
					<script>
						layui.use(['laypage', 'layer'], function(){
							var laypage = layui.laypage,layer = layui.layer;
								laypage.render({
								elem: 'demo4'
								,count: 100
								,first: false
								,last: false
								});
						});
					</script>

					-->

				</div>
				
			</div>
			<div id="pageDiv"></div>
		</div>
		<div class="footer">
			<p style="text-align: center;">许可证号：晋ICP证180509号    安全联盟   太原科大信息科技有限公司</p>
			<p style="text-align: center;">京公网安备 201420020104号</p>
		</div>
	</body>
</html>
