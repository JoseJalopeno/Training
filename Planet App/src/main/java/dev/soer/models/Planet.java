package dev.soer.models;

import java.util.ArrayList;
import java.util.List;

import dev.soer.exceptions.PlanetHasNoMoonsException;

public class Planet {

	// static variable - specific to the class - same for every instance of the class
	// final - once instantiated can no longer be changed
	public static final double G = 6.673E-11;
	
	// instance variables
	private String name;
	private double mass;
	private double radius;
	private boolean atmosphere;
	private List<Moon> moons;
	
	public Planet() {
		super();
	}

	public Planet(String name, double mass, double radius, boolean atmosphere) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.atmosphere = atmosphere;
		this.moons = new ArrayList<Moon>();
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null) {
			System.out.println("Please input a valid name");
		}
		this.name = name;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		if(mass < 0) {
			System.out.println("Please input a valid number");
		}
		this.mass = mass;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isAtmosphere() {
		return atmosphere;
	}

	public void setAtmosphere(boolean atmosphere) {
		this.atmosphere = atmosphere;
	}
	
	public List<Moon> getMoons() throws PlanetHasNoMoonsException {
		if(this.moons == null) {
			throw new PlanetHasNoMoonsException("This planet has no moons");
		}
		else {
			return this.moons;
		}
	}
	
	public void addMoon(String moonName, double mass, double radius) {
		Moon newMoon = new Moon(moonName, mass, radius);
		this.moons.add(newMoon);
	}
	
	public void removeMoon(String moonName) {
		for(Moon m : moons) {
			if(m.getName().equals(moonName)) {
				this.moons.remove(m);
			}
		}
	}
	
	// methods
	public double calculateSurfaceGravity() {
		return (this.mass * G) / (Math.pow(this.radius, 2)); // math
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", mass=" + mass + ", radius=" + radius + ", atmosphere=" + atmosphere
				+ ", moons=" + moons + "]";
	}
	
}
