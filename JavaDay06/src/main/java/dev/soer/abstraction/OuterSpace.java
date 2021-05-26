package dev.soer.abstraction;

public class OuterSpace {

	public static void main(String[] args) {
		YellowDwarf sun = new YellowDwarf();
		
		sun.supernova();
		sun.solarFlare();
		
		YellowDwarf newSun = new YellowDwarf();
		newSun.supportLifeOnPlanetEarth();
		
		RedGiant star = new RedGiant();
		star.solarFlare();
	}
}