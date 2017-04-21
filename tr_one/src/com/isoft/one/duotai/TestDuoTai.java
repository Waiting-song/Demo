package com.isoft.one.duotai;

public class TestDuoTai {

	public static void main(String[] args) {
	/*	Cat mycat = new Cat();
		show(mycat);*/
	
		Dog mydog = new Dog();
		show(mydog);
	}
	
	public static void show(Animal animal){
		animal.eat();  
		animal.work();
		
		/*if(animal instanceof Cat)
		{
			Cat cat = (Cat)animal;
			cat.work();
		}
		if(animal instanceof Dog)
		{
			Dog dogy = (Dog)animal;
			dogy.work();
		}*/
		
	}
	
	public void test1()
	{
		Cat pet = new Cat();
		if(pet instanceof Cat)
		{
			System.out.println("Γ¨ίδ");
		}
	}

}
