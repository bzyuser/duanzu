

// 获取参数添加到表单中
function getParame(){
	// 获取参数
	var city_name = $("#cityGoal").val();
	var preset_start_time = $("#dpd1").val();
	var preset_end_time = $("#dpd2").val();
	
	// 把数据添加到表单中
	$("#city_name").val(city_name);
	if(preset_start_time!=null && preset_start_time!=""){
		$("#preset_start_time").val(preset_start_time);
	}
	if(preset_end_time!=null && preset_end_time!=""){
		$("#preset_end_time").val(preset_end_time);
	}
	
}
// 按条件查询
function searchDuanzuInfo(){
	
	getParame();
	
	$.ajax({
		url:contextPath+"/pages/hotel/findCityDuanZu/findCityDuanzuInfo.do",
		type:"post",
		data:$("#findCondition").serialize(),
		dataType:"json",
		success:function(pageInfo){
			// 获取分页参数
			var pageNum = pageInfo.pageNum;
			var pageSize = pageInfo.pageSize;
			var total = pageInfo.total;
			// 获取数据
			var infoList = pageInfo.list;
			$("#dispalyInfo").html("");
			for(var i=0;i<infoList.length;i++){
				
				$("#dispalyInfo").append(
					"<div class='hotel' onclick='toshowDetail(this);'>"+
						"<div style='display:none;'>"+infoList[i].house_id+"</div>"+
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
			// 开启分页组件
			startPageShowInfo(total,pageNum,pageSize);
		},
		error:function(){
			alert("查询短租信息失败");
		}
	})
}

// 分页
function startPageShowInfo(total,pageNum,pageSize){
	// 使用layui的分页插件
    layui.use(['laypage','layer'],function () {
        var laypage = layui.laypage,layer = layui.layer;
        // 执行一个laypage实例
        laypage.render({
            elem:'pageDiv', // 此处时id，但不用加#
            count:total,    // 数据总数（服务端获取）
            limit:pageSize, // 每页显示条数
            curr:pageNum,   //当前页号
            layout:['prev','page','next','count'],//显示哪些分页组件
            jump:function (obj,first) { // 点击页号时执行的函数
                $("[name='pageNum']").val(obj.curr);    //向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit); // 向隐藏域设置当前页的大小
                if(!first){ //首次不执行（点击的时候才执行）
                	searchDuanzuInfo(); //分页执行查询函数（这个函数必须写在这）
                }
            }
        });
    });
}

// 点击跳转到详细房屋页面
function toshowDetail(obj){
	var house_id = $(obj).find("div").eq(0).text();
	window.location.href="/duanzu/pages/hotel/hotelDetail.jsp?house_id="+house_id;
}
