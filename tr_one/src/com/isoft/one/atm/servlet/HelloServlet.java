package com.isoft.one.atm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isoft.one.atm.dao.TSysUserDao;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

	private TSysUserDao userDao = new TSysUserDao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("接收 hello get请求 ");
		request.setCharacterEncoding("UTF-8");
		String productName = request.getParameter("productName");
		System.out.println(productName);
		String productMaker = request.getParameter("productMaker");
		System.out.println(productMaker);
		
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/showProductList.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("接收 hello post 请求 ");
		request.setCharacterEncoding("UTF-8");
		
		String productName = request.getParameter("productName");
		request.setAttribute("mykfcProduct", productName);
		
		String productMaker = request.getParameter("productMaker");
		request.setAttribute("myproductMaker", productMaker);
		
		request.setAttribute("mymsg", "跳转成功!");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/showProductList.jsp");
		dispatcher.forward(request, response);
	}

}
