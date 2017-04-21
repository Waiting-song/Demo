package com.isoft.model;

public class TestStudent {

	public static void main(String[] args) {
		testWangjianlin();
		

	}
	
	public static void testWangjianlin()
	{
		Person person1 = new Person();
		person1.setSkinColor("黄种人");
	
		
		Wangjianlin wang = new Wangjianlin();
		wang.setGerder("男");
		wang.setSname("王健林");
		System.out.println(wang.getSname());
	
	}
	
	public static void testStudent()
	{
		// 实例化 
		Student zhangquandan = new Student();
		zhangquandan.setSname("张全蛋");
		zhangquandan.setGender("男");
		zhangquandan.setSage("84");
		
		Student wanggangdan = new Student();
		wanggangdan.setSname("王刚蛋");
		wanggangdan.setGender("女");
		wanggangdan.setSage("73");
		
		System.out.println("姓名："+zhangquandan.getSname());
		
	}

}
