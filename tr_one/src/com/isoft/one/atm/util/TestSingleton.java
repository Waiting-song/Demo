package com.isoft.one.atm.util;

import com.isoft.one.atm.model.TSysUser;

public class TestSingleton {

	public static void main(String[] args) {
		DBUtil util1 = DBUtil.getInstance();
		DBUtil util2 = DBUtil.getInstance();
		DBUtil util3 = DBUtil.getInstance();
		if(util2==util3)
		{
			System.out.println("������� ����ͬһ������");
		}else{
			System.out.println("�������");
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
			System.out.println("�ַ������");
		}else{
			System.out.println("�ַ��������");
		}
		
		// �жϵ�ַ�Ƿ���ͬ
		if(user1==user2)
		{
			System.out.println("ͬһ������");
		}else{
			System.out.println("��ͬ�Ķ���");
		}
	}
}
