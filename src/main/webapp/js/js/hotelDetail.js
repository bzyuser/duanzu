
// 查询房屋信息
function findHouseDetail(house_id){
	
	$.ajax({
		url:contextPath+"/pages/hotel/findHouse/findHouseDetailInfo.do",
		type:"post",
		data:{"house_id":house_id},
		dataType:"json",
		success:function(map){
			var baseInfo = map.baseInfo;
			var detailInfo = map.detailInfo;
			var pqInfo = map.pqInfo;
			var hostInfo = map.hostInfo;
			var facilityList = map.facilityList;
			var housePicInfo = map.housePicInfo;
			
			$("#house_name").html(baseInfo.houseName);
			$("#address").text(baseInfo.address);
			$("#houseImg").attr("src","/pic/house/"+housePicInfo.pictureUrl);
			$("#day_price").text(pqInfo.dayPrice);
			$("#peopleNum").html("");
			for(var i=0;i<detailInfo.availablePeopleNum;i++){
				var num = i + 1;
				$("#peopleNum").append(
					"<li onclick='select(this);'><a>"+num+"</a></li>"
				);
			}
			$("#totalPrice").text("￥");
			
			$("#hostName").text(hostInfo.realName+hostInfo.sex+"士");
			$("#hostPhone").text(hostInfo.phone+" 转 49136");
			$("#sheshiInfo").html("");
			for(var i=0;i<facilityList.length;i++){
				$("#sheshiInfo").append(
					"<div style='width:150px;float:left;margin-top:14px;'>"+
						"<svg class='icon' aria-hidden='true' style='width: 30px; height: 30px;'>"+
						  	"<use xlink:href="+sheshi_icon(facilityList[i])+"></use>"+
						  	"<span style='font-size: 16px;'>&nbsp;&nbsp;"+facilityList[i]+"</span>"+
						"</svg>"+
					"</div>"
				);
			}
			$("#house_type").text("房屋类型："+baseInfo.houseType);
			$("#toilet_num").text("卫生间数量："+detailInfo.toilet_num+"("+detailInfo.toiletType+")");
			$("#rent_out_type").text("出租类型："+baseInfo.rentOutType+"("+detailInfo.area+"㎡)");
			$("#available_people_num").text("标准可住人数："+detailInfo.availablePeopleNum+"人");
			$("#home_num").text("卧室数量："+detailInfo.homeNum);
			$("#extraAddPeopleNum").text("额外可增加人数："+detailInfo.extraAddPeopleNum+"人");
			$("#bed_num").text("床位数量："+detailInfo.bedNum+"个"+"("+detailInfo.bedType+")");
			$("#louceng").text("楼层："+detailInfo.towerLevel+" / "+detailInfo.totalLevel);
			$("#houseDesc").text(baseInfo.houseDesc);
			$("#traffic").text(baseInfo.traffic);
			$("#rimDesc").text(baseInfo.rimDesc);
			
			// 其他信息是根据“；”拆分换行（注意：  ‘；’是中文）
			$("#otherMsg").text("");
			var others = (baseInfo.other).split("；");
			for(var i=0;i<others.length;i++){
				$("#otherMsg").append(
					others[i]+"<br/>"
				);
			}
			
			$("#checkInTime").text("入住时间："+pqInfo.checkInStartTime+"--"+pqInfo.checkInEndTime);
			$("#cleanPrice").text("清洁费："+pqInfo.cleanPrice);
			$("#lessDay").text("最短入住天数："+pqInfo.lessDay+"天");
			$("#checkOutTime").text("退房时间："+pqInfo.checkOutTime);
			$("#cashPledge").text("押金：￥"+pqInfo.cashPledge);
		},
		error:function(){
			alert("加载房屋信息失败");
		}
	})
}

// 选择入住日期、退房日期后计算金额
function calculTotalPrice(){
	// 获取单价/天
	var day_price = $("#day_price").text();
	// 获取选择的日期
	var start = $("#dpd1").val();
	var end = $("#dpd2").val();
	var num = DateDiff(start,end);
	//计算总价
	var total_price = num*day_price;
	// 更新到总价
	$("#totalPrice").text("￥"+total_price+" 元");
}

//计算字符串日期天数差
function  DateDiff(sDate1,sDate2){    //sDate1和sDate2是06/01/2017格式 
   var  aDate,oDate1,oDate2,iDays ; 
   aDate =  sDate1.split("/") ; 
   //转换为12-18-2002格式  
   oDate1 = new  Date(aDate[0]+'/'+aDate[1]+'/'+aDate[2]);
   aDate = sDate2.split("/"); 
   oDate2 = new  Date(aDate[0]+'/'+aDate[1]+'/'+aDate[2]); 
   //把相差的毫秒数转换为天数      
   iDays = parseInt(Math.abs(oDate1-oDate2)/1000/60/60/24);
   return iDays;
}

// 人数下拉菜单选择功能脚本
function select(obj){
	// 获取选择的值
	var num = $(obj).find("a").text();
	// 把值添加到span中
	$("#personNum").text(num);
}

// 前往订单提交页面
function toSubmit(){
	// 获取参数
	var house_id = $("#house_id").text();
	var day_price = $("#day_price").text();
	var startTime = $("#dpd1").val();
	var endTime = $("#dpd2").val();
	var personNum = $("#personNum").text();
	//非空性判断
	if(startTime==null || startTime == ""){
		alert("请选择预定开始时间");
		return;
	}
	if(endTime==null || endTime == ""){
		alert("请选择预定退房时间");
		return;
	}
	if(personNum=="人数"){
		alert("请选择预定人数");
		return;
	}
	// 页面跳转并传参
	window.location.href="/duanzu/pages/hotel/order.jsp?house_id="+house_id+"&day_price="+day_price+"&startTime="+startTime+"&endTime="+endTime+"&personNum="+personNum;
}

// 根据设施选择图标
function sheshi_icon(obj){
	var iconUrl;
	switch(obj){
	case "接送": iconUrl = "#icon-jiesong";
		return iconUrl;
	case "游泳池": iconUrl = "#icon-pool";
		return iconUrl;
	case "停车位": iconUrl = "#icon-tingchewei";
		return iconUrl;
	case "健身房": iconUrl = "#icon-jianshenfang";
		return iconUrl;
	case "热水浴缸": iconUrl = "#icon-icon_bathtub";
		return iconUrl;
	case "饮水机": iconUrl = "#icon-yinshuiji";
		return iconUrl;
	case "拖鞋": iconUrl = "#icon-tuoxie";
		return iconUrl;
	case "吸烟": iconUrl = "#icon-xiyan";
		return iconUrl;
	case "洗浴用品": iconUrl = "#icon-xiyuyongpin";
		return iconUrl;
	case "房屋信息": iconUrl = "#icon-fangwuxinxi";
		return iconUrl;
	case "票务": iconUrl = "#icon-piaowu";
		return iconUrl;
	case "早餐": iconUrl = "#icon-zaocan";
		return iconUrl;
	case "行李寄存": iconUrl = "#icon-hanglijicun";
		return iconUrl;
	case "暖气": iconUrl = "#icon-nuanqi";
		return iconUrl;
	case "无线网络": iconUrl = "#icon-wuxianwangluo";
		return iconUrl;
	case "电脑": iconUrl = "#icon-diannao";
		return iconUrl;
	case "厨房": iconUrl = "#icon-chufang";
		return iconUrl;
	case "电梯": iconUrl = "#icon-dianti";
		return iconUrl;
	case "空调": iconUrl = "#icon-kongtiao";
		return iconUrl;
	case "洗浴": iconUrl = "#icon-xiyu";
		return iconUrl;
	case "淋浴": iconUrl = "#icon-linyu";
		return iconUrl;
	case "电视": iconUrl = "#icon-dianshi";
		return iconUrl;
	}
}


