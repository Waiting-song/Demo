package com.isoft.one.atm.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.isoft.one.atm.model.TAccountDetail;
import com.isoft.one.atm.model.TSysUser;

public interface ISysUserService {

	public TSysUser getUserByUserName(String userName) throws ClassNotFoundException, SQLException;
	
	public boolean registerUser(TSysUser user) throws ClassNotFoundException, SQLException;
	// 2.�޸�����
	public boolean changePwd(TSysUser user) throws ClassNotFoundException, SQLException;
	// 3.��¼
	public TSysUser login(TSysUser user) throws ClassNotFoundException, SQLException;
	// 4. ����û����Ƿ����
	public boolean checkUserName(TSysUser user) throws ClassNotFoundException, SQLException;
	// 5.�˳�ϵͳ ע��
	public void logout(TSysUser user);
	// �鿴��ǰ�û� ���
	public String getAccountLeftCash(TSysUser user) throws ClassNotFoundException, SQLException;
	// �鿴��ǰ�û� ���  �Ƿ���ȡǮ
	public boolean haveCashOrNot(TSysUser user,String getMoney) throws ClassNotFoundException, SQLException;
}
