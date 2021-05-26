package dev.soer.labs;

public class Vehicle {

	private String name;
	private long serialNumber;
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// methods
	public void move() {
		System.out.println("Vehicle is moving...");
	}
	public void move(int spaces) {
		System.out.println("Vehicle moved " + spaces + " spaces");
	}
}
