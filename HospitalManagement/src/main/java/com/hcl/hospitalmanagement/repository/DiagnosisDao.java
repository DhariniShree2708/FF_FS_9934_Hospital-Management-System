/**
 * 
 */
package com.hcl.hospitalmanagement.repository;

import java.util.List;

import com.hcl.hospitalmanagement.model.DiagnosticDetails;

/**
 * @author dharinishree.k
 *
 */
public interface DiagnosisDao {
	 boolean register (DiagnosticDetails dia);
	 public List<DiagnosticDetails> list();
}
