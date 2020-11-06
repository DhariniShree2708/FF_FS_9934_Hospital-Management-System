package com.hcl.hospitalmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author dharinishree.k
 *
 */
@Entity
@Table (name = "PHYSICIANDETAILS")
public class PhysicianDetails {
	@Id
	@Column
	String id;
	@Column
	String firstName;
	@Column
	String lastName;
	@Column
	String department;
	@Column
	String educationalQualification;
	@Column
	int yearsOfExperience;
	@Column
	String state;
	@Column
	String insurancePlan;
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param department
	 * @param educationalQualification
	 * @param yearsOfExperience
	 * @param state
	 * @param insurancePlan
	 */
	public PhysicianDetails(String id, String firstName, String lastName, String department,
			String educationalQualification, int yearsOfExperience, String state, String insurancePlan) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.educationalQualification = educationalQualification;
		this.yearsOfExperience = yearsOfExperience;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}
	/**
	 * 
	 */
	public PhysicianDetails() {
		super();
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the educationalQualification
	 */
	public String getEducationalQualification() {
		return educationalQualification;
	}
	/**
	 * @param educationalQualification the educationalQualification to set
	 */
	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}
	/**
	 * @return the yearsOfExperience
	 */
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	/**
	 * @param yearsOfExperience the yearsOfExperience to set
	 */
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the insurancePlan
	 */
	public String getInsurancePlan() {
		return insurancePlan;
	}
	/**
	 * @param insurancePlan the insurancePlan to set
	 */
	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
	
}
