<%@ page contentType="text/html;charset=gb2312" %>

<%@ page import="com.isoft.model.ShopCar"%>	<!-- ����ShopCar�� -->
<% 
   ShopCar car=new ShopCar();			//����һ��ʵ��
   session.setAttribute("mycar",car);   	// key-value ��ֵ��   ��������JavaBeanʵ������session��Χ�� */
   String productNum = request.getParameter("productNum");
   String productName = request.getParameter("productName"); 
 


%>
 <jsp:setProperty name="mycar" property="*"/>


<!-- ��ʾ�������Ϣ -->
��Ʒ��<%=car.getProductName()%>
<br>
������ <%=car.getProductNum()%>
���أ�<%=car.getProductMaker()%>
<br>
<a href="myform.jsp">��������</a>
