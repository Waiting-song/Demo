package com.isoft.one.atm.test;

import java.sql.SQLException;
import java.util.UUID;

import org.junit.Test;

import com.isoft.one.atm.dao.AccountDetailDao;
import com.isoft.one.atm.model.TAccountDetail;
import com.isoft.one.atm.model.TSysUser;
import com.isoft.one.atm.service.ISysUserService;
import com.isoft.one.atm.service.SysUserService;
import com.isoft.one.atm.util.DBUtil;

public class TestATM {
	private AccountDetailDao detailDao = new AccountDetailDao();
	private ISysUserService userService = new SysUserService();
	@Test
	public void testBuffer()
	{
		StringBuffer buffer = new StringBuffer("2, 5, 6, 2, 0,");
		 System.out.println(buffer.substring(0,buffer.length()-1));
		 System.out.println(buffer.toString());
	}
	
	@Test
	public void testString()
	{
		String a ="90";
		String b = "-180";
		
		System.out.println( b.substring(1));
		int anum = Integer.valueOf(a);
		int bnum = Integer.valueOf(b);
		if(anum>bnum)
		{
			  System.out.println("a 大于 b");
		}else{
			System.out.println("a 小于 b");
		}
	  
				
	}
	
	@Test
	public void test() throws ClassNotFoundException, SQLException
	{
		TSysUser user = new TSysUser();
		user.setSysUserId("789");
		user.setSysUserName("jack");
		user.setSysUserPwd("000");

		if(userService.registerUser(user))
		{
			System.out.println("注册成功");
		}else{
			System.out.println("注册失败");
		}
		
	}
	
	@Test
	public void testUpdate() throws ClassNotFoundException, SQLException
	{
		TSysUser user = new TSysUser();
		user.setSysUserName("jack");
		user.setSysUserPwd("666");
		
		if(userService.changePwd(user))
		{
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
		
	}
	
	@Test
	public void testLogin() throws ClassNotFoundException, SQLException
	{
		TSysUser user = new TSysUser();
		user.setSysUserName("jack");
		user.setSysUserPwd("666");
		
		if(userService.login(user))
		{
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
		
	}
	
	@Test
	public void testInsert() throws ClassNotFoundException, SQLException
	{
		TAccountDetail detail = new TAccountDetail();
		detail.setAccountId(UUID.randomUUID().toString());
		detail.setActionType("存钱");
		detail.setSysUserId("123");
		detail.setCash("100");
		detail.setTransUserId("");
		detail.setFromUserId("");
		String accountId = detailDao.insertDetail(detail);
		if(detailDao.updateDetail(detail))
		{
			System.out.println("存钱成功!");
		}else{
			System.out.println("存钱失败!");
		}
		
	}
	
	@Test
	public void testMinus() throws ClassNotFoundException, SQLException
	{
		TAccountDetail detail = new TAccountDetail();
		detail.setAccountId(UUID.randomUUID().toString());
		detail.setActionType("取钱");
		detail.setSysUserId("123");
		detail.setCash("-900");
		detail.setTransUserId("");
		detail.setFromUserId("");
		
		TSysUser user = new TSysUser();
		user.setSysUserId("123");
		if(userService.haveCashOrNot(user,detail.getCash())){
			String accountId = detailDao.insertDetail(detail);
			detail.setAccountId(accountId);
			if(detailDao.updateDetail(detail))
			{
				System.out.println("取钱成功!");
			}else{
				System.out.println("取钱失败!");
			}
		}else{
			System.out.println("你没钱啦!");
		}
		
		
		
	}
	@Test
	public void testCheckUserName() throws ClassNotFoundException, SQLException
	{
		TSysUser user = new TSysUser();
		user.setSysUserName("kite123");
		if(userService.checkUserName(user))
		{
			System.out.println("用户名可以使用");
		}else{
			System.out.println("用户名已被占用");
		}
	}
	
	@Test
	public void testUserLeftCash() throws ClassNotFoundException, SQLException
	{   // 123     300      444  800
		TSysUser user = new TSysUser();
		user.setSysUserId("123");
		System.out.println("测试余额"+userService.getAccountLeftCash(user));
	}
	
	// 转入
	public boolean transforFrom(TAccountDetail detail) throws ClassNotFoundException, SQLException
	{
		String dID= detailDao.insertDetail(detail);
		 if(dID!=null&&!"".equals(dID))
		 {
			 if(detailDao.updateDetail(detail))
				{
					System.out.println("转入成功!");
					return true;
				}else{
					System.out.println("转入失败!");
					return false;
				}
			 
		 }
		 return false;
		
	}
	
	@Test
	public void testTransfor() throws ClassNotFoundException, SQLException
	{
		TAccountDetail detail = new TAccountDetail();
		detail.setAccountId(UUID.randomUUID().toString());
		detail.setActionType("转出");
		detail.setSysUserId("444");
		detail.setCash("-300");
		detail.setTransUserId("123");
		detail.setFromUserId("");
		
		TSysUser user = new TSysUser();
		user.setSysUserId("444");
		if(userService.haveCashOrNot(user,detail.getCash())){
			String accountId = detailDao.insertDetail(detail);
			//detail.setAccountId(accountId);
			if(detailDao.updateDetail(detail))
			{// 转出成功 
				// 开始转入
				TAccountDetail fdetail = new TAccountDetail();
				fdetail.setAccountId(UUID.randomUUID().toString());
				fdetail.setActionType("转入");
				fdetail.setSysUserId("123");
				fdetail.setCash("300");
				fdetail.setTransUserId("");
				fdetail.setFromUserId("444");
				if(transforFrom(fdetail))
				{
					System.out.println("转账成功!");
				}
			else{
				System.out.println("转账失败!");
			}
		}else{
			System.out.println("转出失败!");
		}
		
		}else{
			System.out.println("你没钱啦!");
		}
		
	}
	
	@Test
	public void test1(){
		System.out.println("hello");
		
	}
}
