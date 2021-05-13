package dev.soer.controlflow;

public class SwitchStatements {

	public static void main(String[] args) {
		/*
		 * Switch statements check some variable against multiple, defined values
		 * and execute code if the value of the variable matches
		 * 
		 */
		int x = 2;
		switch (x) {
			case 1: {
				System.out.println("Case 1 is true");
				break;
			}
			case 2: {
				System.out.println("Case 2 is true");
				break;
			}
			case 3: {
				System.out.println("Case 3 is true");
				break;
			}
			default: {
				System.out.println("Reached teh default case");
				break;
			}
		}
	}
}
