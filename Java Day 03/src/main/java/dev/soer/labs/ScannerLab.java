package dev.soer.labs;

import java.util.Scanner;

public class ScannerLab {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type in a line and press enter: ");
		String line = scanner.nextLine();
		
		System.out.println("You typed: " + line);	
		
		scanner.close();
		
		String numbers = "1 2 3 4 5 7 9";
		scanner = new Scanner(numbers);
		
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
		}
		scanner.close();
	}
}
