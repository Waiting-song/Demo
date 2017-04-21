package com.isoft.one.atm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isoft.one.atm.model.TSysUser;
import com.isoft.one.atm.service.ISysUserService;
import com.isoft.one.atm.service.SysUserService;

@WebServlet("/checkUserNameURL")
public class CheckUserNameServlet extends HttpServlet{

	private ISysUserService userService = new SysUserService(); 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		try {
			String userName = req.getParameter("userNamePara");
			TSysUser user = new TSysUser();
			user.setSysUserName(userName);
			String result ="";
			if(userService.checkUserName(user))
			{
				result="用户名不存在,请注册 !";
			}else{
				result="可以登录!";
			}
			
			PrintWriter writer = resp.getWriter();
			writer.write(result);
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	
}
