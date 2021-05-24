package dev.soer.scopes;

/*
 * When a variable is declared in Java, it is attached to a specific scope within the program
 * this scope is determined by where the variable resides (where it is declared)
 * 
 * the different variable scopes in Java are: 
 * 
 * Class (static) scope
 * Instance (object) Scope
 * Method Scope
 * Block Scope
 * 
 */

public class VariablesScopes {

	/*
	 * Class scope varialbes reside in the class definition themselves
	 * 
	 * this means that when an object updates a class-scoped variable, that change is 
	 * reflected across all instances of the class
	 * 
	 * class scope is declared with the static keyword
	 * 
	 * methods can also be declared as class scope
	 * 
	 * when we declare a variable as class scope we should reference it through the class (not an instance)
	 * 	ex. VariableScopes.classScope;
	 * 
	 */
	public static String classScope;
	/*
	 * instance scope means that the variable is attached to an individual objects created from the class.
	 * when an instance-scoped variable is modified, it has no effect on the other, distinct instance of the class
	 * 
	 */
	public String instanceScope;
	
	// static methods are considered class scope
	public static void classScopeMethod() {
		
	}
	
	/*
	 * method scope - is the scope of a variable declared within a method block (static or instance method)
	 * 
	 * these method scoped variables are only available (visible) with the method they are declared
	 * they do not exist after the method executes.
	 */
	public static void methodScopeExampleMethod(String methodScopeParameter) { //this parameter is also considered method scope
		// this variable only exits for the duration of this method
		String methodScope = "I'm method scope.";
	}
	
	/*
	 * block scope - variables only exists within the specific control flow block
	 * 
	 * for, if/else, while, do-while, switch statements.cases .... -> {}
	 * 
	 * after the block ends, the variables declared within it are no longer available
	 */
	public static void main(String[] args) {
		if(true) { // if(?) also only exists in the statement
			String str = "Hello"; // only exists in this if statement
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i); // i exists only in this block statement
		}
		// i- is outside of the block where it was declared
		// str - we are outside of the block where it was declared
	}
}
