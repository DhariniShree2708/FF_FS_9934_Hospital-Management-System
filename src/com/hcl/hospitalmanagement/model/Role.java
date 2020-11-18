package com.hcl.hospitalmanagement.model;

/**
 * @author dharinishree.k
 *
 */
public class Role {
	int id;
	String roleName;
	/**
	 * @param id
	 * @param roleName
	 */
	public Role(int id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	/**
	 * 
	 */
	public Role() {
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
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
