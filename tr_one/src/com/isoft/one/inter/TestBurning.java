package com.isoft.one.inter;

public class TestBurning {

     public static void main(String[] args)
     {
    	 //1. 接口 指向 实现类   2. 接口不能被实例化
    	 // 1. final 变量不能被更改   2.final 方法 不能被重写 override
    	 final String dbUserName="root";
    	 
    	 
    	 ISpringBurning burning = new ShanXiPerson ();
    	 burning.collectMoney();
    	 burning.goToSuperMarket();
    	 burning.goToPark();
    	 burning.parpareWork();
    	 burning.goHome();
     }
}
