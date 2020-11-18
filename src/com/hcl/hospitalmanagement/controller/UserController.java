/**
 * 
 */
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
import com.hcl.hospitalmanagement.service.UserServiceImpl;

/**
 * @author dharinishree.k
 *
 */
public class UserController {
	@Controller
	@RequestMapping("/user")
	public class UserControler {
		@Autowired
		UserServiceImpl userServiceImpl;

		@RequestMapping(value = "/registration", method = RequestMethod.POST)
		public ModelAndView add(@ModelAttribute @Valid User user,BindingResult result) {
			if (result.hasErrors())
				return new ModelAndView("register");
			else
				return new ModelAndView("registrationSuccess");
		}

		@RequestMapping("/registration")
		public ModelAndView add() {
			return new ModelAndView("register","user", new User());

		}
	}
}
