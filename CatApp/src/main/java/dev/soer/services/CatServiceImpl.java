package dev.soer.services;

import java.util.List;

import dev.soer.models.Cat;
import dev.soer.repositories.CatDAO;

public class CatServiceImpl implements CatService{

	private static CatDAO cdao = new CatDAO();
	
	@Override
	public Cat addCat(Cat c) {
		return cdao.add(c);
	}

	@Override
	public Cat getCat(Integer id) {
		return cdao.getById(id);
	}

	@Override
	public List<Cat> getAllCats() {
		return cdao.getAll();
	}

	@Override
	public boolean updateCat(Cat c) {
		return cdao.update(c);
	}

	@Override
	public boolean deleteCat(Cat c) {
		return cdao.delete(c);
	}

}
