package com.isoft.one.atm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	private static DBUtil util=null;
	private DBUtil()
	{
		
	}
	
	public static DBUtil getInstance()
	{
		if(util==null)
		{
			 util = new DBUtil();
		}

		return util;
	}
	// singleton 单例设计模式  1.new 封死 
	public boolean openTransaction(String sql) throws SQLException, ClassNotFoundException
	{
		Connection conn = this.getConn();
		Statement stmt = conn.createStatement();
		if(stmt.executeUpdate(sql)>0)
		{
			this.close(conn, stmt);
			return true;
		}
		return false;
	}
	
	public ResultSet getDBResult(String sql) throws SQLException, ClassNotFoundException
	{
		Connection conn = this.getConn();
		Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(sql);
		return rs;
	}
	
	public Connection getConn() throws ClassNotFoundException, SQLException
	{
		final String userName = "system";
		final String userPwd = "213456";
		final String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		/**
		 * 1. 寻找驱动程序  获得 connection 对象
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, userName, userPwd);
		return conn;
	}
	
	public void close(Connection conn,Statement stmt,ResultSet rs) throws SQLException
	{
		rs.close();
		stmt.close();
		conn.close();
	}
	
	public void close(Connection conn,Statement stmt) throws SQLException
	{
		stmt.close();
		conn.close();
	}
}
