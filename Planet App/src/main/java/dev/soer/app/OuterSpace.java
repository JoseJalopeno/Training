package dev.soer.app;

import dev.soer.models.Planet;

public class OuterSpace {

	public static void main(String[] args) {
		
		Planet mars = new Planet("Mars", 6.39E+23, 3389.5, false);
		
		System.out.println(mars);
		System.out.println(mars.calculateSurfaceGravity());
	}
}
