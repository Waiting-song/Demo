package com.isoft.one.ext;

public class Test {

	public static void main(String[] args) {
		
		test3();
	}
	
	public static void test2()
	{
		  WangJianLin father = new WangJianLin();
		 // father.speak();
		  
		  WangJianLin sicong = new WangSiCong();
		  sicong.speak();
		
	    
	}
	
	public static void test3(){
		WangSiCong sicong = new WangSiCong(30,"ĳ��Ӱ����");
		System.out.println(sicong.getWage());
		System.out.println(sicong.getGirlFriend());
		
	
	}
	
	
	public static void test1()
	{
		Student xumei = new Student();
		xumei.setSname("����");
		xumei.setSgender("Ů");
		
		Student zhaoteifei = new Student();
		zhaoteifei.setSname("������");
		zhaoteifei.setSgender("��");
		
		System.out.println(xumei);
		System.out.println(xumei.getSname()+"---");
		System.out.println(zhaoteifei.getSname());
	}

}
