package dev.soer.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pokemon {
	// instance variables
	private String type;
	private int id;
	private String name;
	
	public Pokemon() {
		super();
	}

	public Pokemon(String type, int id, String name) {
		super();
		this.type = type;
		this.id = id;
		this.name = name;
	}

	// getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Pokemon [type=" + type + ", id=" + id + ", name=" + name + "]";
	}
	
//	@Override
//	public int compareTo(Pokemon p) {
//		//return this.getId() - p.getId();
//		//return this.getType().compareTo(p.getType());
//		//return this.getName().compareTo(p.getName());
//		int result = this.getType().compareTo(p.getType());
//		
//		if(result != 0) {
//			return result;
//		}
//		return this.getId() - p.getId();
//	}

	public static void main(String[] args) {
		List<Pokemon> pokedex = new ArrayList<Pokemon>();
		
		pokedex.add(new Pokemon("Grass", 1, "Bulbasaur"));
		pokedex.add(new Pokemon("Grass", 2, "Ivysaur"));
		pokedex.add(new Pokemon("Grass", 3, "Venasuar"));
		pokedex.add(new Pokemon("Fire", 4, "Charmander"));
		pokedex.add(new Pokemon("Fire", 5, "Charmeleon"));
		pokedex.add(new Pokemon("Fire", 6, "Charizard"));
		pokedex.add(new Pokemon("Water", 7, "Squirtle"));
		pokedex.add(new Pokemon("Water", 8, "Wartortle"));
		pokedex.add(new Pokemon("Water", 9, "Blastoise"));
		pokedex.add(new Pokemon("Normal", 493, "Arceus"));
		
		for(Pokemon p : pokedex) {
			System.out.println(p);
		}
		
		Collections.sort(pokedex, new PokemonHelper());
		System.out.println();
		
		for(Pokemon p : pokedex) {
			System.out.println(p);
		}
		
	}
}