package com.isoft.one.atm.model;
/**
 * 1.���ݿ⽨ģ �������ݿ�� Ȼ�� ��������JavaBean 
 * (���� ������ mvc  model view--jsp controller )
 * 2. д Dao (data access model) �����ݿ⽻������ ��д sql��� 
 * 3. д service ����� �ӿ� Ȼ�� ʵ����ʵ�ֽӿ� ҵ�񷽷��ı�д
 * 4. д ��ת�� controller 
 * @author wayne
 *
 */
public class TSysUser {
	private String sysUserId;
	private String sysUserName;
	private String sysUserPwd;
	public String getSysUserId() {
		return sysUserId;
	}
	public void setSysUserId(String sysUserId) {
		this.sysUserId = sysUserId;
	}
	public String getSysUserName() {
		return sysUserName;
	}
	public void setSysUserName(String sysUserName) {
		this.sysUserName = sysUserName;
	}
	public String getSysUserPwd() {
		return sysUserPwd;
	}
	public void setSysUserPwd(String sysUserPwd) {
		this.sysUserPwd = sysUserPwd;
	}
	
	
}
