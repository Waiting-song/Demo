package com.isoft.one.atm.service;

import java.sql.SQLException;

import com.isoft.one.atm.dao.TSysUserDao;
import com.isoft.one.atm.model.TAccountDetail;
import com.isoft.one.atm.model.TSysUser;
// 服务实现层
public class SysUserService implements ISysUserService {

	private TSysUserDao sysUserDao = new TSysUserDao();
	@Override
	public boolean registerUser(TSysUser user) throws ClassNotFoundException, SQLException {
		return sysUserDao.registerUser(user);
	}

	@Override
	public boolean changePwd(TSysUser user) throws ClassNotFoundException, SQLException {
	return sysUserDao.changePwd(user);
	}

	@Override
	public TSysUser login(TSysUser user) throws ClassNotFoundException, SQLException {
		return sysUserDao.login(user);
	}

	@Override
	public boolean checkUserName(TSysUser user) throws ClassNotFoundException, SQLException {
	return sysUserDao.checkUserName(user);
	}

	@Override
	public void logout(TSysUser user) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAccountLeftCash(TSysUser user) throws ClassNotFoundException, SQLException {
		return sysUserDao.getAccountLeftCash(user);
		
	}

	@Override
	public boolean haveCashOrNot(TSysUser user,String getMoney) throws ClassNotFoundException, SQLException {
		int leftCash = Integer.valueOf(getAccountLeftCash(user));
		int getCash = Integer.valueOf(getMoney);
		if(getCash>leftCash)
		{
			return false;
		}
		return true;
	}

	@Override
	public TSysUser getUserByUserName(String userName) throws ClassNotFoundException, SQLException {
	  return sysUserDao.getUserByUserName(userName);
	}

}
