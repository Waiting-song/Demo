package com.isoft.one.ext;
// javabean 
public class WangJianLin {

	private String pname;
	private String company;
	public int wage;
	private String car;
	
	public final void speak(){
		System.out.println("爸爸说,人生要订立一个小目标，万一实现不了呢");
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
