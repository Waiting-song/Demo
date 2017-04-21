<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function transCash(){

	var myurl = "<%=basePath%>transCashURL";
	var cashNum = document.getElementById("cashNumId");
	var transUserId = document.getElementById("myTransUserId");
	myAjax(myurl,cashNum.value,transUserId.value);
	
}

function myAjax(myurl,cashNum,transUserId)
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
  xmlhttp.open("POST",myurl+"?cashNum="+cashNum+"&transUserId="+transUserId,true);
  xmlhttp.send();
  
  xmlhttp.onreadystatechange=function()
  {
    if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
      document.getElementById("mymark").innerHTML=xmlhttp.responseText;
    }
  }
  
}

</script>
</head>
<body>

<table>
          <tr><td>中国银行ATM</td></tr> <span id="mymark" style="color:red;"></span>
          <tr><td>转出账户名:</td><td>${myuser.sysUserName}</td></tr>
          <tr><td>转账金额:</td><td><input type="text" placeholder="请输入转账金额（元）" id="cashNumId" name="cashNum"/> </td></tr>
          <tr><td>转入账户ID</td><td><input type="text" placeholder="请输入转入账户ID" id="myTransUserId" name="transUserId"/></td></tr>
          <a href="javascript:transCash();">确定&nbsp<a href="<%=basePath %>atmLoginServlet">返回</a>
</table>

</body>
</html>