/**
 * 
 */
package com.hcl.hospitalmanagement.service;

import java.util.List;

import com.hcl.hospitalmanagement.model.DiagnosticDetails;

/**
 * @author dharinishree.k
 *
 */
public interface DiagnosisService {
	boolean register(DiagnosticDetails diagnosis);
	public List<DiagnosticDetails> list();
}
