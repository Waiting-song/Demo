package com.isoft.myinterface;

// 类的进一步抽象  被继承才有意义
// 抽象类 不能被实例化 
public abstract class CommonStudent {

	// constructor 构造函数
	public CommonStudent(){
		
	}
	
	public CommonStudent(String sname){
		
	}
	
	private String stuno;
	private String sname;
	private String gender;
	private int sage;
	
	// 抽象方法不能指定方法体
	// 普通类当中 不能有抽象方法
	public abstract void study();
	
	public abstract void lol();
	
	// 抽象类中 可以有普通方法
	public void eating(){
		
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
