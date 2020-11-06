/**
 * 
 */
package com.hcl.hospitalmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hospitalmanagement.model.PatientDetails;
import com.hcl.hospitalmanagement.repository.PatientDao;

/**
 * @author dharinishree.k
 *
 */
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientDao patientDao;
	@Override
	public boolean register(PatientDetails patient) {
		patientDao.register(patient);
		return true;
	}
	@Override
	public List<PatientDetails> list() {
		patientDao.list();
		return null;
	}
}
