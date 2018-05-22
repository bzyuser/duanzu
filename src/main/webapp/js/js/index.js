
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
			alert("city/"+cityList[0].picture_url+","+cityList[0].city_name+","+cityList[0].pic_desc);
			// 给页面标签赋值
			$("#bjImg").attr("src","/pic/city/"+cityList[0].picture_url);
			$("#bj").text(cityList[0].city_name);
			$("#bjdesc").text(cityList[0].pic_desc);
			
			// 短租推荐信息List
			var duanzuList = map.duanzuList;
			
		},
		error:function(){
			alert("页面加载数据失败")
		}
	})
})



function search(){
	// 获取查询条件
	var city_name = $("#cityName").val();
	var preset_start_time = $("#dpd1").val();
	var preset_end_time = $("#dpd2").val();
	alert(city_name+","+preset_start_time+","+preset_end_time);
	
	// 发送ajax请求
	$.ajax({
		url:contextPath+"/pages/hotel/findDuanZu/findCityInfo.do",
		type:"post",
		data:{"city_name":city_name,"preset_start_time":preset_start_time,"preset_end_time":preset_end_time},
		dataType:"json",
		success:function(){
			
		},
		error:function(){
			alert("查询短租信息失败");
		}
	})
}