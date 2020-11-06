package com.hcl.hospitalmanagement.model;

	//import java.sql.Date;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

	/**
	 * @author dharinishree.k
	 *
	 */
	@Entity
	@Table (name = "PATIENTDETAILS")
	public class PatientDetails {
		@Id
		@Column
		@NotEmpty
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		@Column
		String firstName;
		@Column
		String lastName;
		@Column
		Date dateOfBirth;
		@Column
		String emailId;
		@Column
		String contactNumber;
		@Column
		String state;
		@Column
		String insurancePlan;
		@Column
		@NotEmpty
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
				String contactNumber, String state, String insurancePlan, String physicianId) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
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
			return lastName;
		}
		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		/**
		 * @return the dateOfBirth
		 */
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		/**
		 * @param dateOfBirth the dateOfBirth to set
		 */
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
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
		public String getContactNumber() {
			return contactNumber;
		}
		/**
		 * @param contactNumber the contactNumber to set
		 */
		public void setContactNumber(String contactNumber) {
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



