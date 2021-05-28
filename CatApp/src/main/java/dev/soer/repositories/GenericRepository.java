package dev.soer.repositories;

import java.util.List;

public interface GenericRepository<T> {

	// these will be the methods that align with CRUD operations (how we interact with the database)
	
	//create
	public T add(T t);
	
	// read
	public T getById(Integer id);
	
	public List<T> getAll();
	
	// update
	public void update(T t);
	
	// delete
	public void delete(T t);
}
