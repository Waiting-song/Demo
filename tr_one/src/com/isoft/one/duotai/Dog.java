package com.isoft.one.duotai;

public class Dog extends Animal {

	private String dogType;
	private String dogName;
	
	 public void eat() {  
        System.out.println("�Թ�ͷ");  
    }  
    public void work() {  
        System.out.println("����");  
    }
	public String getDogType() {
		return dogType;
	}
	public void setDogType(String dogType) {
		this.dogType = dogType;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}  
    
    

}
