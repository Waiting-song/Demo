package com.isoft.one.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestMyJDBC {

	@Test
	public void test1() throws ClassNotFoundException, SQLException
	{
		final String userName = "hr";
		final String userPwd = "hr";
		final String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		/**
		 * 1. Ѱ����������  ��� connection ����
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, userName, userPwd);
		/**
		 * 2. ����statement���� ����sql����
		 */
		Statement stmt = conn.createStatement();
		String sql = "select * from emp e where e.deptno=30";
		ResultSet resultSet = stmt.executeQuery(sql);
		while(resultSet.next())
		{
			// 1.ȡֵ �������� column name
			System.out.println(resultSet.getString("ename")+"----"+resultSet.getString("comm")+"----"+resultSet.getString("deptno"));
			// 2.ȡֵ �������� column index
						//System.out.println(resultSet.getString(1)+"----"+resultSet.getString(2));
		}
		
		resultSet.close();
		stmt.close();
		conn.close();
		
		
	}
	
	@Test
	public void test2() throws ClassNotFoundException, SQLException
	{
		final String userName = "hr";
		final String userPwd = "hr";
		final String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		/**
		 * 1. Ѱ����������  ��� connection ����
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, userName, userPwd);
		
		String sql = "update emp e set e.comm=6000 where e.deptno=30";
		Statement stmt = conn.createStatement();
		int resultnum = stmt.executeUpdate(sql);
		System.out.println("������"+resultnum+"��");
		stmt.close();
		conn.close();
	}
}
