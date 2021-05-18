package dev.soer.wrappers;

import java.util.ArrayList;
import java.util.List;

public class WrapperPlayground {

	public static void main(String[] args) {
		int i = 100;
		/*
		 * Wrapper classes are ways to work with primitives by making them objects
		 * All primitives have a wrapper class
		 */
		
		Integer i2 = i; // autoboxing - java behind the scenes automatically wraps our primitive in an Object
		Double d = 3.54;
		Float f = 5.00f;
		Boolean b = false;
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(i);
		
	}
}
