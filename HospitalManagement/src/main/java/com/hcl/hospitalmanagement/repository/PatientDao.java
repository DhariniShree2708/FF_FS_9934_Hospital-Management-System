/**
 * 
 */
package com.hcl.hospitalmanagement.repository;

import java.util.List;

import com.hcl.hospitalmanagement.model.PatientDetails;


/**
 * @author dharinishree.k
 *
 */
public interface PatientDao {
 boolean register (PatientDetails pat);
 public List<PatientDetails> list();
}
