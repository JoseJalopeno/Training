package dev.soer.app;

import java.util.List;

import dev.soer.models.Breed;
import dev.soer.repositories.BreedDAO;
import dev.soer.repositories.BreedRepository;

public class Driver {

	public static void main(String[] args) {

		BreedDAO br = new BreedDAO();

		List<Breed> breeds = br.getAll();

		for (Breed b : breeds) {
			System.out.println(b);
		}

		// System.out.println("\n\n" + br.getById(1));
//		System.out.println("\n");
//		
//		Breed newBreed = new Breed("Jaguar");
//		br.add(newBreed);
//		
//		for(Breed b : breeds) {
//			System.out.println(b);
//		}
	}
}
