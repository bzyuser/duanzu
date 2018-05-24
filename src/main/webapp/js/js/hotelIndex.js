
// 页面加载执行
$(function(){
	
	searchDuanzuInfo();

})

// 按条件查询
function searchDuanzuInfo(){
	// 获取参数
	var city_name = $("#cityGoal").val();
	var preset_start_time = $("#dpd1").val();
	var preset_end_time = $("#dpd2").val();
	
	// 把数据添加到表单中
	$("#city_name").val(city_name);
	$("#preset_start_time").val(preset_start_time);
	$("#preset_end_time").val(preset_end_time);
	
	
	$.ajax({
		url:contextPath+"/pages/hotel/findCityDuanZu/findCityDuanzuInfo.do",
		type:"post",
		data:$("#findCondition").serialize(),
		dataType:"json",
		success:function(infoList){
			
			$("#dispalyInfo").html("");
			for(var i=0;i<infoList.length;i++){
				
				$("#dispalyInfo").append(
						"<div class='hotel'>"+
						"<div class='hotel-pic'><img src="+infoList[i].picture_url+" alt='短租房间图片' height='240px' width='360px'></div>"+
						"<div class='hotel-info'>"+
							"<div class='hotel-title'>"+
								"<h3>"+infoList[i].house_name+"</h3>"+
								"<div class='hotel-price'>￥"+infoList[i].price+"</div>"+
							"</div>"+
							"<div class='house-title-left'>"+
								"<p style='font-size: 16px;'>"+infoList[i].house_desc+"</p>"+
								"<p style=''font-size: 16px;'>房屋类型:"+infoList[i].house_type+"-出租类型:"+infoList[i].home_type+"-卧室数量:"+infoList[i].home_num+"-可住人数:"+infoList[i].available_people_num+"</p>"+
							"</div>"+
							"<div class='boss'>"+
								"<p>"+infoList[i].real_name+""+infoList[i].sex+"士&nbsp;&nbsp;&nbsp;&nbsp;"+
									"<svg class='icon' aria-hidden='true'>"+
										"<use xlink:href='#icon-dianhua'></use>"+
									"</svg>"+
									"<span style='color: orange;'>"+infoList[i].phone+" 转 49136</span>"+
								"</p>"+
							"</div>"+
						"</div>"+
					"</div>"+
					"<div class='line'>"+
						"<hr class='layui-bg-darkgray'>"+
					"</div>"
					
				);
				
			}
			
		},
		error:function(){
			alert("查询短租信息失败");
		}
	})
}