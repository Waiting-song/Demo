package com.isoft.one.mystatic;

public class YangRouChuan {

	// static 变量 各个实例共享
	public static int num=0; 
	
    static {
  	  // static 块最先初始化 先于构造函数 
  	  System.out.println("我是static块 我是小肥羊");
    }
	
	public YangRouChuan()
	{
		System.out.println("烤了一串 ");
	}
	public void eating()
	{
		num++;
	}
	
	public static void getYangRouChuanNum()
	{
		System.out.println("吃了"+num+"串er ");
	}
}
