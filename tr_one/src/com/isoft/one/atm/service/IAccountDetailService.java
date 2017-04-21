package com.isoft.one.atm.service;

import java.sql.SQLException;
import java.util.List;

import com.isoft.one.atm.model.TAccountDetail;

public interface IAccountDetailService {
	// ´æÇ®
	public boolean deposit(TAccountDetail detail) throws ClassNotFoundException, SQLException;
	// È¡Ç®
	public boolean getCash(TAccountDetail detail) throws ClassNotFoundException, SQLException;
    // ×ªÕË 
	public boolean transfor(TAccountDetail detail) throws ClassNotFoundException, SQLException;
	
	public List getAccountDetail(TAccountDetail detail) throws ClassNotFoundException, SQLException;
	
}
