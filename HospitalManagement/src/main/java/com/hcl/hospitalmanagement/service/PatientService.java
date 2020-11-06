/**
 * 
 */
package com.hcl.hospitalmanagement.service;

import java.util.List;

import com.hcl.hospitalmanagement.model.PatientDetails;


/**
 * @author dharinishree.k
 *
 */
public interface PatientService {
	boolean register(PatientDetails patient);
	public List<PatientDetails> list();
}
