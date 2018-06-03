var userId = 1;
//页面加载执行查询房东基本信息
$(function(){
	loadhostinfo(userId);
	loadhosthouseinfo(userId);
});

//加载该房东的房源信息
function loadhosthouseinfo(id){
	//向基本信息中隐藏用户id
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	$.ajax({
		url:contextPath+"/pages/hotel/fangdongManager/loadhosthouseinfo.do",
		type:"post",
		data:{"userId":id},
		dataType:"json",
		success:function(result){
			//alert("chenggong");
			var houses = result.houses;
			for(var i=0;i<houses.length;i++){
				var houseDetail = houses[i].detailInfo;
				var picture = houses[i].pictures;
				
				var url = null;
				for(var j=0;j<picture.length;j++){
					var pictureType = picture[j].pictureType;
					if(pictureType=='首页'){
						url = picture[j].pictureUrl;
					}
				}
				//alert(url);
				var houseId = houses[i].houseId;
				var time = houses[i].time;
				var houseName = houses[i].houseName;
				var address = houses[i].address;
				var homeType = houses[i].homeType;
				var toiletNum = houseDetail.toiletNum;
				var area = houseDetail.area;
				var towerLevel = houseDetail.towerLevel;
				addOneFangyuan(houseId,url,time,houseName,address,homeType,toiletNum,area,towerLevel);
			}
		},
		error:function(){
			layer.msg("加载房东房源出错");
		}
	})
}
//增加一条房源信息
function addOneFangyuan(houseId,url,time,houseName,address,homeType,toiletNum,area,towerLevel){
	sdiv = '';
	sdiv += '<div class="box3"><div class="left">';
	sdiv += '<div class="picture"><img style="width:100%;height:100%;" alt="加载失败" src="'+url+'"></div>';
	sdiv += '<div class="text"><br>';
	sdiv += '<p style="text-align: center;">'+time+'发布</p></div></div>';
	sdiv += '<div class="middle">';
	sdiv += '<a onclick="seeDetail(this)" style="cursor:pointer"><h2>'+houseName+'</h2></a>';
	sdiv += '<p>'+address+'</p>';
	sdiv += '<p style="color: lightgray">* '+homeType+'室 '+toiletNum+'卫，'+area+'平 '+towerLevel+'层</p>';
	sdiv += '</div><div class="right">';
	sdiv += '<button class="button" style="cursor:pointer" onclick="deleteFangyuan(this)">删除房源</button></div></div>';
	$div = $(sdiv);
	$div.data("houseId",houseId);
	$("#mima1").append($div);
}
function seeDetail(obj){
	var houseId = $(obj).parent("div").parent("div").data("houseId");
	layer.msg(houseId);
}
//删除一条房源信息
function deleteFangyuan(obj){
	var houseId = $(obj).parent("div").parent("div").data("houseId");
	//layer.msg(houseId);
	$.ajax({
		url:contextPath+"/pages/hotel/fangdongManager/deleteOneFangyuan.do",
		type:"post",
		data:{"houseId":houseId},
		dataType:"json",
		success:function(result){
			$(obj).parent("div").parent("div").html("");			
			var msg = result.msg;
			layer.msg(msg);
		},
		error:function(){
			layer.msg("删除房源信息出错");
		}
	});
	
}
//加载房东信息
function loadhostinfo(id){
	//向基本信息中隐藏用户id
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	
	$("#userId").val(userId);
	$.ajax({
		url:contextPath+"/pages/hotel/fangdongManager/loadhostinfo.do",
		type:"post",
		data:{"userId":id},
		dataType:"json",
		success:function(result){
			var status = result.status;
			if(status==1){
				var msg = result.msg;
				//显示房东信息
				$("#name").val(msg.realName);
				var sex = msg.sex;
				if(sex=="男"){
					$("#sex1").prop("checked","true");
				}else{
					$("#sex2").prop("checked","true");
				}
				$("#age").val(msg.age);
				$("#phone").val(msg.phone);
				$("#cardtype").val(msg.cardType);
				$("#cardnum").val(msg.idCard);
				$("#minzu").val(msg.ethnic);
				$("#job").val(msg.job);
				$("#hostdesc").val(msg.hostDesc);
				$("#remark").val(msg.remark1);
			}
		},
		error:function(){
			layer.msg("加载房东信息出错");
		}
	})
}
//对进本信息进行保存
function saveInfo(){
	//向基本信息中隐藏用户id
	var layer;
	layui.use('layer',function(){
		layer = layui.layer;
	});
	
	$("#userId").val(userId);
	$.ajax({
		url:contextPath+"/pages/hotel/fangdongManager/saveInfo.do",
		type:"post",
		data:$("#forminfo").serialize(),
		dataType:"json",
		success:function(result){
			var status = result.status;
			if(status==1){
				layer.msg(result.msg);
			}else{
				layer.msg(result.msg);
			}
		},
		error:function(){
			layer.msg("保存出错");
		}
	})
}