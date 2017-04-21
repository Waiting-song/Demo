package com.isoft.one.inter;
                                               
public class DongBeiBoys implements ISpringBurning{

	@Override
	public void collectMoney() {
		   System.out.println("刷脸 微信转账");
		
	}

	@Override
	public void goToSuperMarket() {
		 System.out.println("按吨买");
	}

	@Override
	public void goToPark() {
		 System.out.println("骑小黄车");
		
	}

	@Override
	public void parpareWork() {
		 System.out.println("烤羊肉串");
		
	}

	@Override
	public void goHome() {
		 System.out.println("蹭山西同学的地铁回来");
		
	}

}
