package dev.soer.labs;

public class ExampleOne {

	public static void main(String[] args) {
		int input = 10;
		ExampleOne eo = new ExampleOne();
		
		System.out.println(eo.factorial(input));
	}
	
	public int factorial(int n) {
		if(n <= 0) return 0;
		if(n == 1) return 1;
		return n * factorial(n-1);
	}
}
