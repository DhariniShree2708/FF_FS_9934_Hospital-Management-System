package com.hcl.hospitalmanagement.model;

/**
 * @author dharinishree.k
 *
 */
public class User {
	int id;
	String emailId;
	String Password;
	int roleId;
	/**
	 * @param id
	 * @param emailId
	 * @param password
	 * @param roleId
	 */
	public User(int id, String emailId, String password, int roleId) {
		super();
		this.id = id;
		this.emailId = emailId;
		Password = password;
		this.roleId = roleId;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}
