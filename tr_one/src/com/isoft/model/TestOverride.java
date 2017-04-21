package com.isoft.model;

public class TestOverride {

	public static void main(String args[])
	{
		   // 重写 override 1.两个类之间的关系  是一种继承关系 
	       //  2. 子类 与 父类之间 方法名 保持一致 
		Wangjianlin father = new Wangjianlin();
		Wangjianlin kfc = new Wangsicong();
		
		father.driving();
		kfc.driving();
	}
}
