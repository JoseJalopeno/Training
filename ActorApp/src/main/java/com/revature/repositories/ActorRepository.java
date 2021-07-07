package com.revature.repositories;

import java.util.List;

import com.revature.models.Actor;

public interface ActorRepository {
	
	public Actor getActor(int id);
	public boolean addActor(Actor a);
	public List<Actor> getAllActors();
	public boolean updateActor(Actor change);
	public boolean deleteActor(int id);

}
