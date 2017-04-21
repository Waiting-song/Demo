package com.isoft.one.inter;

public class ShanDongPerson implements ISpringBurning{

	@Override
	public void collectMoney() {
		 System.out.println("摊煎饼 卖钱 买羊肉");
		
	}

	@Override
	public void goToSuperMarket() {
		 System.out.println("按 只 买羊");
		
	}

	@Override
	public void goToPark() {
		 System.out.println("开飞机");
		
	}

	@Override
	public void parpareWork() {
		 System.out.println("品尝羊肉串");
		
	}

	@Override
	public void goHome() {
		 System.out.println("骑东北同学的小黄回来");
		
	}

}
