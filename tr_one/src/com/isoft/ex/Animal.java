package com.isoft.ex;
// �Զ�������
public class Animal {
	 private String name;  
	    private int id; 
	    // 1.��ʽ�Ĺ��췽�� 2.��ʽ�Ĺ��췽��
	 /*   public Animal(String myName, int myid) { 
	        name = myName; 
	        id = myid;
	    } */
	    public void eat(){ 
	        System.out.println(name+"���ڳ�"); 
	    }
	    public void sleep(){
	        System.out.println(name+"����˯");
	    }
	    public void introduction() { 
	        System.out.println("��Һã�����"         + id + "��" + name + "."); 
	    } 
	    
	    public void move(){
	        System.out.println("��������ƶ�");
	     }
}
