package com.isoft.one.atm.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.isoft.one.atm.model.TSysUser;
import com.isoft.one.atm.service.ISysUserService;
import com.isoft.one.atm.service.SysUserService;

public class MenuService {

	ISysUserService userService = new SysUserService();
	
	
	public void myError()
	{
		  System.out.println("����ѡ���д���!");
	}
	public int createMenu()
	{
		 return 0;
	}
	
	
	public void getUserLeftCash() throws IOException, ClassNotFoundException, SQLException
	{
		  InputStreamReader isr = new InputStreamReader(System.in);	
		   BufferedReader bufferReader = new BufferedReader(isr);
		   TSysUser user = new TSysUser();
		   System.out.println("�������û���:");
		   TSysUser sysUser = userService.getUserByUserName(bufferReader.readLine());
		   
		   String leftMoney = userService.getAccountLeftCash(sysUser);
		   System.out.println("�û���ǰ���:"+leftMoney);
	}
	
	public void login() throws IOException, ClassNotFoundException, SQLException
	{
		  InputStreamReader isr = new InputStreamReader(System.in);	
		   BufferedReader bufferReader = new BufferedReader(isr);
		   TSysUser user = new TSysUser();
		   System.out.println("�������û���:");
		   user.setSysUserName(bufferReader.readLine());
		   
		   System.out.println("����������:");
		   user.setSysUserPwd(bufferReader.readLine());
		   
		   if(userService.login(user))
		   {
			   System.out.println("��¼�ɹ�!");
		   }else{
			   System.out.println("��¼ʧ��!");
		   }
	}
}
