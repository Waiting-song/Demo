package com.isoft.myinterface;

public class ChinaGrils implements ISpringBurning{
      private String height;
      private String weight;
      
      public void speak()
      {
    	  System.out.println("����ѽ");
      }
      
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public void collectMoney() {
		System.out.println(" china ֱ�����ֽ�!");
		
	}

	@Override
	public void goToSuperMarket() {
		System.out.println(" china  ȥ����������!");
		
	}

	@Override
	public void callDidi() {
		System.out.println("  china  ����ɽ�����ڵĵ���ȥ �����˴���!");
		
	}

	@Override
	public void prepareWork() {
		System.out.println("  china  ������ߣ����!");
		
	}

	@Override
	public void goHome() {
		System.out.println(" china  ��ɽ���˵���");
		
	}

	@Override
	public void eatingMeet() {
		// TODO Auto-generated method stub
		
	}
      
      
}
