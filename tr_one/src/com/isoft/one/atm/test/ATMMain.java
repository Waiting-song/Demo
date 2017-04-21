package com.isoft.one.atm.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.isoft.one.atm.service.ISysUserService;
import com.isoft.one.atm.service.SysUserService;

public class ATMMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		

	}
	
	public void test() throws IOException, ClassNotFoundException, SQLException
	{
		MainMenu menu = new MainMenu();
		MenuService menuService = new MenuService();
		
		boolean pursue = false;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		do{
			menu.createMenu();
			String option = br.readLine();
			switch(option.charAt(0))
			{
					case '1':  menuService.login();
				    break;
				    
					case '2':  menuService.getUserLeftCash();
				    break;
			
					default:  menuService.myError();
					System.out.println("是否退出系统 ?(Y/N)");
					String result = br.readLine();
					if(result.equals("Y")||result.equals("y"))
					{
						System.exit(0);//退出系统
						break;
					}
			}
			
			System.out.println("是否继续操作 ?(Y/N)");
			String result = br.readLine();
			if(result.equals("Y")||result.equals("y"))
			{
				pursue=true;
			}else{
				pursue=false;
			}
		
			
		}while(pursue);
	}

}
