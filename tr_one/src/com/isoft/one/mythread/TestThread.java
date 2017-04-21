package com.isoft.one.mythread;

public class TestThread {

	public static void main(String[] args) {
		ChatThread chat = new ChatThread();
        chat.start();
        
        HeatThread heat = new HeatThread();
        heat.start();
        
        WashingThread wash = new WashingThread();
        wash.start();
	}

}
