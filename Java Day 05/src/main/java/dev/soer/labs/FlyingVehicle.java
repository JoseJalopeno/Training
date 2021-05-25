package dev.soer.labs;

public class FlyingVehicle extends Vehicle {

	private short wings;
	private Engine engine;
	
	// default constructor
	public FlyingVehicle() {
		
	}
	
	// constructor
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	
	// getters and setters
	public short getWings() {
		return wings;
	}
	
	public void setWings(short wings) {
		this.wings = wings;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	// methods
	public void fly() {
		System.out.println("FlyingVehicle is flying…");
	}

	public void refuel() {
		System.out.println("FlyingVehicle is refueling");
	}

	public void liftOff() {
		System.out.println("FlyingVehicle is lifting off...");
 	}

	public void land() {
    	System.out.println("FlyingVehicle is landing...");
	}
}
