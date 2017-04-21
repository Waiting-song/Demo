<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="myerror.jsp"
    pageEncoding="UTF-8"%>
    <%@ page info="This is index.jsp!" %>
    
<%@ page import ="com.isoft.one.atm.test.*" %>
<%@ page import ="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/myInclude.jsp" %>

<%
     System.out.print("我是java 嵌入了 jsp网页");
     //ATMMain atm = new ATMMain();
     //atm.test();
     String today = new Date().toLocaleString();
     
%>
<!-- 你好 jsp网页 --> 我得jsp

这是当前的时间：
<%  String temp = "hello";
        int i =10;
       // int reslut = i/0;
%>

当前字符串：<%=temp %>

<%=this.getServletInfo()%>

</body>
</html>