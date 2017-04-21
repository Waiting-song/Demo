package com.isoft.ex;

public class TestDog {

	 public static void main(String args[]){
	      Animal a = new Animal(); // Animal 对象
	      // 重写 override 1.两个类之间的关系  是一种继承关系 
	       //  2. 子类 与 父类之间 方法名 保持一致 
	      Animal b = new Dog(); // Dog 对象
	      // b 存储 Dog对象的内存地址
	 /*     System.out.println("---------"+b);
	      int i = 0;*/
	      //Animal c ; // 引用变量 
	      a.move();// 执行 Animal 类的方法
	 
	      b.move();//执行 Dog 类的方法
	   }
}
