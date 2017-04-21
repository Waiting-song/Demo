package com.isoft.one.mythread;

public class ChatThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<10;i++)
		{
			
				try {
					Thread.sleep(7000);
					System.out.println("客人小王说了第"+i+"句话");
					Thread.sleep(1000);
					System.out.println("小唐说了第"+i+"句话");
					Thread.sleep(2000);
					System.out.println("主人说了第"+i+"句话");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
		}
	}

	
}
