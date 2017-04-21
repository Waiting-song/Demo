package com.isoft.one.inter;

public class ShanXiPerson implements ISpringBurning {

	@Override
	public void collectMoney() {
	     System.out.println("开支票");

	}

	@Override
	public void goToSuperMarket() {
		  System.out.println("按斤买");

	}

	@Override
	public void goToPark() {
		 System.out.println("挖地铁");

	}

	@Override
	public void parpareWork() {
		 System.out.println("点火 烧炭 ");

	}

	@Override
	public void goHome() {
		 System.out.println("开地铁回来 ");

	}

}
