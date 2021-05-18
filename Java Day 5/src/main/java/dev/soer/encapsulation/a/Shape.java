package dev.soer.encapsulation.a;

public class Shape {

	public void publicMethod() {
		System.out.println("Hello from the public method");
	}
	
	protected void protectedMethod() {
		System.out.println("Hello from the protected method");
	}
	
	void defaultMethod() {
		System.out.println("Hello from the default method");
	}
	
	private void privateMethod() {
		System.out.println("Hello from the privat emethod");
	}
}
