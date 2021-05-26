package dev.soer.passbyvalueexample;

public class Example {
	// You can define classes in other classes
	// Made it static so we dont need instance of Example class to make a dog instance
	public static class Dog {
		String name;
	}
	public static void main(String[] args) {
//		int x = 5;
//		change(x);
//		System.out.println(x);
//		x = actuallyChange(x);
//		System.out.println(x);
		Dog d = new Dog();
		d.name = "Petunia";
		
		someChange(d);
		
		System.out.println(d.name);
		
		anotherChange(d);
		System.out.println(d.name);
	}
	
	// Methods
	public static void someChange(Dog d) {
		// Because Java is pass by value this does not change the Dog d in the main method
		// we passed the value of d into this method - value of d -> reference to address/location in memory
		// then we call a new constructor() -> and because Java copies values that it passes
		// into methods 
		d = new Dog();
		d.name = "Jimmy";
		// this d now points to a new location in memory
	
	}
	// if wanted to make a change we would do
	public static void anotherChange(Dog d) {
		d.name = "Harry";
	}
	
	public static void change(int x) {// Java makes a copy of the value of x
		x = 10; // even though we set x to 10 it does not affect the x in main()
		/* 
		 *if we wanted to change the value of x...
		 */
	}
	public static int actuallyChange(int x) {
		x = 10;
		return x;
	}
	
}
