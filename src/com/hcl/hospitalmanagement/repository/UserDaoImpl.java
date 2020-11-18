/**
 * 
 */
package com.hcl.hospitalmanagement.repository;

/**
 * @author dharinishree.k
 *
 */
import java.util.List;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hcl.hospitalmanagement.model.User;
import com.hcl.hospitalmanagement.util.HibernateUtil;

@Repository
public class UserDaoImpl implements UserDao {

	User user = new User();
	
	/*private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }*/
@Override
	public boolean register(User p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		//session.close();
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public List<User> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Session session = this.sessionFactory.openSession();
		List<User> userList = session.createQuery("from User").list();
		session.close();
		return userList;
	}

}

