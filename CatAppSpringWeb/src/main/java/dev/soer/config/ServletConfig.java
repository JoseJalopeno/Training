package dev.soer.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletConfig implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		//Setting up
		
		// access applicationContext
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		
		//register spring ocnfig
		ac.register(SpringConfig.class);
		
		//set servlet context  for applicationcontext
		ac.setServletContext(servletContext);
		
		//add springs front controller
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ac));
		
		// set serlvet settings
		servlet.setLoadOnStartup(1); //mirroring <load-on-startup>1</load-on-startup>
		servlet.addMapping("/"); //mirroring <url-mapping>/</url-mapping>
	}

}
