package com.isoft.duotai;

public class TestDuoTai {

	public static void main(String args[]){
		show(new Cat());
		// ��������ָ���������
/*		Animal animal = new Cat();
		animal.eat();*/
	}
	
	 public static void show(Animal animal){
		 animal.eat();
		 if(animal instanceof Cat)
		 {
			 Cat cat = (Cat)animal;
			 cat.work();
		 }
		 
		 if(animal instanceof Dog)
		 {
			 Dog dog = (Dog)animal;
			 dog.work();
		 }
	 } 
}
