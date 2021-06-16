package dev.soer.services;

import java.util.List;

import dev.soer.models.Cat;

public interface CatService {

	Cat addCat(Cat c);

	Cat getCat(Integer id);

	List<Cat> getAllCats();

	boolean updateCat(Cat c);

	boolean deleteCat(Cat c);

	/*
	 * if our cat app needed more logic to it (we had the ability to adopt a cat)
	 * Cat adoptCat(Cat c, Person p); this is where we would have logic to add a cat
	 * to a persons list of cats
	 */
}
