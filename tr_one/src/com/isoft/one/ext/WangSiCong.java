package com.isoft.one.ext;

public class WangSiCong extends WangJianLin{

	private String pname;
	public String girlFriend;
	public int wage;
	
	//�޲����Ĺ��캯�� 
	public WangSiCong()
	{
		
		System.out.println("�ҽ����Ѳ��ں���ǮûǮ");
	}
	//  overload ����  1.ͬһ���� ��������ȫ��ͬ ���� ������ͬ (1.���� 2.���� 3.˳��)
	public WangSiCong(String gf)
	{
		this.girlFriend=gf;
		System.out.println("�ҵ�Ů����");
	}
	
	public WangSiCong(int myage)
	{
		System.out.println("�ҵ�����");
		this.wage=myage;
	}
	
	public WangSiCong(int myage,String gf)
	{
		System.out.println("�ҵ�����");
		this.wage=myage;
		System.out.println("�ҵ�Ů����");
		this.girlFriend=gf;
		
	}
	
	public WangSiCong(String gf,int myage)
	{
		System.out.println("�ҵ�����");
		this.wage=myage;
		System.out.println("�ҵ�Ů����");
		this.girlFriend=gf;
		
	}
	
	
	
	// ��д  
	/**
	 * 1.��д��������֮��Ĺ�ϵ �����������м̳й�ϵ 
	 * 2.������ķ���������ȫһ��(������ ���� ����ֵ Ȩ��)
	 */
	
	public void mySpeak()
	{
		System.out.println("����˵");
		super.speak();
		// һ��ʵ�� ���� ��ֵ
		this.girlFriend="beauty";
	}
	public String getGirlFriend() {
		return girlFriend;
	}
	public void setGirlFriend(String girlFriend) {
		this.girlFriend = girlFriend;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	
	
	
}
