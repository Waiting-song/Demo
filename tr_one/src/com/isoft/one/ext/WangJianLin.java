package com.isoft.one.ext;
// javabean 
public class WangJianLin {

	private String pname;
	private String company;
	public int wage;
	private String car;
	
	public final void speak(){
		System.out.println("�ְ�˵,����Ҫ����һ��СĿ�꣬��һʵ�ֲ�����");
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	
	
}
