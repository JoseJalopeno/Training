package dev.soer.strings;

public class StringPlayground {

	/*
	 * Strings are objects in Java
	 * Strings are NOT mutable
	 * There are two ways to create a String
	 */
	
	public static void main(String[] args) {
		// string literal
		String s1 = "Hello";
		// other way using String constructor
		String s2 = new String("Hello");
		
//		System.out.println(s1);
//		System.out.println(s2);
		// charAt(int index)
		System.out.println(s1.charAt(0));
		
		// indexOf(char 'c')
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('l'));
		
		// length()
		System.out.println(s1.length());
		
		// substring(int beginIndex, int endIndex) does not include char at end index
		// substring(int index) return from index to length of string
		System.out.println(s1.substring(0,2));
		
		// equals(String or "string")
		System.out.println("s1.equals(s2) " + s1.equals(s2));
		// With strings == is not the same as .equals();
		System.out.println("s1 == s2 " + (s1 == s2));
		
		System.out.println("s1 hash:" + s1.hashCode());
		System.out.println("s2 hash:" + s2.hashCode());
		
		// StringBuilder - an object that manipulates Strings - makes them mutable
		StringBuilder sb = new StringBuilder("My name is Joey!");
		System.out.println(sb);
		sb.append(" Nice to meet me.");
		System.out.println(sb);
		
//		String greeting = "My name is Joey!";
//		System.out.println(greeting);
//		greeting += " Nice to meet me";
//		System.out.println(greeting);
		
		sb.replace(0, 3, "Hi");
		System.out.println(sb);
	}
}
