package com.example.demo;

import java.util.Arrays;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJsfDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJsfDemoApplication.class, args);
	}

	  @Bean
	  ServletRegistrationBean jsfServletRegistration (ServletContext servletContext) {
	      //spring boot only works if this is set
	      servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());

	      //FacesServlet registration
	      ServletRegistrationBean srb = new ServletRegistrationBean();
	      srb.setServlet(new FacesServlet());
	      srb.setUrlMappings(Arrays.asList("*.xhtml"));
	      srb.setLoadOnStartup(1);
	      return srb;
	  }
}
