/**
 * 
 */
package com.hcl.hospitalmanagement.service;

import java.util.List;

import com.hcl.hospitalmanagement.model.PhysicianDetails;

/**
 * @author dharinishree.k
 *
 */
public interface PhysicianService {
	boolean register(PhysicianDetails physician);
	public List<PhysicianDetails> list();
}
