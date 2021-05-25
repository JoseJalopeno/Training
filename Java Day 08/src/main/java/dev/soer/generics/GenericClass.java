package dev.soer.generics;

/*
 * We can define our own classes with generic types
 * 
 * Naming conventions:
 * technically type parameters can be name anything you want
 * the convention is to use single, upper case letters to make it obvious that they are not real class names
 * 
 * E -> Elements
 * K -> Map Key
 * V -> Map Value
 * N -> Number
 * T -> Generic Data Type (String, Double, Integer)
 * S, U, V etc -> for multiple generic data types if needed
 * 
 */

// we use angle brackets <> to specify parameter type
public class GenericClass<T> { //the data of this classes members will be whatever is specified at object instantiation

	private T value;
	
	public T getValue() {
		return this.value;
	}

	public void setValue(T t) {
		this.value = t;
	}
	
	
	
}
