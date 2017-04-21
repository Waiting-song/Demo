package com.isoft.one.atm.util;

import com.isoft.one.atm.model.TSysUser;

public class TestSingleton {

	public static void main(String[] args) {
		DBUtil util1 = DBUtil.getInstance();
		DBUtil util2 = DBUtil.getInstance();
		DBUtil util3 = DBUtil.getInstance();
		if(util2==util3)
		{
			System.out.println("对象相等 就是同一个对象");
		}else{
			System.out.println("对象不相等");
		}
	}

	public void test()
	{
        TSysUser user1 = new TSysUser();
		
		TSysUser user2= new TSysUser();
		
		String a ="hello";
		String b ="world";
		if(a.equals(b))
		{
			System.out.println("字符串相等");
		}else{
			System.out.println("字符串不相等");
		}
		
		// 判断地址是否相同
		if(user1==user2)
		{
			System.out.println("同一个对象");
		}else{
			System.out.println("不同的对象");
		}
	}
}
