package dev.soer.encapsulation.a;

public class APlayground {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.publicMethod();
		s.protectedMethod();
		s.defaultMethod();
//		s.privateMethod(); //This method is not visible since it is defined in another class
	}
}
