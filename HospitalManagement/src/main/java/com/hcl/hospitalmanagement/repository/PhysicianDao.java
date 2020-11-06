package com.hcl.hospitalmanagement.repository;

import java.util.List;

import com.hcl.hospitalmanagement.model.PhysicianDetails;

/**
 * @author dharinishree.k
 *
 */
public interface PhysicianDao {
	boolean register (PhysicianDetails physician);
	 public List<PhysicianDetails> list();

}
