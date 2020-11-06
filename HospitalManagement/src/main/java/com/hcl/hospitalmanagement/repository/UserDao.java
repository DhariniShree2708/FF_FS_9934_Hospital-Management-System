package com.hcl.hospitalmanagement.repository;

import java.util.List;

import com.hcl.hospitalmanagement.model.User;

public interface UserDao {
	boolean register(User usr);
	public List<User> list();
	boolean login(User usr);
}
