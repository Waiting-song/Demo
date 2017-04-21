<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
if(request.getParameter("submit1")!=null){
	response.setContentType("application/msword;charset=gb2312");
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<%
java.util.Enumeration enema=application.getInitParameterNames();
while(enema.hasMoreElements()){
String name=(String)enema.nextElement();
String value=application.getInitParameter(name);
out.println(name+",");
out.println(value);
out.print("<br>");
}
%>

</body>
</html>