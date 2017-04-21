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

@WebServlet("/transCashURL")
public class TransCashServlet extends HttpServlet{

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
        
        String cash = req.getParameter("cashNum");
        // 转入方 id
        String transUserId = req.getParameter("transUserId");
        String result ="";
		try {
			// 检查当前账户余额是否充足
			if(userService.haveCashOrNot(user,cash))
			{
			     // 如果余额充足 可以转账
				TAccountDetail detail = new TAccountDetail();
				detail.setAccountId(UUID.randomUUID().toString());
				detail.setActionType("转出");
			    detail.setCash("-"+cash);
			    detail.setSysUserId(user.getSysUserId());
			    detail.setTransUserId(transUserId);
			    
			    // 如果转出成功
			    if(detailService.transfor(detail))
			    {
			    	// 开始转入
			    	TAccountDetail fdetail = new TAccountDetail();
					fdetail.setAccountId(UUID.randomUUID().toString());
					fdetail.setActionType("转入");
					fdetail.setSysUserId(transUserId);
					fdetail.setCash(cash);
					fdetail.setTransUserId("");
					fdetail.setFromUserId(user.getSysUserId());
					
					if(detailService.transfor(fdetail))
					{
						result="转账成功!";
					}
				else{
					result="转账失败!";
				}
			    	
			    }else{
			    	result="账户转出失败";
			    }
				
			}else{
				result="余额不足,不能转账";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		resp.getWriter().write(result);
		
		/*req.setAttribute("myresult", result);
		RequestDispatcher dis = req.getRequestDispatcher("/jsp/atm/result.jsp");
		dis.forward(req, resp);*/
		
	}

	
}
