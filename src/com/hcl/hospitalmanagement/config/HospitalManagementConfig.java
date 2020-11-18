package com.hcl.hospitalmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author dharinishree.k
 *
 */
public class HospitalManagementConfig {
	@Configuration
	@EnableWebMvc
	@ComponentScan(basePackages = "com.hcl.hospitalmanagement")
	public class SpringRegistrationConfig {
		@Bean(name = "jspViewResolver")
		public ViewResolver viewResolver() {
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			viewResolver.setPrefix("WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
			return viewResolver;
		}
		
	}
}

