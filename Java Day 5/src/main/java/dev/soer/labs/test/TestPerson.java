package dev.soer.labs.test;

import dev.soer.labs.Developer;
import dev.soer.labs.Person;

public class TestPerson {

	public static void main(String[] args) {
		
		Person adam = new Developer();
		
		adam.setName("Adam");
		System.out.println(adam.getName());
	}
}
