package com.isoft.ex;

public class TestDog {

	 public static void main(String args[]){
	      Animal a = new Animal(); // Animal ����
	      // ��д override 1.������֮��Ĺ�ϵ  ��һ�ּ̳й�ϵ 
	       //  2. ���� �� ����֮�� ������ ����һ�� 
	      Animal b = new Dog(); // Dog ����
	      // b �洢 Dog������ڴ��ַ
	 /*     System.out.println("---------"+b);
	      int i = 0;*/
	      //Animal c ; // ���ñ��� 
	      a.move();// ִ�� Animal ��ķ���
	 
	      b.move();//ִ�� Dog ��ķ���
	   }
}
