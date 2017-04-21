package com.isoft.one.mythread;

public class WashingThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<5;i++)
		{
			try {
				System.out.println("洗 第 "+i+"个茶杯.......");
				Thread.sleep(7000);
				System.out.println("第 "+i+"个茶杯 洗好了...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
}
