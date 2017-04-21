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

@WebServlet("/saveURL")
public class saveServlet extends HttpServlet{

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
        
        String deposit = req.getParameter("depositNum");
        String userId = req.getParameter("userId");
        String result ="";
        try {
        //¥Ê«Æ
	        TAccountDetail save = new TAccountDetail();
	        save.setAccountId(UUID.randomUUID().toString());
	        save.setActionType("¥Ê«Æ");
	        save.setSysUserId(userId);
	        save.setCash(deposit);
	        save.setSysUserId(user.getSysUserId());
	  
			if(detailService.deposit(save))
			{
				result="¥Ê«Æ≥…π¶£°";
			}
			else{
				result="¥Ê«Æ ß∞‹£°";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        resp.getWriter().write(result);
	}
}