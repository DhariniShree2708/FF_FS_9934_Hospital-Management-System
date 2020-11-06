/**
 * 
 */
package com.hcl.hospitalmanagement.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hcl.hospitalmanagement.model.DiagnosticDetails;
import com.hcl.hospitalmanagement.model.PhysicianDetails;
import com.hcl.hospitalmanagement.util.HibernateUtil;

/**
 * @author dharinishree.k
 *
 */
@Repository
public class DiagnosisDaoImpl implements DiagnosisDao{
	DiagnosticDetails diagnosticdetails = new DiagnosticDetails();
@Override
public boolean register(DiagnosticDetails dia) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	//Session session = this.sessionFactory.openSession();
	session.beginTransaction();
	diagnosticdetails.setPatientId(dia.getPatientId());
	diagnosticdetails.setPhysicianId(dia.getPhysicianId());
	diagnosticdetails.setDiagnosticId(dia.getDiagnosticId());
	diagnosticdetails.setSymptoms(dia.getSymptoms());
	diagnosticdetails.setDiagnosisProvided(dia.getDiagnosisProvided());
	diagnosticdetails.setDateOfDiagnosis(dia.getDateOfDiagnosis());
	diagnosticdetails.setFollowUp(dia.isFollowUp());
	diagnosticdetails.setDateOfFollowUp(dia.getDateOfFollowUp());
	diagnosticdetails.setBillAmount(dia.getBillAmount());
	diagnosticdetails.setCardNumber(dia.getCardNumber());
	diagnosticdetails.setModeOfPayment(dia.getModeOfPayment());
	session.save(diagnosticdetails);
	session.getTransaction().commit();
	HibernateUtil.shutdown();
	//session.close();
	return true;
}

@SuppressWarnings("unchecked")
public List<DiagnosticDetails> list() {
	Session session = HibernateUtil.getSessionFactory().openSession();
	//Session session = this.sessionFactory.openSession();
	List<DiagnosticDetails> diagnosisList = session.createQuery("from DIAGNOSTICDETAILS").list();
	session.close();
	return diagnosisList;
}

}

