package com.isoft.one.mythread;

public class TestMainThread {

	public static void main(String[] args) throws InterruptedException {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		
		for(int i=1;i<5;i++)
		{
			Thread.sleep(3000);
			System.out.println("µÚ"+i+"´Î ´òÓ¡");
		}

	}

}
