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

import com.hcl.hospitalmanagement.model.DiagnosticDetails;
import com.hcl.hospitalmanagement.service.DiagnosisServiceImpl;

/**
 * @author dharinishree.k
 */
@Controller
@RequestMapping("/diagnosticdetails")
public class DiagnosticController {
	@Autowired
	DiagnosisServiceImpl diagnosisServiceImpl;

	@RequestMapping(value = "/adddiagnosticdetails", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid DiagnosticDetails diagnosticdetails, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("diagnosticdetails");
		} else {
			if (diagnosisServiceImpl.register(diagnosticdetails)) {
				return new ModelAndView("loginsuccess");
			} else
				return new ModelAndView("loginfailed");
		}
	}

	@RequestMapping("/adddiagnosticdetails")
	public ModelAndView add() {
		return new ModelAndView("diagnosticdetails", "diagnosticdetails", new DiagnosticDetails());

	}
}