package com.isoft.one.mythread;

public class HeatThread extends Thread{

	@Override
	public void run() {
		
		try {
			System.out.println("��ʼ�տ�ˮ.......");
			Thread.sleep(5000);
			System.out.println("ˮ�տ��� �����ݲ���.......");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
