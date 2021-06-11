package dev.soer.repositories;

import java.util.List;

import dev.soer.models.Breed;
import dev.soer.utils.MockDB;

public class BreedRepository implements GenericRepository<Breed> {

	public Breed add(Breed b) {
		Breed breed = MockDB.breeds.stream().max((b1, b2) -> b1.getId().compareTo(b2.getId())).orElse(null);
		Integer id = (breed != null) ? breed.getId() + 1 : 1;
		b.setId(id);
		MockDB.breeds.add(b);
		return b;
	}
	// using Streams to simulate connecting and retrieving and sending data to from a DB
	public Breed getById(Integer id) {
		return MockDB.breeds.stream().filter((b) -> b.getId() == id).findFirst().orElse(null);
	}

	public boolean update(Breed b) {
		Integer id = MockDB.breeds.indexOf(b);
		return false;
	}

	public boolean delete(Breed b) {
		return MockDB.breeds.remove(b);
	}

	public List<Breed> getAll() {
		return MockDB.breeds;
	}

}
