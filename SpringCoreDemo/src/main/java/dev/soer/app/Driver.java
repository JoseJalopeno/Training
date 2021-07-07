package dev.soer.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.soer.beans.Box;
import dev.soer.config.BoxConfig;

public class Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(BoxConfig.class);
		Thread.sleep(3000);
		Box b = ac.getBean("getSingleBox", Box.class);
		System.out.println(b);
		b.setVolume(10);
		System.out.println(b);
		Box a = ac.getBean("getSingleBox", Box.class);
		System.out.println(a);
		
		Box c = ac.getBean("getNewBox", Box.class);
		Box d = ac.getBean("getNewBox", Box.class);
		
		System.out.println(c);
		System.out.println(d);
		d.setVolume(1000);
		System.out.println(c);
		System.out.println(d);
	}
}
