package dev.soer.lambdas;

public class Spell {

	
	//static methods
	static Magic fireball = () -> { System.out.println("Hurls a magic fireball!"); };
	// this overwrites the cast spell in the Magic interface
	static Magic alohomora = () -> { System.out.println("The lock is now open"); };
	
	static Magic avadaKedavra = () -> { System.out.println("This curse is unforgivable"); };
}
