package com.isoft.one.atm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.isoft.one.atm.model.TAccountDetail;
import com.isoft.one.atm.model.TSysUser;
import com.isoft.one.atm.util.DBUtil;

public class AccountDetailDao {

	public List getDetailList(TAccountDetail detail) throws ClassNotFoundException, SQLException{
		String sql = "select * from t_account_detail t where t.t_sysuser_id='"+detail.getSysUserId()+"'";
		Connection conn = DBUtil.getInstance().getConn();
		Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(sql);
	    List detailList =  new ArrayList();
	    while(rs.next())
	    {
	    	TAccountDetail tdetail = new TAccountDetail();
	    	tdetail.setAccountId(rs.getString(1));
	    	tdetail.setSysUserId(rs.getString(2));
	    	tdetail.setActionType(rs.getString(3));
	    	tdetail.setCash(rs.getString(4));
	    	tdetail.setTotal(rs.getString(5));
	    	tdetail.setTdate(rs.getString(6));
	    	
	    	detailList.add(tdetail);
	    }
	   return detailList;
	}
	
	public String insertDetail(TAccountDetail detail) throws ClassNotFoundException, SQLException
	{
		String sql = "insert into t_account_detail values('"+detail.getAccountId()+"','"+detail.getSysUserId()+"','"+detail.getActionType()+"','"+detail.getCash()+"','',to_char(sysdate,'YYYY-MM-DD HH24:MI:SS'),'"+detail.getTransUserId()+"','"+detail.getFromUserId()+"')";
		if(DBUtil.getInstance().openTransaction(sql))
		{
			return detail.getAccountId();
		}
		return null;
	
	}
	/**
	 *
	 * @param detail
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean updateDetail(TAccountDetail detail) throws ClassNotFoundException, SQLException
	{
		String sql = "update t_account_detail t set t.t_total="
				+ "(select sum(e.t_cash) from t_account_detail e where e.t_sysuser_id='"+detail.getSysUserId()+"') "
				+ "where t.t_account_id='"+detail.getAccountId()+"'";
		if(DBUtil.getInstance().openTransaction(sql))
		{
			return true;
		}
		return false;
	
	}
	
	public boolean minusDetail(TAccountDetail detail) throws ClassNotFoundException, SQLException
	{
		String sql = "update t_account_detail t set t.t_total"
				+ "=((nvl(to_number((select sum(t.t_cash) from t_account_detail t "
				+ "where t.t_action_type='¥Ê«Æ')),0)"
				+ "-nvl(to_number((select sum(ee.t_cash) from "
				+ "t_account_detail ee where ee.t_action_type='»°«Æ')),0))) "
				+ "where t.t_account_id='"+detail.getAccountId()+"' and t.t_sysuser_id='"+detail.getSysUserId()+"'";
		
		
		if(DBUtil.getInstance().openTransaction(sql))
		{
			return true;
		}
		return false;
	}
}
