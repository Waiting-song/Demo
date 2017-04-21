package com.isoft.one.atm.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.isoft.one.atm.dao.TSysUserDao;
import com.isoft.one.atm.model.TAccountDetail;
import com.isoft.one.atm.model.TSysUser;
import com.isoft.one.atm.service.AccountDetail;
import com.isoft.one.atm.service.IAccountDetailService;
import com.isoft.one.atm.service.ISysUserService;
import com.isoft.one.atm.service.SysUserService;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/atmLoginServlet")
public class ATMLoginServlet extends HttpServlet {

	private ISysUserService userService = new SysUserService();
	private IAccountDetailService detailService = new AccountDetail();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			System.out.println("接收 超链接 get请求 ");
			request.setCharacterEncoding("UTF-8");
			HttpSession session = request.getSession();
			TSysUser user = (TSysUser)session.getAttribute("myuser");
			String leftCash = userService.getAccountLeftCash(user);
			request.setAttribute("myLeftCash", leftCash);
			
			TAccountDetail detail = new TAccountDetail();
			detail.setSysUserId(user.getSysUserId());
			List detailList = detailService.getAccountDetail(detail);
			
			request.setAttribute("mydetailList", detailList);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/atm/main.jsp");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
			HttpSession session = request.getSession();
		try {
			String userName = request.getParameter("userName");
			String userPwd = request.getParameter("userPwd");
			
			TSysUser user = new TSysUser();
			user.setSysUserName(userName);
			user.setSysUserPwd(userPwd);
			
			TSysUser tempUser = userService.login(user);
			if(tempUser!=null)
			{
				session.setAttribute("myuser", tempUser);
				request.setAttribute("mymsg", "登录成功!");
			}else{
				request.setAttribute("mymsg", "登录失败!");
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/atm/mysuc.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	
		
	
	}

}
