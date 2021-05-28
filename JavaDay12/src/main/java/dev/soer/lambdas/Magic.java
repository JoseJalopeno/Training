package dev.soer.lambdas;

@FunctionalInterface
public interface Magic {

//	//variables
//	double G = 6.67E-11;
	
	void castSpell();
	
	default void beOminous() { // nb 'defualt' here is not the access modifier that provides package-private access
		System.out.println("Boo");
	}
}
