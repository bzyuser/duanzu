
// 定义变量，用于传参
var preset_start_time = "";
var preset_end_time = "";
var city_name = "";
// 页面启动时加载
$(function(){
	$.ajax({
		url:contextPath+"/pages/hotel/findDuanZu/findIndexPageInfo.do",
		type:"post",
		data:{},
		dataType:"json",
		success:function(map){
			// 热门城市信息list
			var cityList = map.cityList;
			// 给页面标签赋值
			$("#bjImg").attr("src","/pic/city/"+cityList[0].picture_url);
			$("#bj").text(cityList[0].city_name);
			$("#bjdesc").text(cityList[0].pic_desc);
			
			$("#cdImg").attr("src","/pic/city/"+cityList[1].picture_url);
			$("#cd").text(cityList[1].city_name);
			$("#cddesc").text(cityList[1].pic_desc);
			
			$("#dlImg").attr("src","/pic/city/"+cityList[2].picture_url);
			$("#dl").text(cityList[2].city_name);
			$("#dldesc").text(cityList[2].pic_desc);
			
			$("#bdhImg").attr("src","/pic/city/"+cityList[3].picture_url);
			$("#bdh").text(cityList[3].city_name);
			$("#bdhdesc").text(cityList[3].pic_desc);
			
			$("#qdImg").attr("src","/pic/city/"+cityList[4].picture_url);
			$("#qd").text(cityList[4].city_name);
			$("#qddesc").text(cityList[4].pic_desc);
			
			$("#hzImg").attr("src","/pic/city/"+cityList[5].picture_url);
			$("#hz").text(cityList[5].city_name);
			$("#hzdesc").text(cityList[5].pic_desc);
			
			$("#shImg").attr("src","/pic/city/"+cityList[6].picture_url);
			$("#sh").text(cityList[6].city_name);
			$("#shdesc").text(cityList[6].pic_desc);
			
			// 给城市图片设置点击事件
			$(".cityUrl").attr("onclick","cityImgClick(this)");
			
			// 短租推荐信息List
			var duanzuList = map.duanzuList;
			var dzListNum = duanzuList.length;
			// 清空div
			$("#recommendRent").html("");
			if(dzListNum<12){
				for(var i = 0; i<duanzuList.length;i++){
					$("#recommendRent").append(
						"<div class='sHoverItem'>"+
							"<img src="+"/pic/house/"+duanzuList[i].picture_url+">"+
							"<span class='sIntro'>"+
								"<a style='display:none;'>"+duanzuList[i].house_id+"</a>"+
								"<h2>"+duanzuList[i].house_name+"</h2>"+
								"<p style='hegith:5px;'>"+duanzuList[i].address+"</p>"+
								"<button type='button' onclick='learnMoreClick(this);'>learn more...</button>"+
							"</span>"+
						"</div>"
					)
				}
			}else{
				for(var i = 0; i < 12; i++){
					$("#recommendRent").append(
						"<div class='sHoverItem'>"+
							"<img src="+"/pic/house/"+duanzuList[i].picture_url+">"+
							"<span class='sIntro'>"+
								"<a style='display:none;'>"+duanzuList[i].house_id+"</a>"+
								"<h2>"+duanzuList[i].house_name+"</h2>"+
								"<p>"+duanzuList[i].house_desc+"</p>"+
								"<button type='button' onclick='learnMoreClick(this);'>learn more...</button>"+
							"</span>"+
						"</div>"
					)
				}
			}
			
			// 重新调用遮罩
			var a=new sHover("sHoverItem","sIntro");
			 a.set({
			 	slideSpeed:5,
			 	opacityChange:true,
			 	opacity:80
			 });
			
		},
		error:function(){
			alert("页面加载数据失败")
		}
	})
})

// 城市图片的点击事件以及传参
function cityImgClick(obj){
	// 获取参数（城市名称）
	cityName = $(obj).parent("div").find("div").find("div").find("span").eq(0).text();
	// 设置页面跳转并传参
	city_name=encodeURI(encodeURI(cityName));
	$(".cityUrl").attr("href","/duanzu/pages/hotel/hotelindex.jsp?city_name="+city_name+"&preset_start_time="+preset_start_time+"&preset_end_time="+preset_end_time);
	
}

// 推荐短租点击事件
function learnMoreClick(obj){
	// 获取隐藏的房屋id
	var house_id = $(obj).parent("span").find("a").text();
	//发送ajax请求 改变房屋热度等级
	$.ajax({
		url:contextPath+"/pages/hotel/findDuanZu/updateHouseHotLevel.do",
		type:"post",
		data:{"house_id":house_id},
		dataType:"json",
		success:function(){
			// 页面跳转并传参
			window.location.href="/duanzu/pages/hotel/hotelDetail.jsp?house_id="+house_id;
		},
		error:function(){
			alert("增加房屋热度失败");
		}
	})
	
}


// 查询符合条件的房源
function search(){
	// 获取查询条件
	cityname = $("#cityName").val();
	preset_start_time = $("#dpd1").val();
	preset_end_time = $("#dpd2").val();
	// alert(cityname+","+preset_start_time+","+preset_end_time);
	city_name=encodeURI(encodeURI(cityname));
	// 页面跳转并传参（查询条件）
	window.location.href="/duanzu/pages/hotel/hotelindex.jsp?city_name="+city_name+"&preset_start_time="+preset_start_time+"&preset_end_time="+preset_end_time;

}