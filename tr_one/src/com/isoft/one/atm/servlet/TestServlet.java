package com.isoft.one.atm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet 
public class TestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("接收 get请求 ");
		request.setCharacterEncoding("UTF-8");
		String productName = request.getParameter("productName");
		System.out.println(productName);
		String productMaker = request.getParameter("productMaker");
		System.out.println(productMaker);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("接收 post 请求 ");
		request.setCharacterEncoding("UTF-8");
		String productName = request.getParameter("productName");
		System.out.println(productName);
		
	}

	
}
