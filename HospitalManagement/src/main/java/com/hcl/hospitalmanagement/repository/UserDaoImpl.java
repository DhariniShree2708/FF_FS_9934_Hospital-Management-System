package com.hcl.hospitalmanagement.repository;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;*/
import java.util.List;

import org.hibernate.Query;
//import org.hibernate.Query;
import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hcl.hospitalmanagement.model.User;
import com.hcl.hospitalmanagement.util.HibernateUtil;
@Repository
public class UserDaoImpl implements UserDao {

	User user = new User();
@Override
	public boolean register(User us) {
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		user.setEmailId(us.getEmailId());
		user.setPassword(us.getPassword());
		user.setRoleId(us.getRoleId());
		session.save(user);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		//session.close();
		return true;
	}catch(Exception e) {
		System.out.println("Already Registered!! " +e.getMessage());
		return true;
	}
}
	@SuppressWarnings("unchecked")
	public List<User> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Session session = this.sessionFactory.openSession();
		List<User> userList = session.createQuery("from USER").list();
		session.close();
		return userList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean login(User usr) {
		boolean temp = false;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query query = session.createQuery("from User u");
			List<User> userList = query.list();
			for(User u : userList) {
				if(u.getEmailId().equals(usr.getEmailId()) && u.getPassword().equals(usr.getPassword()) 
						&& u.getRoleId()==(usr.getRoleId())) {
					temp = true;
				}
			}
			session.getTransaction().commit();
			return temp;
		} catch(Exception e) {
			System.out.println("Invalid Credentials!! : "+ e.getMessage());
			return temp;
		}
	}

}
	