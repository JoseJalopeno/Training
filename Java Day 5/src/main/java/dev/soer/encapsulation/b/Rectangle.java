package dev.soer.encapsulation.b;

import dev.soer.encapsulation.a.Shape;

//Extends is the keyword we use to create child classes or subclasses -> when we want to extend that class
public class Rectangle extends Shape{

	public void publicRectangleMethod() {
		System.out.println("Public Rectangle Method");
		this.protectedMethod();
	}
}
