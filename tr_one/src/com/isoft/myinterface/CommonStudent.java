package com.isoft.myinterface;

// ��Ľ�һ������  ���̳в�������
// ������ ���ܱ�ʵ���� 
public abstract class CommonStudent {

	// constructor ���캯��
	public CommonStudent(){
		
	}
	
	public CommonStudent(String sname){
		
	}
	
	private String stuno;
	private String sname;
	private String gender;
	private int sage;
	
	// ���󷽷�����ָ��������
	// ��ͨ�൱�� �����г��󷽷�
	public abstract void study();
	
	public abstract void lol();
	
	// �������� ��������ͨ����
	public void eating(){
		
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
