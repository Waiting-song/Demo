package com.isoft.myinterface;

public class TianJinBoys extends CommonStudent implements ISpringBurning{


	private String language;
	// �̳г�����֮�� һ��Ҫ��д�������еĳ��󷽷�
	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void collectMoney() {
	System.out.println("֧����ת�� ");
		
	}

	@Override
	public void goToSuperMarket() {
		System.out.println("���г�");
		
	}

	@Override
	public void callDidi() {
		System.out.println("���ܰ� boys");
		
	}

	@Override
	public void prepareWork() {
		System.out.println("ӻԾ����!");
		
	}

	@Override
	public void goHome() {
		System.out.println("�ܻ�ȥ!");
		
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
