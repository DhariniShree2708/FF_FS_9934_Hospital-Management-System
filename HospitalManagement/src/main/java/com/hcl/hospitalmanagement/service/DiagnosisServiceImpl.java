/**
 * 
 */
package com.hcl.hospitalmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hospitalmanagement.model.DiagnosticDetails;
import com.hcl.hospitalmanagement.repository.DiagnosisDao;
import com.hcl.hospitalmanagement.repository.DiagnosisDaoImpl;

/**
 * @author dharinishree.k
 *
 */
@Service
public class DiagnosisServiceImpl implements DiagnosisService {
	@Autowired
	DiagnosisDao diagnosisDao;
	//DiagnosisDaoImpl diagnosisDaoImpl;
	@Override
	public boolean register(DiagnosticDetails diagnosis) {
		diagnosisDao.register(diagnosis);
		return true;
	}
	@Override
	public List<DiagnosticDetails> list() {
		diagnosisDao.list();
		return null;
	}
}
