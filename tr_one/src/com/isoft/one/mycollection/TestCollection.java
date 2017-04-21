package com.isoft.one.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.isoft.one.duotai.Cat;
import com.isoft.one.duotai.Dog;

public class TestCollection {

	public static void main(String[] args) {
		// ������  1.����ʱ  compile time   2. ����ʱ  runtime
           //�ӿ�ָ��ʵ����
		// ����   �������� �Ŷ��� 
		List<Dog> dogList = new ArrayList<Dog>();
		
		Dog mydog = new Dog();
		mydog.setDogType("��ë");
		mydog.setDogName("è��");
		
		Dog mydog2 = new Dog();
		mydog2.setDogType("��ʿ��");
		mydog2.setDogName("����");
		
		Cat mycat = new Cat();
		mycat.setCatType("�ӷ�è");
		mycat.setCatName("����");
		
		dogList.add(mydog);
		dogList.add(mydog2);
		//dogList.add(mycat);
		
		Iterator dogIterator = dogList.iterator();
		while(dogIterator.hasNext())
		{
			// ���� cast 
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
