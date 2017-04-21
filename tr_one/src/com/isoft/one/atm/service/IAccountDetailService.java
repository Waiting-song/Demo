package com.isoft.one.atm.service;

import java.sql.SQLException;
import java.util.List;

import com.isoft.one.atm.model.TAccountDetail;

public interface IAccountDetailService {
	// ��Ǯ
	public boolean deposit(TAccountDetail detail) throws ClassNotFoundException, SQLException;
	// ȡǮ
	public boolean getCash(TAccountDetail detail) throws ClassNotFoundException, SQLException;
    // ת�� 
	public boolean transfor(TAccountDetail detail) throws ClassNotFoundException, SQLException;
	
	public List getAccountDetail(TAccountDetail detail) throws ClassNotFoundException, SQLException;
	
}
