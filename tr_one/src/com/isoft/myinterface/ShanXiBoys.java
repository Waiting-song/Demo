package com.isoft.myinterface;

public class ShanXiBoys extends CommonStudent implements ISpringBurning{

	private String hecu;
	@Override
	public void collectMoney() {
		System.out.println("֧Ʊת��");
		
	}

	@Override
	public void goToSuperMarket() {
		System.out.println("�ӵ������ڳ���");
		
	}

	@Override
	public void callDidi() {
		System.out.println("�ڵ���ȥ");
		
	}

	@Override
	public void prepareWork() {
		System.out.println("��̿!");
		
	}

	@Override
	public void goHome() {
		System.out.println("�������Լ������ؼ�");
		
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
