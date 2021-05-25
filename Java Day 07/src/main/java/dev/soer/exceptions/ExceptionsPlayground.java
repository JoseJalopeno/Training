package dev.soer.exceptions;

import java.io.FileInputStream;

public class ExceptionsPlayground {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(intArray[0]);
		
		System.out.println(intArray[6]);
		
		try {
			System.out.println(intArray[9]);
			FileInputStream f = new FileInputStream("../applications.properties");
		}
		catch (ArrayIndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}	
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
