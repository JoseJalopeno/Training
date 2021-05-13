package dev.soer.primitives;

public class PrimitivePlayground {

	public static void main(String[] args) {
		/*
		 * Variables
		 * 
		 * All variables only hold a single value
		 * 
		 * Primitives reserve a fixed amount of memory to hold a specific value
		 * of specific type
		 * 
		 * In Java - there are 8 primitives
		 * 
		 * Whole Numbers: 
		 * byte
		 * short
		 * char
		 * int
		 * long
		 * 
		 * Decimal Numbers:
		 * float
		 * double
		 * 
		 * Other:
		 * boolean
		 * 
		 * EVERYTHING else are reference variables (hold a reference to an objects
		 * location in memory)
		 * 
		 */
		
		//Remember - Java is statically typed
		//assign data type when declaring variables
		byte b = 127; //1 byte (8 bits)
		short s = 32767; 
		char c = 'c'; //2 bytes (ascii values)
		int i = 2147483647; // 4 bytes (32 bits)
		long l = 9223372036854775807L; // 8 bytes (64 bits)
		float f = 3.4f; // 
		double d = 688.77; // 
		boolean bool = false;
		
		System.out.println("Byte: " + b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		
		/*
		 * Casting
		 * 
		 * How we convert from one data type to another
		 * 
		 * Most conversions must be done explicitly
		 * 
		 */
		//Note that if casting down (down casting) from larger data type to smaller data type it will not always work
		long longNum = 94l; 
		int castedInt = (int)longNum;
		System.out.println("Casted Int: " + castedInt); //concatenation
		
		//Casting up can be done implicitly - but it's always better to be explicit in your code
		
		long castInt = (int) i;
		System.out.println("Long cast int: " + castInt);
		
		//int castBool = (int) bool; this wont work
		long bigNum = 2147483648L;
		int testCast = (int) bigNum;
		System.out.println("Test Cast: " + testCast);
		
		
	}

}
