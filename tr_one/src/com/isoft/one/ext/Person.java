package com.isoft.one.ext;

// 类的进一步抽象
public abstract class Person {
	private String sname;
	private String sgender;
	private int tage;
	// 3.抽象类主要就是为了被继承 
	// 1.抽象类的抽象方法 没有方法体    
	// 2. 继承了抽象类的子类，必须重写父类的抽象方法
	public abstract void eating();

	public abstract void sleeping();
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	  
	
	  
}
