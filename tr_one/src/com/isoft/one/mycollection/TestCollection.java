package com.isoft.one.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.isoft.one.duotai.Cat;
import com.isoft.one.duotai.Dog;

public class TestCollection {

	public static void main(String[] args) {
		// 编译器  1.编译时  compile time   2. 运行时  runtime
           //接口指向实现类
		// 泛型   集合里面 放对象 
		List<Dog> dogList = new ArrayList<Dog>();
		
		Dog mydog = new Dog();
		mydog.setDogType("金毛");
		mydog.setDogName("猫咪");
		
		Dog mydog2 = new Dog();
		mydog2.setDogType("哈士奇");
		mydog2.setDogName("铁柱");
		
		Cat mycat = new Cat();
		mycat.setCatType("加菲猫");
		mycat.setCatName("旺财");
		
		dogList.add(mydog);
		dogList.add(mydog2);
		//dogList.add(mycat);
		
		Iterator dogIterator = dogList.iterator();
		while(dogIterator.hasNext())
		{
			// 造型 cast 
			Dog myDog = (Dog)dogIterator.next();
			System.out.println(myDog.getDogType()+"----"+myDog.getDogName());
		}
		for(Dog itemDog : dogList)
		{
			System.out.println(itemDog.getDogType()+"--"+itemDog.getDogName());
		}
		
		/*for(int i=0;i<dogList.size();i++)
		{
			Dog itemDog = (Dog)dogList.get(i);
			System.out.println(itemDog.getDogType()+"----"+itemDog.getDogName());
		}*/
		
	}

}
