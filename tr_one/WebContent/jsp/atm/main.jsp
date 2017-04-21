<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
        <%@ page import="com.isoft.one.atm.model.*" %>
    <% List detailList = (List)request.getAttribute("mydetailList");   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
  <tr colspan="2"><td>中国银行ATM</td></tr>
    <tr><td>用户名:</td><td>${myuser.sysUserName}</td></tr>
      <tr><td>现金余额:</td><td>${myLeftCash}</td></tr>
         <tr><td>账户明细</td><td></td></tr>
     
	 <a href="jsp/atm/save.jsp">存钱功能</a>&nbsp
	 <a href="jsp/atm/get.jsp">取钱功能</a>&nbsp
	 <a href="jsp/atm/transCash.jsp">转账功能</a>&nbsp
	 <a href="jsp/atm/atmLogin.jsp">注销</a>
</table>

<table align="center">

    <tr ><td>科目</td><td>现金</td><td>余额</td><td>日期</td></tr>  
          <%
                for(int i=0;i<detailList.size();i++)
                {
                	TAccountDetail detail = (TAccountDetail)detailList.get(i);
                	%>
                	 <tr ><td><%=detail.getActionType()%></td><td><%=detail.getCash() %></td><td><%=detail.getTotal()%></td><td><%=detail.getTdate()%></td></tr>  
                	<%
                }
          %>
         
</table>
</body>
</html>