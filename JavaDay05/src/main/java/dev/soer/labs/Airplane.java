package dev.soer.labs;

public class Airplane extends FlyingVehicle {

	private short wheels;
	private short propellers;
	
	// constructor
	public Airplane(short wheels, short propellers) {
		this.wheels = wheels;
		this.propellers = propellers;
	}
	
	// getters and setters
	public short getWheels() {
		return wheels;
	}
	public void setWheels(short wheels) {
		this.wheels = wheels;
	}
	public short getPropellers() {
		return propellers;
	}
	public void setPropellers(short propellers) {
		this.propellers = propellers;
	}
	
	// methods
	public void turn() {
		System.out.println("Turning...");
	}
}
