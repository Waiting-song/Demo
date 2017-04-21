package com.isoft.myinterface;

public class MyStudent {
	private String stuno;
	private String sname;
	private String gender;
	private int sage;
	// overload 重载 在当前类中 一些方法名称完全相同，但是参数不同 这种现象叫重载
	// this 指的是 当前类被实例化的对象 
	// 构造函数 3种不同 1.类型不同 2.个数不同 3.顺序不同 
	public MyStudent(String sname) {
		this.sname = sname;
	}
	
	public MyStudent(String sname, int sage) {
		this.sname = sname;
		this.sage = sage;
	}
	
	public MyStudent( int sage,String sname) {
		this.sname = sname;
		this.sage = sage;
	}
	
	public void getUserList(String userName)
	{
		String temp = new String();
		
	}
	
	public void getUserList(int age)
	{
		
	}


	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	
	
}
