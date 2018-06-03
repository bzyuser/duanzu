
// 页面加载执行
$(function(){
	showContent();
})


function submitOrder(){
	
	// 把两个表单连接起来，用于统一提交
	var data = $("#orderInfo").serialize()+"&"+$("#otherInfo").serialize();
	
	$.ajax({
		url:contextPath+"/pages/hotel/zuKeOrderInfo/addZuKeOrderInfo.do",
		type:"post",
		data:data,
		dataType:"json",
		success:function(){
			// 提交成功，设置页面跳转
			alert("预定成功")
			//window.location.href="/duanzu/pages/hotel/zukeManager.jsp"
		},
		error:function(){
			alert("提交订单出错")
		}
	})
}


// 动态加载页面数据及布局
function showContent(){
	var startTime = $("#startTime").text();
	var endTime = $("#endTime").text();
	$("#checkIndays").text(DateDiff(startTime,endTime));
	var price = $("#price").text();
	$("#totalPrice").text(DateDiff(startTime,endTime)*price);
	// 给提交表单中的参数赋值
	$("#check_in_days").val(DateDiff(startTime,endTime));
	$("#total_price").val(DateDiff(startTime,endTime)*price);
	
	var check_in_people_num = parseInt($("#check_in_people_num").text())-1;
	$("#otherInfo").html("");
	// 先隐藏一个map存储的数据条数
	$("#otherInfo").append(
		"<input type='hidden' name='dataNum' value='"+check_in_people_num+"'>"
	);
	for(var i=0;i<check_in_people_num;i++){
		$("#otherInfo").append(
				'<div class="usertable">'+
				'<div class="box1">'+
				   	'<div class="text2"><p style="font-size: 20px;">姓名：</p></div>'+
				    '<div class="shurukuang">'+
				    	'<input type="text" class="form-control" placeholder="请输入同住人姓名" name="name'+i+'" />'+
				    '</div>'+
			    '</div>'+
			    
			    '<div class="box1">'+
			   		'<div class="text2"><p style="font-size: 20px;">性别：</p></div>'+
			   		'<div class="shurukuang">'+
			   			'<select class="form-control" name="sex'+i+'" ><option value="">请选择</option><option value="男">男</option><option value="女">女</option></select>'+
			    	'</div>'+
			    '</div>'+
			    
			    '<div class="box1">'+
				    '<div class="text2"><p style="font-size: 20px;">证件号码：</p></div>'+
				    '<div class="shurukuang">'+
				    	'<input type="text" class="form-control" placeholder="请输入身份证号" name="id_card'+i+'" maxlength="18"/>'+
				    '</div>'+
			    '</div>'+
			    '<div class="box1">'+
				    '<div class="text2"><p style="font-size: 20px;">手机号码：</p></div>'+
				    '<div class="shurukuang">'+
				    	'<input type="text" class="form-control" placeholder="请输入手机号码" name="phone'+i+'" maxlength="11"/>'+
				    '</div>'+
			    '</div>'+
			    '<div class="box1">'+
			    	'<div class="text2"><p style="font-size: 20px;">备注：</p></div>'+
			    	'<div class="beizhu">'+
			      		'<textarea placeholder="请输入内容" class="layui-textarea" name="remark'+i+'" ></textarea>'+
			    	'</div>'+
			  	'</div>'+
			'</div>'
		);
	}
}


// 计算字符串日期天数差
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