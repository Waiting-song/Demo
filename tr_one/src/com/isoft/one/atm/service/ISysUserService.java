package com.isoft.one.atm.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.isoft.one.atm.model.TAccountDetail;
import com.isoft.one.atm.model.TSysUser;

public interface ISysUserService {

	public TSysUser getUserByUserName(String userName) throws ClassNotFoundException, SQLException;
	
	public boolean registerUser(TSysUser user) throws ClassNotFoundException, SQLException;
	// 2.修改密码
	public boolean changePwd(TSysUser user) throws ClassNotFoundException, SQLException;
	// 3.登录
	public TSysUser login(TSysUser user) throws ClassNotFoundException, SQLException;
	// 4. 检查用户名是否存在
	public boolean checkUserName(TSysUser user) throws ClassNotFoundException, SQLException;
	// 5.退出系统 注销
	public void logout(TSysUser user);
	// 查看当前用户 余额
	public String getAccountLeftCash(TSysUser user) throws ClassNotFoundException, SQLException;
	// 查看当前用户 余额  是否还能取钱
	public boolean haveCashOrNot(TSysUser user,String getMoney) throws ClassNotFoundException, SQLException;
}
