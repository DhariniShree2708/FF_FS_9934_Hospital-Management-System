/**
 * 
 */
package com.hcl.hospitalmanagement.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hcl.hospitalmanagement.model.PhysicianDetails;
import com.hcl.hospitalmanagement.util.HibernateUtil;

/**
 * @author dharinishree.k
 *
 */
@Repository
public class PhysicianDaoImpl implements PhysicianDao{
	PhysicianDetails physiciandetails = new PhysicianDetails();
@Override
public boolean register(PhysicianDetails phy) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	//Session session = this.sessionFactory.openSession();
	session.beginTransaction();
	physiciandetails.setId(phy.getId());;
	physiciandetails.setFirstName(phy.getFirstName());
	physiciandetails.setLastName(phy.getLastName());
	physiciandetails.setDepartment(phy.getDepartment());
	physiciandetails.setEducationalQualification(phy.getEducationalQualification());
	physiciandetails.setYearsOfExperience(phy.getYearsOfExperience());
	physiciandetails.setState(phy.getState());
	physiciandetails.setInsurancePlan(phy.getInsurancePlan());
	session.save(physiciandetails);
	session.getTransaction().commit();
	HibernateUtil.shutdown();
	//session.close();
	return true;
}

@SuppressWarnings("unchecked")
public List<PhysicianDetails> list() {
	Session session = HibernateUtil.getSessionFactory().openSession();
	//Session session = this.sessionFactory.openSession();
	List<PhysicianDetails> physicianList = session.createQuery("from PHYSICIANDETAILS").list();
	session.close();
	return physicianList;
}

}

