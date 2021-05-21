package dev.soer.app;

import dev.soer.exceptions.PlanetHasNoMoonsException;
import dev.soer.models.Moon;
import dev.soer.models.Planet;

public class OuterSpace {

	public static void main(String[] args) {
		
		Planet mars = new Planet("Mars", 6.39E+23, 3389.5, false);
		
		
		mars.addMoon("Phobos", 6.39E+21, 33.5);
		mars.addMoon("Deimos", 6.39E+21, 33.5);
		
		System.out.println(mars);
		System.out.println(mars.calculateSurfaceGravity());
		
		mars.removeMoon("Phobos");
		System.out.println(mars);
		
		Planet venus = new Planet("Venus", 34.9, 32.5, true);
		System.out.println(venus);
		try {
			for(Moon m : venus.getMoons()) {
				System.out.println(m);
			}
		}
		catch(PlanetHasNoMoonsException e) {
			e.printStackTrace();
		}
	}
}
