package dev.soer.abstraction;

/*
 * Abstract class is a class that cannot be instantiated
 * abstract classes often contain unimplemented methods that MUST be overridden by a concrete subclass
 * 
 * you can have concrete methods in an abstract class
 * 
 * but - any class that has an abstract methods - MUST be an abstract class
 */

public abstract class Star {
	public String name;
	public int age;

	/*
	 * abstract methods that have no implementation (no body) - only a method signature
	 * any concrete subclass that extends this abstract class will be required to implement all of the abstract methods
	 */
	
	public abstract void supernova();
	
	public void solarFlare() {
		System.out.println("Lots of radiation");
	}
}
