package dev.soer.comparables;

import java.util.Comparator;

public class PokemonHelper implements Comparator<Pokemon> {

	@Override
	public int compare(Pokemon p1, Pokemon p2) {
		return p1.getId() - p2.getId();
	}

}
