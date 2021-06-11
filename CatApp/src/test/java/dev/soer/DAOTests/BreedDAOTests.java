package dev.soer.DAOTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import dev.soer.models.Breed;
import dev.soer.repositories.BreedDAO;

public class BreedDAOTests {
	
	private BreedDAO bdao = new BreedDAO();
	
	@Test
	public void getAllBreedsTest() {
		List<Breed> breeds = new ArrayList<Breed>();
		
		Breed b1 = new Breed(1, "Calico");
		Breed b2 = new Breed(2, "Tabby");
		Breed b3 = new Breed(3, "Persian");
		Breed b4 = new Breed(4, "Bengal");
		Breed b5 = new Breed(5, "Sphynx");
		Breed b6 = new Breed(6, "Siamese");
		Breed b7 = new Breed(7, "Panther");
		
		breeds.add(b1);
		breeds.add(b2);
		breeds.add(b3);
		breeds.add(b4);
		breeds.add(b5);
		breeds.add(b6);
		breeds.add(b7);
		
		Assert.assertEquals(breeds, bdao.getAll());
	}
	
	@Test
	public void getBreedByIdTest() {
		List<Breed> breeds = new ArrayList<Breed>();
		
		Breed b1 = new Breed(1, "Calico");
		Breed b2 = new Breed(2, "Tabby");
		Breed b3 = new Breed(3, "Persian");
		Breed b4 = new Breed(4, "Bengal");
		Breed b5 = new Breed(5, "Sphynx");
		Breed b6 = new Breed(6, "Siamese");
		Breed b7 = new Breed(7, "Panther");
		
		breeds.add(b1);
		breeds.add(b2);
		breeds.add(b3);
		breeds.add(b4);
		breeds.add(b5);
		breeds.add(b6);
		breeds.add(b7);
		
		Assert.assertEquals(breeds.get(0), bdao.getById(1));
		Assert.assertEquals(breeds.get(1), bdao.getById(2));
		Assert.assertEquals(breeds.get(2), bdao.getById(3));
		Assert.assertEquals(breeds.get(3), bdao.getById(4));
		Assert.assertEquals(breeds.get(4), bdao.getById(5));
		Assert.assertEquals(breeds.get(5), bdao.getById(6));
		Assert.assertEquals(breeds.get(6), bdao.getById(7));
	}
	
//	@Test
//	public void addBreedTest() {
//		Breed b = new Breed("Test");
//		Assert.assertEquals(true, bdao.add(b));
//	}
}