<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>  <!-- 表单 -->
<form action="<%=basePath %>HelloServlet" method="POST">
	物品：<input type="text" name="productName" size="20">
	<br>
	数量：<input type="text" name="productNum" size="20">
	<br>
	产地：<input type="text" name="productMaker" size="20">
	<br>
	<input type="submit" value="提交">
</form>
</body>
</html>