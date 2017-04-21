<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%! String roleName="管理员123"; 
         /**
            @author: hanwei
            @date: 2017-4-17
         */
          public void test()
          {
        	  
          }
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
      
      function test(){
    	  
      } 
    <%--alert("hello js"); --%>
</script>
</head>
<body>
     <%-- 我是注释 --%>
     
    <!--  沙发是飞洒发 -->
     <%   if(roleName.equals("管理员")) 
        {
        	  %>
        	  当前角色：<span style="color:red;"><%=roleName%></span>
        	     <%@ include file="/myInclude.jsp"%>
        	  <%
        }else{
        	
        	%>
        	 当前角色： <span style="color:blue;">普通用户</span>
        	<%        
        	}
        %> 
        
     
</body>
</html>