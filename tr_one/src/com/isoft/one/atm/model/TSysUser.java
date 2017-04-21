package com.isoft.one.atm.model;
/**
 * 1.数据库建模 生成数据库表 然后 反向生成JavaBean 
 * (开发 分三层 mvc  model view--jsp controller )
 * 2. 写 Dao (data access model) 和数据库交互数据 编写 sql语句 
 * 3. 写 service 服务层 接口 然后 实现类实现接口 业务方法的编写
 * 4. 写 跳转层 controller 
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
