package dev.soer.abstraction;

public class RedGiant extends Star {

	@Override
	public void supernova() {
		System.out.println("Red Giants version of a supernova");
		
	}
	
	@Override
	public void solarFlare() {
		super.solarFlare();
		System.out.println("Yikes");
	}
	
	public void redGiantMethod() {
		System.out.println("Only i can do this");
	}

}
