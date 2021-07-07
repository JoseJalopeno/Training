package dev.soer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.soer.beans.Cat;
import dev.soer.data.CatHibernate;

@Service
public class CatServiceImpl implements CatService {

//	@Autowired // Dependency Injection - Field Injection
//	private CatHibernate ch;

	private CatHibernate ch;

	// Constructor Injection
	@Autowired
	public CatServiceImpl(CatHibernate ch) { // Like Dependency Injection in Angular
		this.ch = ch;
	}

//	// Setter Injection
//		@Autowired
//		public void setCatHibernate(CatHibernate ch) {
//			this.ch = ch;
//		}

	@Override
	public Cat getCatById(int id) {
		return ch.getById(id);
	}

	@Override
	public List<Cat> getAllCats() {
		return ch.getAll();
	}

	@Override
	public Cat addCat(Cat c) {
		return ch.add(c);
	}

	@Override
	public void updateCat(Cat c) {
		ch.update(c);

	}

	@Override
	public void deleteCat(Cat c) {
		ch.delete(c);

	}

}
