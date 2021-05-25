package dev.soer.labs.one;

import dev.soer.labs.Person_;
import dev.soer.labs.two.ProtectedSubClass;

public class AccessModifiers {

	public static void main(String[] args) {
		Person_ adam = new Person_();
		adam.age = 15;
		
		System.out.println(adam.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
	}
}
