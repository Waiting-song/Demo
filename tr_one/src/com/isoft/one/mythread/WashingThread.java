package com.isoft.one.mythread;

public class WashingThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<5;i++)
		{
			try {
				System.out.println("ϴ �� "+i+"���豭.......");
				Thread.sleep(7000);
				System.out.println("�� "+i+"���豭 ϴ����...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
}
