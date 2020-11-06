package com.hcl.hospitalmanagement.service;

import java.util.List;

import com.hcl.hospitalmanagement.model.User;

public interface UserService {
	boolean register(User usr);
	public List<User> list();
	boolean login(User usr);
}
