package dev.soer.lambdas;

import java.util.Arrays;
import java.util.List;

public class Wizard {

	String name;
	List<Magic> proficiencies;
	
	public Wizard(String name, Magic... proficiencies) {
		super();
		this.name = name;
		this.proficiencies = Arrays.asList(proficiencies);
	}
	
	interface Potion {
		void makePotion(String ingredient);
	}
	
	static Magic test = () -> {  };
	
	public static void main(String[] args) {
		Wizard hermione = new Wizard("Hermione", Spell.fireball, Spell.alohomora, Spell.avadaKedavra);
		
		hermione.proficiencies.get(1).castSpell();
		
		Potion shrink = (ingredient) -> System.out.println("Made a potion using " + ingredient);
		shrink.makePotion("mushroom");
	}
	
	
	
}
