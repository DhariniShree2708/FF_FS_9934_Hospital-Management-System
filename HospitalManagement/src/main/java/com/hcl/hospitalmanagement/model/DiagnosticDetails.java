/**
 * 
 */
package com.hcl.hospitalmanagement.model;


import java.util.Date;

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
@Table (name = "DIAGNOSTICDETAILS")
public class DiagnosticDetails {
	@Column
	int patientId;
	@Column
	String physicianId;
	@Id
	@Column
	int diagnosticId;
	@Column
	String symptoms;
	@Column
	String diagnosisProvided;
	@Column
	Date dateOfDiagnosis;
	@Column
	boolean followUp;
	@Column
	Date dateOfFollowUp;
	@Column
	Double billAmount;
	@Column
	String cardNumber; 
	@Column
	String modeOfPayment;
	/**
	 * 
	 */
	public DiagnosticDetails() {
		super();
	}
	
	/**
	 * @param patientId
	 * @param physicianId
	 * @param diagnosticId
	 * @param symptoms
	 * @param diagnosisProvided
	 * @param dateOfDiagnosis
	 * @param followUp
	 * @param dateOfFollowUp
	 * @param billAmount
	 * @param cardNumber
	 * @param modeOfPayment
	 */
	public DiagnosticDetails(int patientId, String physicianId, int diagnosticId, String symptoms,
			String diagnosisProvided, Date dateOfDiagnosis, boolean followUp, Date dateOfFollowUp, Double billAmount,
			String cardNumber, String modeOfPayment) {
		super();
		this.patientId = patientId;
		this.physicianId = physicianId;
		this.diagnosticId = diagnosticId;
		this.symptoms = symptoms;
		this.diagnosisProvided = diagnosisProvided;
		this.dateOfDiagnosis = dateOfDiagnosis;
		this.followUp = followUp;
		this.dateOfFollowUp = dateOfFollowUp;
		this.billAmount = billAmount;
		this.cardNumber = cardNumber;
		this.modeOfPayment = modeOfPayment;
	}
	/**
	 * @return the patientId
	 */
	public int getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
	 * @return the diagnosticId
	 */
	public int getDiagnosticId() {
		return diagnosticId;
	}
	/**
	 * @param diagnosticId the diagnosticId to set
	 */
	public void setDiagnosticId(int diagnosticId) {
		this.diagnosticId = diagnosticId;
	}
	/**
	 * @return the symptoms
	 */
	public String getSymptoms() {
		return symptoms;
	}
	/**
	 * @param symptoms the symptoms to set
	 */
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	/**
	 * @return the diagnosisProvided
	 */
	public String getDiagnosisProvided() {
		return diagnosisProvided;
	}
	/**
	 * @param diagnosisProvided the diagnosisProvided to set
	 */
	public void setDiagnosisProvided(String diagnosisProvided) {
		this.diagnosisProvided = diagnosisProvided;
	}
	/**
	 * @return the dateOfDiagnosis
	 */
	public Date getDateOfDiagnosis() {
		return dateOfDiagnosis;
	}
	/**
	 * @param dateOfDiagnosis the dateOfDiagnosis to set
	 */
	public void setDateOfDiagnosis(Date dateOfDiagnosis) {
		this.dateOfDiagnosis = dateOfDiagnosis;
	}
	/**
	 * @return the followUp
	 */
	public boolean isFollowUp() {
		return followUp;
	}
	/**
	 * @param followUp the followUp to set
	 */
	public void setFollowUp(boolean followUp) {
		this.followUp = followUp;
	}
	/**
	 * @return the dateOfFollowUp
	 */
	public Date getDateOfFollowUp() {
		return dateOfFollowUp;
	}
	/**
	 * @param dateOfFollowUp the dateOfFollowUp to set
	 */
	public void setDateOfFollowUp(Date dateOfFollowUp) {
		this.dateOfFollowUp = dateOfFollowUp;
	}
	/**
	 * @return the billAmount
	 */
	public Double getBillAmount() {
		return billAmount;
	}
	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the modeOfPayment
	 */
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	/**
	 * @param modeOfPayment the modeOfPayment to set
	 */
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	} 

}
