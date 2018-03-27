<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/lib/jquery/1.9.1/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/lib/jquery/1.9.1/jquery.form.js"></script>
</head>
<body>
	<form id="uploadForm" action="">
		<img id="imageSrc" src="" height="100" width="100">
		<input id="inputFile" name="inputFile" type="file" onchange="submitImgSize1Upload()">
		<input id="inputHidden" type="hidden">
	</form>
</body>
<script type="text/javascript">
//因为使用ajax不能提交表单，所以使用jquery.form.js提交表单
	function submitImgSize1Upload(){
	
	var option = {
			type:'post',
			url:'<%=request.getContextPath()%>/upload/uploadPic.do',
			dataType:'text',
			data:{
				fileName:'inputFile'
			},
			success:function(data){
				console.log(data);
				//var dd = json.stringify(data);
				var dd = $.parseJSON(data);
				console.log(dd);
				//返回服务器图片路径给img标签
				$("#imageSrc").attr("src",dd.fullName);
				//数据库保存相对路径
			}
	};
		$("#uploadForm").ajaxSubmit(option);
	}
</script>
</html>