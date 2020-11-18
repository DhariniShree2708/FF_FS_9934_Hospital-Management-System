/**
 * 
 */
package com.hcl.hospitalmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dharinishree.k
 *
 */
public class HomeController {
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("redirect:user/register");
		//return new ModelAndView("registration");
	}
}
