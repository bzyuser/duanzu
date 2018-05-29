
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
			$("#day_price").text("￥"+pqInfo.dayPrice);
			$("#peopleNum").html("");
			for(var i=0;i<detailInfo.availablePeopleNum;i++){
				var num = i + 1;
				$("#peopleNum").append(
					"<li><a>"+num+"&nbsp;人</a></li>"
				);
			}
			$("#totalPrice").text(baseInfo.price);
			$("#hostName").text(hostInfo.realName+hostInfo.sex+"士");
			$("#hostPhone").text(hostInfo.phone+"转 49136");
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
			$("#otherMsg").text(baseInfo.other);
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


