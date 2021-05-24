package dev.soer.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Collections: a class filled with static methods used to manipulate collections
 * 
 * NOT to be confused with Collection -> which is an interface that provides the standard functionality of a collection
 * 		sometimes referred to as the Collection API (Application Programming Interface)
 * 
 */

public class SortingPlayground {

	public static void main(String[] args) {
		//we have an Arrays class
		int[] arr = {6,4,2,55,12,5,3,44,55,0};
		Integer[] arr2 = {6,4,2,55,12,5,3,44,55,0};
		
		System.out.println("Before: ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		Arrays.sort(arr);
		
		System.out.println("\nAfter: ");
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(100);
		list.add(6);
		list.add(0);
		
		System.out.println("\nList Before: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		Collections.sort(list);;
		
		System.out.println("\nList After: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		/*
		 * Both TreeSet and TreeMap order the insertion of objects in the collection based on a sorting method
		 * 
		 * 		whether it be implicit (Strings, primitives)
		 * 		or explicit (implementing Comparable or passing an instance of a Comparator to the constructor
		 * 
		 * TreeSet and TreeMap sort at the moment of insertion
		 */
		
		Set<String> exampleTree = new TreeSet<>();
		
		exampleTree.add("hello");
		exampleTree.add("1hello");
		exampleTree.add("!hello");
		exampleTree.add("hello world");
		
		System.out.println("\n\nTreeSet: ");
		for(String s : exampleTree) {
			System.out.println(s);
		}
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(5, "five");
		treeMap.put(3, "three");
		treeMap.put(4, "four");
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		
		System.out.println("\n\nTree Map: "); // does not come from Collection interface so it does not implement iterable
		for(Integer i : treeMap.keySet()) {
			System.out.println(i + " -> " + treeMap.get(i));
		}
		
		Iterator it = treeMap.entrySet().iterator();
		System.out.println("Other way: ");
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		System.out.println();
		
		Map<User, Integer> uMap = new TreeMap<User, Integer>();
		
		uMap.put(new User("John", 55), 10101);
		uMap.put(new User("Peter", 64), 41414);
		uMap.put(new User("Paul", 99), 23232);
		uMap.put(new User("Mary", 32), 56565);
		
		uMap.forEach((user, num) -> System.out.println(user + " -> " + num));
	}

}
