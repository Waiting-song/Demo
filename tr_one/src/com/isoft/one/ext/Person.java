package com.isoft.one.ext;

// ��Ľ�һ������
public abstract class Person {
	private String sname;
	private String sgender;
	private int tage;
	// 3.��������Ҫ����Ϊ�˱��̳� 
	// 1.������ĳ��󷽷� û�з�����    
	// 2. �̳��˳���������࣬������д����ĳ��󷽷�
	public abstract void eating();

	public abstract void sleeping();
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	  
	
	  
}
