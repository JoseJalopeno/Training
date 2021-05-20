package dev.soer.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionPlayground {
	
	// static with method - no instance needed to run program
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creating a list
//		List<String> names = new ArrayList<String>();
//		/*
//		 * Why List<> and ArrayList<>
//		 * 
//		 * Coding to interfaces - any implementation of List shares functionality (.add(), .remove(), etc)
//		 * 
//		 * All lists share these methods - they also have their own implementations
//		 */
//		// old way
//		String[] names2 = new String[5];
//		names2[0] = "Dan";
//		
//		names.add("Dan");
//		names.add("Ryan");
//		names.add("Sierra");
//		names.add("Adam");
//		names.add("Richard");
//		
//		names.add("Tyler");
//		
//		
//		System.out.println(names);
//		
//		List<Integer> intList = new ArrayList<Integer>();
		
		List<User> users = new ArrayList<User>();
		
		User u = new User("admin", "password", 100);
		User u2 = new User("Bono", "pass", 99);
		
		users.add(u);
		users.add(u2);
		
		System.out.println(users);
		
		
	}
}
