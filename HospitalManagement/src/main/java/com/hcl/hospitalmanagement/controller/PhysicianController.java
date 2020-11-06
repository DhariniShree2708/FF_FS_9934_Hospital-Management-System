package com.hcl.hospitalmanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.hospitalmanagement.model.PhysicianDetails;
import com.hcl.hospitalmanagement.service.PhysicianServiceImpl;

/**
 * @author dharinishree.k
 *
 */
@Controller
@RequestMapping("/physiciandetails")
public class PhysicianController {
	@Autowired
	PhysicianServiceImpl physicianServiceImpl;

	@RequestMapping(value = "/addphysiciandetails", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid PhysicianDetails physiciandetails,BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("physiciandetails");
		}
			else {
				if(physicianServiceImpl.register(physiciandetails)) {
					return new ModelAndView("loginsuccess");
				}else {
					return new ModelAndView("loginfailed");
				}
			}
	}
	@RequestMapping("/addphysiciandetails")
	public ModelAndView add() {
		return new ModelAndView("physiciandetails","physiciandetails", new PhysicianDetails());

	}
}
