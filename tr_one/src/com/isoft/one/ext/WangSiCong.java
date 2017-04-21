package com.isoft.one.ext;

public class WangSiCong extends WangJianLin{

	private String pname;
	public String girlFriend;
	public int wage;
	
	//无参数的构造函数 
	public WangSiCong()
	{
		
		System.out.println("我交朋友不在乎有钱没钱");
	}
	//  overload 重载  1.同一个类 方法名完全相同 但是 参数不同 (1.个数 2.类型 3.顺序)
	public WangSiCong(String gf)
	{
		this.girlFriend=gf;
		System.out.println("我的女朋友");
	}
	
	public WangSiCong(int myage)
	{
		System.out.println("我的年龄");
		this.wage=myage;
	}
	
	public WangSiCong(int myage,String gf)
	{
		System.out.println("我的年龄");
		this.wage=myage;
		System.out.println("我的女朋友");
		this.girlFriend=gf;
		
	}
	
	public WangSiCong(String gf,int myage)
	{
		System.out.println("我的年龄");
		this.wage=myage;
		System.out.println("我的女朋友");
		this.girlFriend=gf;
		
	}
	
	
	
	// 重写  
	/**
	 * 1.重写是两个类之间的关系 两个类必须具有继承关系 
	 * 2.两个类的方法必须完全一样(方法名 参数 返回值 权限)
	 */
	
	public void mySpeak()
	{
		System.out.println("儿子说");
		super.speak();
		// 一个实例 属性 赋值
		this.girlFriend="beauty";
	}
	public String getGirlFriend() {
		return girlFriend;
	}
	public void setGirlFriend(String girlFriend) {
		this.girlFriend = girlFriend;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	
	
	
}
