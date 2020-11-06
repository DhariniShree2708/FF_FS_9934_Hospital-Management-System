/**
 * 
 */
package com.hcl.hospitalmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hospitalmanagement.model.PhysicianDetails;
import com.hcl.hospitalmanagement.repository.PhysicianDao;

/**
 * @author dharinishree.k
 *
 */
@Service
public class PhysicianServiceImpl implements PhysicianService {
	@Autowired
	PhysicianDao physicianDao;
	@Override
	public boolean register(PhysicianDetails physician) {
		physicianDao.register(physician);
		return true;
	}
	@Override
	public List<PhysicianDetails> list() {
		physicianDao.list();
		return null;
	}
}
