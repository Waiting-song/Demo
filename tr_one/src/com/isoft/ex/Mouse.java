package com.isoft.ex;

public class Mouse {
	 private String name; 
	    private int id; 
	    public Mouse(String myName, int  myid) { 
	        name = myName; 
	        id = myid; 
	    } 
	    public void eat(){ 
	        System.out.println(name+"���ڳ�"); 
	    }
	    public void sleep(){
	        System.out.println(name+"����˯");
	    }
	    public void introduction() { 
	        System.out.println("��Һã�����"         + id + "��" + name + "."); 
	    } 
}
