<%@ page contentType="text/html;charset=gb2312" %>

<%@ page import="com.isoft.model.ShopCar"%>	<!-- 导入ShopCar类 -->
<% 
   ShopCar car=new ShopCar();			//创建一个实例
   session.setAttribute("mycar",car);   	// key-value 键值对   将创建的JavaBean实例存在session范围内 */
   String productNum = request.getParameter("productNum");
   String productName = request.getParameter("productName"); 
 


%>
 <jsp:setProperty name="mycar" property="*"/>


<!-- 显示输入的信息 -->
物品：<%=car.getProductName()%>
<br>
数量： <%=car.getProductNum()%>
产地：<%=car.getProductMaker()%>
<br>
<a href="myform.jsp">继续输入</a>
