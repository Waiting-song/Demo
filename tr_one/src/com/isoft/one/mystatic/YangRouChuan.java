package com.isoft.one.mystatic;

public class YangRouChuan {

	// static ���� ����ʵ������
	public static int num=0; 
	
    static {
  	  // static �����ȳ�ʼ�� ���ڹ��캯�� 
  	  System.out.println("����static�� ����С����");
    }
	
	public YangRouChuan()
	{
		System.out.println("����һ�� ");
	}
	public void eating()
	{
		num++;
	}
	
	public static void getYangRouChuanNum()
	{
		System.out.println("����"+num+"��er ");
	}
}
