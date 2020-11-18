package com.hcl.hospitalmanagement.model;

import java.util.Date;

/**
 * @author dharinishree.k
 *
 */
public class PatientDetails {
	int id;
	String firstName;
	String LastName;
	Date DateOfBirth;
	String emailId;
	long contactNumber;
	String state;
	String insurancePlan;
	String physicianId;
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param emailId
	 * @param contactNumber
	 * @param state
	 * @param insurancePlan
	 * @param physicianId
	 */
	public PatientDetails(int id, String firstName, String lastName, Date dateOfBirth, String emailId,
			long contactNumber, String state, String insurancePlan, String physicianId) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.state = state;
		this.insurancePlan = insurancePlan;
		this.physicianId = physicianId;
	}
	/**
	 * 
	 */
	public PatientDetails() {
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
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
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
	 * @return the contactNumber
	 */
	public long getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
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

}
