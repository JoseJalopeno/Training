package dev.soer.models;

public class Moon {

	// instance variables
	private String name;
	private double mass;
	private double radius;

	public Moon() {
		
	}
	
	public Moon(String name, double mass, double radius) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Moon [name=" + name + ", mass=" + mass + ", radius=" + radius + "]";
	}
}
