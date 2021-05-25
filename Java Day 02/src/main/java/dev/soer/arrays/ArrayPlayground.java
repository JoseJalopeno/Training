package dev.soer.arrays;

/*
 * Arrays are collections of multiple values of the same type
 * 
 * Arrays have a fixed length, determined at creation
 * 
 * arrays can be pre-populated
 * 
 * Arrays are accessed by index (Starts at 0 -> length - 1
 */

public class ArrayPlayground {

	public static void main(String[] args) {
		//Array declaration
		int[] intArray = new int[10]; // size 10 or length of 10
		
		// Array literal (pre-populated)
		int[] otherArray = {1,2,3,4,5}; // length of 5
		
		System.out.println("Array length: " + intArray.length);
		System.out.println("Other array length: " + otherArray.length);
		
		System.out.println("Other array index 1: " + otherArray[0]); // references the 0 index of the array
		System.out.println("Other array index 5: " + otherArray[4]); 
//		System.out.println(otherArray[5]); // runtime exception
		
		int[][] multiArray = {{1, 2, 3}, {4, 5, 6}};
		
		System.out.println("Multi array: " + multiArray[0][2]);
		
		System.out.println("Before assignemnt: " + intArray[0]);
		
		intArray[0] = 100;
		
		System.out.println("After assignemnt: " + intArray[0]);
		System.out.println(":::: FOR LOOP ::::");
		for(int i = 0; i < otherArray.length; i++) { // unary operator - increment decrement
			System.out.println(otherArray[i]);
		}
		
		// enhanced for loop
		for (int i : otherArray) {
			System.out.println(i);
		}

	}
}
