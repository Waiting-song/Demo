package com.isoft.myinterface;

public class MyStudent {
	private String stuno;
	private String sname;
	private String gender;
	private int sage;
	// overload ���� �ڵ�ǰ���� һЩ����������ȫ��ͬ�����ǲ�����ͬ �������������
	// this ָ���� ��ǰ�౻ʵ�����Ķ��� 
	// ���캯�� 3�ֲ�ͬ 1.���Ͳ�ͬ 2.������ͬ 3.˳��ͬ 
	public MyStudent(String sname) {
		this.sname = sname;
	}
	
	public MyStudent(String sname, int sage) {
		this.sname = sname;
		this.sage = sage;
	}
	
	public MyStudent( int sage,String sname) {
		this.sname = sname;
		this.sage = sage;
	}
	
	public void getUserList(String userName)
	{
		String temp = new String();
		
	}
	
	public void getUserList(int age)
	{
		
	}


	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	
	
}
