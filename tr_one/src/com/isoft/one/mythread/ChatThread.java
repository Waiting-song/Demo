package com.isoft.one.mythread;

public class ChatThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<10;i++)
		{
			
				try {
					Thread.sleep(7000);
					System.out.println("����С��˵�˵�"+i+"�仰");
					Thread.sleep(1000);
					System.out.println("С��˵�˵�"+i+"�仰");
					Thread.sleep(2000);
					System.out.println("����˵�˵�"+i+"�仰");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
		}
	}

	
}
