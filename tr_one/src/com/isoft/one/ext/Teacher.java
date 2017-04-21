package com.isoft.one.ext;

public class Teacher extends Person{
  
    private int salary;
    private String car;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	@Override
	public void eating() {
	System.out.println("³ÔºÃ³ÔµÄ");
		
	}
	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		
	}
	
    

    
    
    
}
