package com.isoft.one.mystatic;

import org.junit.Test;

public class TestYangRouChuan {

	@Test
	public void test()
	{
		// 调用类中 方法 方式有几种？ 1.实例化 
		YangRouChuan yrc1 = new YangRouChuan();
		yrc1.eating();
		
		YangRouChuan yrc2 = new YangRouChuan();
		yrc2.eating();
		
		YangRouChuan yrc3 = new YangRouChuan();
		//yrc3.eating();
		
		YangRouChuan.getYangRouChuanNum();
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("吃羊肉串");
	}
	
	
}
