package com.isoft.model;

public class TestOverride {

	public static void main(String args[])
	{
		   // ��д override 1.������֮��Ĺ�ϵ  ��һ�ּ̳й�ϵ 
	       //  2. ���� �� ����֮�� ������ ����һ�� 
		Wangjianlin father = new Wangjianlin();
		Wangjianlin kfc = new Wangsicong();
		
		father.driving();
		kfc.driving();
	}
}
