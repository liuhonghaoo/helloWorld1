<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/commond.do" method="post">
姓名：<input type="text" name="userName" id="userName">
年龄：<input type="text" name="userAge" id="userAge">
生日：<input type="text" name="birthday" id="birthday">
地址：<input type="text" name="address" id="address">
<input type="submit" value="提交">
</form>

</body>
</html>