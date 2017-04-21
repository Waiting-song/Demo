<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println("path----"+path+"---basePath----"+basePath);
%>
 <link rel="stylesheet" type="text/css" href="<%=basePath %>resource/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resource/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resource/easyui/themes/demo.css">
    <script type="text/javascript" src="<%=basePath %>resource/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>resource/easyui/jquery.easyui.min.js"></script>