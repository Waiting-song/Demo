<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function checkUserName(userName)
{
	
	var myurl = "<%=basePath%>checkUserNameURL";
	myAjax(myurl,userName);
	
	}
	
function myAjax(myurl,userName)
{
  var xmlhttp;    
  if (window.XMLHttpRequest)
  {
    // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
    xmlhttp=new XMLHttpRequest();
  }
  else
  {
    // IE6, IE5 浏览器执行代码
    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }

  //xmlhttp.open("GET",myurl+"?userNamePara="+userName+"&userPwd="+pwd,true);
  xmlhttp.open("GET",myurl+"?userNamePara="+userName,true);
  xmlhttp.send();
  
  xmlhttp.onreadystatechange=function()
  {
    if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
      document.getElementById("userNameMark").innerHTML=xmlhttp.responseText;
    }
  }
  
}
</script>
</head>
<body>
<form action="<%=basePath%>atmLoginServlet" method="post">
<table>
  <tr colspan="2"><td>中国银行ATM</td></tr>
    <tr><td>用户名:</td><td>
    <input type="text" name="userName" onblur="checkUserName(this.value)"/>
    <span id="userNameMark" style="color:red;"></span>
    </td></tr>
      <tr><td>密码：</td><td><input type="password" name="userPwd"/></td></tr>
         <tr><td></td><td><input type="submit" value="登录"/><input type="reset" value="重置"/></td></tr>
</table>
</form>

</body>
</html>