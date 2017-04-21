package com.isoft.one.atm.service;

import java.sql.SQLException;
import java.util.List;

import com.isoft.one.atm.dao.AccountDetailDao;
import com.isoft.one.atm.dao.TSysUserDao;
import com.isoft.one.atm.model.TAccountDetail;

public class AccountDetail implements IAccountDetailService {

	private AccountDetailDao detailDao = new AccountDetailDao();
	private TSysUserDao sysUserDao = new TSysUserDao();
	@Override
	public boolean deposit(TAccountDetail detail) throws ClassNotFoundException, SQLException {
		String accountID = detailDao.insertDetail(detail);
		if(accountID!=null){
			detail.setAccountId(accountID);
			if(detailDao.updateDetail(detail))
			{
				return true;
			}else{
				return false;
			}
		
		}
		return false;
	}
	@Override
	public boolean getCash(TAccountDetail detail) throws ClassNotFoundException, SQLException {
		String accountID = detailDao.insertDetail(detail);
		if(accountID!=null){
			detail.setAccountId(accountID);
			if(detailDao.minusDetail(detail))
			{
				return true;
			}else{
				return false;
			}
		
		}
		return false;
	}
	@Override
	public boolean transfor(TAccountDetail detail) throws ClassNotFoundException, SQLException {
		String accountID = detailDao.insertDetail(detail);
		if(accountID!=null){
			
			if(detailDao.updateDetail(detail))
			{
				return true;
			}else{
				return false;
			}
			
		}
		return false;
	}
	@Override
	public List getAccountDetail(TAccountDetail detail) throws ClassNotFoundException, SQLException {
	return detailDao.getDetailList(detail);
	}

}
