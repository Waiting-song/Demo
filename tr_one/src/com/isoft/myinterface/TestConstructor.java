package com.isoft.myinterface;

public class TestConstructor {

	public static void main(String args[])
	{
		// 类被实例化的时候 调用自身的构造方法
		// 通过参数识别调用不同的构造方法
			MyStudent stu = new MyStudent("tom");
			System.out.println(stu.getSname());
			
			MyStudent stu1 = new MyStudent("tom",84);
			
			
	}
}
