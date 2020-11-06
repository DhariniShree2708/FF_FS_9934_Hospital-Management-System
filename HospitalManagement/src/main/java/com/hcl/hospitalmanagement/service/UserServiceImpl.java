package com.hcl.hospitalmanagement.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hospitalmanagement.model.User;
import com.hcl.hospitalmanagement.repository.UserDao;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	@Override
	public boolean register(User usr) {
		userDao.register(usr);
		return true;
	}
	@Override
	public List<User> list() {
		userDao.list();
		return null;
	}
	@Override
	public boolean login(User usr) {
		userDao.login(usr);
		return false;
	}
	
}