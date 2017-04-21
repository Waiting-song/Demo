package com.isoft.one.mythread;

public class HeatThread extends Thread{

	@Override
	public void run() {
		
		try {
			System.out.println("开始烧开水.......");
			Thread.sleep(5000);
			System.out.println("水烧开了 可以泡茶了.......");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
