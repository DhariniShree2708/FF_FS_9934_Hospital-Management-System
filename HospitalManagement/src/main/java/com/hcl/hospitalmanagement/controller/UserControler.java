package com.hcl.hospitalmanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.hospitalmanagement.model.User;
import com.hcl.hospitalmanagement.service.UserService;
import com.hcl.hospitalmanagement.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserControler {
	@Autowired
	UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid User user,BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("register");
		}else {
			if(userServiceImpl.register(user)) {
				return new ModelAndView("registrationSuccess");
			}else {
				return new ModelAndView("registrationFailed");
			}
		}
			
	}

	@RequestMapping("/registration")
	public ModelAndView add() {
		return new ModelAndView("register","user", new User());

	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute @Valid User user,BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("login");
		}else {
			if(userServiceImpl.login(user)) {
				return new ModelAndView("loginfailed");
			}else {
				return new ModelAndView("loginsuccess");
			}
		}
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login","user", new User());

	}
}