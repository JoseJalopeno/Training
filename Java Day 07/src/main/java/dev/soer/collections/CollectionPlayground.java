package dev.soer.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		//
		
		User u = new User("admin", "password", 100);
		User u2 = new User("Bono", "pass", 99);
		
//		users.add(u);
//		users.add(u2);
//		
//		System.out.println(users);
		
		
		
		
		
		
		
		/*
		 * Maps - an object that maps keys to values. Key value pairs.
		 * a map cannot contain duplicate keys every key must be unique
		 * 
		 * each key maps to at most one value
		 * 
		 * HashMap - can contain one null value for a key (only one key in the map can be null)
		 * do no preserve order
		 * 
		 * Map<Key, Value> map = new HashMap<Key, Value>()
		 * 
		 */
		User u3 = new User("Tony", "pass", 99);
		User u4 = new User("Harry", "igloo", 23);
		User u5 = new User("George", "clooney", 999);
		
		Map<String, User> userMap = new HashMap<String, User>();
		
		userMap.put("admin", u);
		userMap.put("Bono", u2);
		userMap.put("Tony", u3);
		userMap.put("Harry", u4);
		userMap.put("george", u5);
		
		//System.out.println(userMap);
		
		User u6 = new User("helena", "flox", 99);
		User u7 = new User("benji", "halloween", 99);
		User u8 = new User("micheal", "david", 99);
		
		List<User> users = new ArrayList<User>();
		users.add(u6);
		users.add(u7);
		users.add(u8);
		
		for(User user : users) {
			userMap.put(user.getUsername(), user);
		}
		//System.out.println(userMap);
		
		// .keySet() will return
//		for(String key : userMap.keySet()) {
//			System.out.println("Key: " + key + "\nValue: " + userMap.get(key));
//		}
//		
//		for(Map.Entry<String, User> entry : userMap.entrySet()) {
//			String key = entry.getKey();
//			User us = entry.getValue();
//			System.out.println("Key: " + key + " Value" + us);
//		}
//		
//		for(User user : userMap.values()) {
//			System.out.println(user);
//		}
		
		// .forEach() - *more details on how this works later - because it uses Lambdas*
		userMap.forEach((key, value) -> System.out.println("Key: " + key + " Value:" + value));
	}
}
