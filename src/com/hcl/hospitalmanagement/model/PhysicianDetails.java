package com.hcl.hospitalmanagement.model;

/**
 * @author dharinishree.k
 *
 */
public class PhysicianDetails {
	String physicianId;
	String firstName;
	String LastName;
	String department;
	String educationalQualification;
	int yearsOfExperience;
	String state;
	String insurancePlan;
	/**
	 * @param physicianId
	 * @param firstName
	 * @param lastName
	 * @param department
	 * @param educationalQualification
	 * @param yearsOfExperience
	 * @param state
	 * @param insurancePlan
	 */
	public PhysicianDetails(String physicianId, String firstName, String lastName, String department,
			String educationalQualification, int yearsOfExperience, String state, String insurancePlan) {
		super();
		this.physicianId = physicianId;
		this.firstName = firstName;
		LastName = lastName;
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
	 * @return the physicianId
	 */
	public String getPhysicianId() {
		return physicianId;
	}
	/**
	 * @param physicianId the physicianId to set
	 */
	public void setPhysicianId(String physicianId) {
		this.physicianId = physicianId;
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
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
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
