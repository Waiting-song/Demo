package com.isoft.myinterface;

public class ShanXiBoys extends CommonStudent implements ISpringBurning{

	private String hecu;
	@Override
	public void collectMoney() {
		System.out.println("支票转账");
		
	}

	@Override
	public void goToSuperMarket() {
		System.out.println("从地球里挖出来");
		
	}

	@Override
	public void callDidi() {
		System.out.println("挖地铁去");
		
	}

	@Override
	public void prepareWork() {
		System.out.println("烧炭!");
		
	}

	@Override
	public void goHome() {
		System.out.println("坐俺家自己地铁回家");
		
	}


	public String getHecu() {
		return hecu;
	}

	public void setHecu(String hecu) {
		this.hecu = hecu;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
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
