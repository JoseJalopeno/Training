package dev.soer.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import dev.soer.beans.Box;

/*
 * this configuration is where we will tell Spring the framework how to create our beans.
 * can also be done in an XML file, but we will be using annotations
 * (n.b. take a look at the shared repo for examples of XML configuration
 */
@Configuration
public class BoxConfig {
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)//one instance throughout entire life of application
	public Box getSingleBox() {
		System.out.println("Getting you a box");
		return new Box();
	}
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)//will create new instance of bean each time it is called
	public Box getNewBox() {
		System.out.println("Getting you a new box");
		return new Box(8);
	}
}
