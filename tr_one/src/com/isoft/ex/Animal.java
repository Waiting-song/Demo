package com.isoft.ex;
// 自定义类型
public class Animal {
	 private String name;  
	    private int id; 
	    // 1.显式的构造方法 2.隐式的构造方法
	 /*   public Animal(String myName, int myid) { 
	        name = myName; 
	        id = myid;
	    } */
	    public void eat(){ 
	        System.out.println(name+"正在吃"); 
	    }
	    public void sleep(){
	        System.out.println(name+"正在睡");
	    }
	    public void introduction() { 
	        System.out.println("大家好！我是"         + id + "号" + name + "."); 
	    } 
	    
	    public void move(){
	        System.out.println("动物可以移动");
	     }
}
