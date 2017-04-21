package com.isoft.myinterface;

public class ChinaGrils implements ISpringBurning{
      private String height;
      private String weight;
      
      public void speak()
      {
    	  System.out.println("讨厌呀");
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
		System.out.println(" china 直接收现金!");
		
	}

	@Override
	public void goToSuperMarket() {
		System.out.println(" china  去超市买羊肉!");
		
	}

	@Override
	public void callDidi() {
		System.out.println("  china  咱坐山西人挖的地铁去 东北人聪明!");
		
	}

	@Override
	public void prepareWork() {
		System.out.println("  china  东北人撸串儿!");
		
	}

	@Override
	public void goHome() {
		System.out.println(" china  蹭山西人地铁");
		
	}

	@Override
	public void eatingMeet() {
		// TODO Auto-generated method stub
		
	}
      
      
}
