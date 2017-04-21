package com.isoft.one.atm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.isoft.one.atm.model.TAccountDetail;
import com.isoft.one.atm.model.TSysUser;
import com.isoft.one.atm.service.AccountDetail;
import com.isoft.one.atm.service.IAccountDetailService;
import com.isoft.one.atm.service.ISysUserService;
import com.isoft.one.atm.service.SysUserService;

@WebServlet("/getURL")
public class getServlet extends HttpServlet{

	private ISysUserService userService = new SysUserService();
	private IAccountDetailService detailService = new AccountDetail();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        
        HttpSession session = req.getSession();
        TSysUser user = (TSysUser)session.getAttribute("myuser");
        
        String getcash = req.getParameter("getNum");
        String userId = req.getParameter("userId");
        String result ="";
        try {
        //取钱
        	if(userService.haveCashOrNot(user,getcash)){
		        TAccountDetail get = new TAccountDetail();
		        get.setAccountId(UUID.randomUUID().toString());
		        get.setActionType("取钱");
		        get.setSysUserId(userId);
		        get.setCash("-"+getcash);
		        get.setSysUserId(user.getSysUserId());
		  
				if(detailService.getCash(get))
				{
					result="取款成功！";
				}
				else{
					result="取款失败！";
				}
        	}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        resp.getWriter().write(result);
	}
}