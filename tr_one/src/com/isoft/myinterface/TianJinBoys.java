package com.isoft.myinterface;

public class TianJinBoys extends CommonStudent implements ISpringBurning{


	private String language;
	// 继承抽象类之后 一定要重写抽象类中的抽象方法
	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void collectMoney() {
	System.out.println("支付宝转账 ");
		
	}

	@Override
	public void goToSuperMarket() {
		System.out.println("菜市场");
		
	}

	@Override
	public void callDidi() {
		System.out.println("奔跑吧 boys");
		
	}

	@Override
	public void prepareWork() {
		System.out.println("踊跃报名!");
		
	}

	@Override
	public void goHome() {
		System.out.println("跑回去!");
		
	}


	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}


	@Override
	public void lol() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void eatingMeet() {
		// TODO Auto-generated method stub
		
	}


	
}
