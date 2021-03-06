package dev.soer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//these annotations are replacing the xml tags below
@EnableWebMvc
@ComponentScan(basePackages="dev.soer")
@Configuration
public class SpringConfig implements WebMvcConfigurer {

	/*
	 * this config class will replace the xml configuration that we might have done in the past you should know how it works
	 * but this is the more common way now
	 * 
	 * <mvc:annotation-driven></mvc:annotation-driven>
	 * <context:component-scan base-package="dev.soer"></context:component-scan>
	 * 
	 */
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer cfg) {
		cfg.enable();
	}
	
}
