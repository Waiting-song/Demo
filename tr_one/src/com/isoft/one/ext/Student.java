package com.isoft.one.ext;
// �������  C ����
// ������� oo 
//��ʵ�����һ�ֳ��� 
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
		System.out.println("�Է�����");
		
	}
	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
