/**
 * 
 */
package com.hcl.hospitalmanagement.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hcl.hospitalmanagement.model.PatientDetails;
import com.hcl.hospitalmanagement.util.HibernateUtil;

/**
 * @author dharinishree.k
 *
 */
@Repository
public class PatientDaoImpl implements PatientDao{
PatientDetails patientdetails = new PatientDetails();
@Override
public boolean register(PatientDetails pat) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	//Session session = this.sessionFactory.openSession();
	session.beginTransaction();
	patientdetails.setId(pat.getId());
	patientdetails.setFirstName(pat.getFirstName());
	patientdetails.setLastName(pat.getLastName());
	patientdetails.setDateOfBirth(pat.getDateOfBirth());
	patientdetails.setEmailId(pat.getEmailId());
	patientdetails.setContactNumber(pat.getContactNumber());
	patientdetails.setState(pat.getState());
	patientdetails.setInsurancePlan(pat.getInsurancePlan());
	patientdetails.setPhysicianId(pat.getPhysicianId());
	session.save(patientdetails);
	session.getTransaction().commit();
	HibernateUtil.shutdown();
	//session.close();
	return true;
}

@SuppressWarnings("unchecked")
public List<PatientDetails> list() {
	Session session = HibernateUtil.getSessionFactory().openSession();
	//Session session = this.sessionFactory.openSession();
	List<PatientDetails> patientList = session.createQuery("from PATIENTDETAILS").list();
	session.close();
	return patientList;
}

}
