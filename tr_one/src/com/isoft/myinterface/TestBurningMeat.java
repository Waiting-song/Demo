package com.isoft.myinterface;

public class TestBurningMeat {

	public static void main(String []args)
	{
		// 1.接口指向实现类 
		ISpringBurning burning = new ShanXiBoys();
		burning.collectMoney();
		burning.goToSuperMarket();
		burning.callDidi();
		burning.prepareWork();
		burning.goHome();
		
		
	}
}
