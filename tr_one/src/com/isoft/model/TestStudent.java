package com.isoft.model;

public class TestStudent {

	public static void main(String[] args) {
		testWangjianlin();
		

	}
	
	public static void testWangjianlin()
	{
		Person person1 = new Person();
		person1.setSkinColor("������");
	
		
		Wangjianlin wang = new Wangjianlin();
		wang.setGerder("��");
		wang.setSname("������");
		System.out.println(wang.getSname());
	
	}
	
	public static void testStudent()
	{
		// ʵ���� 
		Student zhangquandan = new Student();
		zhangquandan.setSname("��ȫ��");
		zhangquandan.setGender("��");
		zhangquandan.setSage("84");
		
		Student wanggangdan = new Student();
		wanggangdan.setSname("���յ�");
		wanggangdan.setGender("Ů");
		wanggangdan.setSage("73");
		
		System.out.println("������"+zhangquandan.getSname());
		
	}

}
