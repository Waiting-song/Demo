package com.isoft.duotai;

public class TestMyStaticVariables {
	public static void main(String args[]){
	     EatingCat cat = new EatingCat();
	     cat.eatMeatPlus();
	     
	     EatingDog dog = new EatingDog();
	     dog.eatMeatPlus();
	     dog.eatMeatPlus();
	     
	     AnimalCount count = new AnimalCount();
	     System.out.println("è��һ������"+count.getPiecesOfMeat()+" Ƭ��");
	     
		
		
		
	}
}
