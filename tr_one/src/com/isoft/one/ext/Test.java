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
		WangSiCong sicong = new WangSiCong(30,"某电影明星");
		System.out.println(sicong.getWage());
		System.out.println(sicong.getGirlFriend());
		
	
	}
	
	
	public static void test1()
	{
		Student xumei = new Student();
		xumei.setSname("徐美");
		xumei.setSgender("女");
		
		Student zhaoteifei = new Student();
		zhaoteifei.setSname("赵铁飞");
		zhaoteifei.setSgender("男");
		
		System.out.println(xumei);
		System.out.println(xumei.getSname()+"---");
		System.out.println(zhaoteifei.getSname());
	}

}
