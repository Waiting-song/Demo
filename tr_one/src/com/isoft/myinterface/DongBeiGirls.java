package com.isoft.myinterface;

public class DongBeiGirls extends CommonStudent implements ISpringBurning{

	private String drinking;
	
	@Override
	public void collectMoney() {
		System.out.println("ֱ�����ֽ�!");
		
	}

	@Override
	public void goToSuperMarket() {
		System.out.println("ȥ����������!");
		
	}

	@Override
	public void callDidi() {
		System.out.println("����ɽ�����ڵĵ���ȥ �����˴���!");
		
	}

	@Override
	public void prepareWork() {
		System.out.println("������ߣ����!");
		
	}

	@Override
	public void goHome() {
		System.out.println("��ɽ���˵���");
		
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
