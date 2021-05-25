package dev.soer.operators;

public class OperatorPlayground {

	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		

//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y);
//		
//		System.out.println(x % y);
		// determine if variable is even
		
		//Control FLow Statements - ways in whech we can affect the flow of our applications logic
		if(x % y == 0) {
			System.out.println(x + " is an even number");
		}
		else {
			System.out.println(x + " is not an even number...");
		}
	}

}
