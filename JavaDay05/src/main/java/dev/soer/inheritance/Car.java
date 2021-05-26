package dev.soer.inheritance;

public class Car {

	//Instance Variables
	private String name; // model of the car
	private int mileage;
	private String color;
	
	// Default Constructor
	public Car() {
		System.out.println("Calling the Car constructor");
	}
	
	// Constructor
	public Car(String name, int mileage, String color) {
		this.name = name;
		this.mileage = mileage;
		this.color = color;
	}
	
	// Getters and Setters (trusted mediators between the rest of the program and the data in this class' field)
	public String getName() {
		return this.name;
	}
	
	public int getMileage() {
		return this.mileage;	
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setName(String name) {
		if(name == null) {
			System.out.println("Cannot have a null value for name");
			return; // return in a void method causes the method to end immediately
		}
		this.name = name;
	}
	
	public void setMileage(int mileage) {
		if(mileage < 0) {
			System.out.println("Cannot have negative mileage");
			return;
		}
		this.mileage = mileage;
	}
	
	public void setColor(String color) {
		if(color == null) {
			System.out.println("Color cannot be null");
			return;
		}
		this.color = color;
	}
	
	// Methods - Method Overloading - Static or Compile time Polymorphism
	public void drive() {
		System.out.println("The car drives");
	}
	
	public void drive(int distance) {
		System.out.println("The car drives " + distance + ".");
	}

	@Override
	public String toString() {
		return "Car [name=" + this.name + ", mileage=" + this.mileage + ", color=" + this.color + "]";
	}
}
