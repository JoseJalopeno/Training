package dev.soer.methods;

/*
 * Anatomy of a method
 * 
 * Access Modifier + Non-Access Modifier(optional) + return type + methodName(Param) {body}
 * 
 * Access Modifier - used to define how accessible the given method is
 * 
 * Non-Access Modifier - special keyword that can add or limit functionality to given method
 * 
 * Return type - specifies what type of data the method must return
 * 	Every method must have a return type! - if it doesn't return anything -> void
 * 
 * Method name - name we use to call that method
 * 
 * Parameters - are optional - list of placeholder variables passed into method when it is called
 */

public class MethodPlayground {
	
	public static void main(String[] args) {
		myMethod();
		System.out.println(add(1,2));
		System.out.println(add(1,4));
	}
	
	public static void myMethod() {
		System.out.println("Hello from inside my method!");
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
}
