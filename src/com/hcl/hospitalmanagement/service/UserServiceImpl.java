/**
 * 
 */
package com.hcl.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hospitalmanagement.model.User;
import com.hcl.hospitalmanagement.repository.UserDao;

/**
 * @author dharinishree.k
 *
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
		UserDao userDao;
		@Override
		public boolean register(User usr) {
			userDao.register(usr);
			return false;
		}
	}

