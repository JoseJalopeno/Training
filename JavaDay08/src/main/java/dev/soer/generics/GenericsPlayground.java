package dev.soer.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsPlayground {

	public static void main(String[] args) {
		
		// generics were introduced in java 1.5
		List myList = new ArrayList();
		myList.add("abc");
		myList.add(5);
		
//		for(Object o : myList) {
//			String str = (String) o;
//			System.out.println(str);
//		}
		
		List<String> strList = new ArrayList<String>();
		strList.add("abc");
		strList.add("def");
		
		for(String s : strList) {
			System.out.println(s);
		}
		
		// the data types we pass to this class will determine the data type of its members
		// attributes, methods etc
		
		GenericClass<String> myGenericClass = new GenericClass<String>();
		myGenericClass.setValue("some value");
		System.out.println(myGenericClass.getValue());
		
		GenericClass<Integer> myGenClass = new GenericClass<Integer>();
		myGenClass.setValue(100); // auto boxing
		System.out.println(myGenClass.getValue());
		
		double casted = myGenClass.getValue();
		System.out.println(casted);
	}
	
}
