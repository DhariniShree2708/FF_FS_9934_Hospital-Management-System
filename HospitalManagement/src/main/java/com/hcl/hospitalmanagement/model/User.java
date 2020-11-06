package com.hcl.hospitalmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

@Entity
@Table (name = "USER")
public class User {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//@Pattern(regexp="^[a-zA-Z0-9]{5}@[a-zA-Z0-9]{5}.com",message="Invalid Email Id")
	@Column
	@NotEmpty
	private String emailId;
	@Column
	@NotEmpty
	private String password;
	@Column
	//@Range(min=1)
	private int roleId;

	public User() {
		super();
	}

	public User(int id, String emailId, String password, int roleId) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.roleId = roleId;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}