package com.isoft.one.atm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.isoft.one.atm.model.TSysUser;
import com.isoft.one.atm.util.DBUtil;

public class TSysUserDao {

	public TSysUser getUserByUserName(String userName) throws ClassNotFoundException, SQLException{
		String sql = "select * from t_sys_user u where u.t_sysuser_name='"+userName+"' ";
		Connection conn = DBUtil.getInstance().getConn();
		Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(sql);
	    TSysUser user=null;
		while(rs.next())
		{
			user = new TSysUser();
			user.setSysUserId(rs.getString("t_sysuser_id"));
			user.setSysUserName(rs.getString("t_sysuser_name"));
			user.setSysUserName(rs.getString("t_sysuser_pwd"));
		}
	    
	     
			DBUtil.getInstance().close(conn, stmt, rs);
			return user;
		
	
	}
	
	// 1.用户注册
	
	public boolean registerUser(TSysUser user) throws ClassNotFoundException, SQLException{
		String sql = "insert into t_sys_user values('"+user.getSysUserId()+"','"+user.getSysUserName()+"','"+user.getSysUserPwd()+"')";
		System.out.println("注册sql----"+sql);
		return DBUtil.getInstance().openTransaction(sql);
	}
	// 2.修改密码
	public boolean changePwd(TSysUser user) throws SQLException, ClassNotFoundException{
		String sql = "update t_sys_user s set s.t_sysuser_pwd='"+user.getSysUserPwd()+"' where s.t_sysuser_name='"+user.getSysUserName()+"'";
		return DBUtil.getInstance().openTransaction(sql);
	}
	// 3.登录
	public TSysUser login(TSysUser user) throws ClassNotFoundException, SQLException{
		String sql = "select * from t_sys_user u where u.t_sysuser_name='"+user.getSysUserName()+"' and u.t_sysuser_pwd='"+user.getSysUserPwd()+"'";
		Connection conn = DBUtil.getInstance().getConn();
		Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(sql);
	    TSysUser sysUser = new TSysUser();
	    while(rs.next())
	    {
	    	sysUser.setSysUserId(rs.getString(1));
	    	sysUser.setSysUserName(rs.getString(2));
	    	sysUser.setSysUserPwd(rs.getString(3));
	    }
	   return sysUser;
	}
	// 4. 检查用户名是否存在
	public boolean checkUserName(TSysUser user) throws ClassNotFoundException, SQLException{
		String sql = "select 1 from t_sys_user t where t.t_sysuser_name='"+user.getSysUserName()+"'";
		Connection conn = DBUtil.getInstance().getConn();
		Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(sql);
		
		if(rs.next())
		{
			DBUtil.getInstance().close(conn, stmt, rs);
			return false;
		}
		return true;
	}
	// 5.退出系统 注销
	public void logout(TSysUser user){
		
	}
	
	public String getAccountLeftCash(TSysUser user) throws ClassNotFoundException, SQLException {
		String sql = "select sum(d.t_cash) leftmoney from t_account_detail d where d.t_sysuser_id='"+user.getSysUserId()+"'";
		Connection conn = DBUtil.getInstance().getConn();
		Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(sql);
	    String leftMoney="";
	    while(rs.next())
	    {
	    	 leftMoney = rs.getString("leftmoney");
	    }
		
		return leftMoney;
	}
	
	 
}
