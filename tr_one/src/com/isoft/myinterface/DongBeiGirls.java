package com.isoft.myinterface;

public class DongBeiGirls extends CommonStudent implements ISpringBurning{

	private String drinking;
	
	@Override
	public void collectMoney() {
		System.out.println("直接收现金!");
		
	}

	@Override
	public void goToSuperMarket() {
		System.out.println("去超市买羊肉!");
		
	}

	@Override
	public void callDidi() {
		System.out.println("咱坐山西人挖的地铁去 东北人聪明!");
		
	}

	@Override
	public void prepareWork() {
		System.out.println("东北人撸串儿!");
		
	}

	@Override
	public void goHome() {
		System.out.println("蹭山西人地铁");
		
	}


	public String getDrinking() {
		return drinking;
	}

	public void setDrinking(String drinking) {
		this.drinking = drinking;
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
