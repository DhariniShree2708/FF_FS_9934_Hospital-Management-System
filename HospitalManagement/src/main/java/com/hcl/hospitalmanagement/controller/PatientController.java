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

import com.hcl.hospitalmanagement.model.PatientDetails;
import com.hcl.hospitalmanagement.service.PatientServiceImpl;

/**
 * @author dharinishree.k
 *
 */
@Controller
@RequestMapping("/patientdetails")
public class PatientController {
	@Autowired
	PatientServiceImpl patientServiceImpl;

	@RequestMapping(value = "/addpatientdetails", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid PatientDetails patientdetails ,BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("patientdetails");
		}
			else {
				if(patientServiceImpl.register(patientdetails)) {
					return new ModelAndView("loginsuccess");
				}else {
					return new ModelAndView("loginfailed");
				}
			}
	}

	@RequestMapping("/addpatientdetails")
	public ModelAndView add() {
		return new ModelAndView("patientdetails","patientdetails", new PatientDetails());

	}
}
