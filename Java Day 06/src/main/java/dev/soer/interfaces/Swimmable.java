package dev.soer.interfaces;


// Interfaces are implicitly abstract, you can add 'abstract' but its redundant
public interface Swimmable {

	/*
	 * Interface has no constructor - Interfaces cannot be instantiated - they can only be implemented or extended
	 * all fields declared within an interface are implicitly: public static final
	 * 
	 * static and final are referred to an Non-Access Modifiers
	 * 
	 * static means the variable or method that it's modifying is a class variable (class scope)
	 * across all instances of that class they share the same static variable
	 * with methods - this means we don't need an instance of the class in order to call that method
	 * 
	 * final - keyword that means the variable or method or class cannot be changed once instantiated.
	 */
	
	//abstract method - because this is an interface, the abstract keyword and public access modifier are implied
	void swim();
	
	// since Java 8, we can declare and provide implementation for default methods in our interfaces
	// we can have concrete methods in our interfaces
	default void floatOnWater() {
		System.out.println("The object can float");
	}
	
	
	
}
