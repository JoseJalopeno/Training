package dev.soer.encapsulation.b;

import dev.soer.encapsulation.a.Shape;

public class BPlayground {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		s.publicMethod();
//		s.protectedMethod(); //only accessible in same package or child class
//		s.defualtMethod(); // only the package
//		s.privateMethod(); // only the class
		
		Rectangle r = new Rectangle();
		r.publicMethod();
		r.publicRectangleMethod();
	}
}
