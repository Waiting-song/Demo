package com.isoft.one.ext;
// 面向过程  C 语言
// 面向对象 oo 
//现实世界的一种抽象 
public class Student extends Person{

	private String sno;
	private String course;
	private String apartment;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	@Override
	public void eating() {
		System.out.println("吃方便面");
		
	}
	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
