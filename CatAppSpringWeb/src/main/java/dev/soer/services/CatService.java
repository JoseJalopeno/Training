package dev.soer.services;

import java.util.List;

import dev.soer.beans.Cat;

public interface CatService {

	public Cat getCatById(int id);
	public List<Cat> getAllCats();
	public Cat addCat(Cat c);
	public void updateCat(Cat c);
	public void deleteCat(Cat c);

	/*
	 * if our cat app needed more logic to it (we had the ability to adopt a cat)
	 * Cat adoptCat(Cat c, Person p); this is where we would have logic to add a cat
	 * to a persons list of cats
	 */
}
