package dev.soer.collections;

public class User implements Comparable<User>{

	public String name;
	public int age;
	
	public User() {
		
	}
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + this.name + ", age=" + this.age + "]";
	}

	/*
	 * compareTo() looks at each element of the collection
	 * and returns either -1, 0, or 1 to determine the order
	 */
	
	@Override
	public int compareTo(User u) {
//		return this.age - u.age; // ascending
//		return u.age - this.age; // descending
		return this.name.compareTo(u.name); // return on name in ascending
//		return u.name.compareTo(this.name); // return on name in descending
	}
	
	
}
