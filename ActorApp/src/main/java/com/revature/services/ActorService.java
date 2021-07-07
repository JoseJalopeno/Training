package com.revature.services;

import com.revature.models.Actor;
import com.revature.repositories.ActorRepository;
import com.revature.repositories.ActorRepositoryImpl;

public class ActorService {
	
	private ActorRepository ar = new ActorRepositoryImpl();
	
	public Actor getActor(int id) {
		return ar.getActor(id);
	}
	
	public boolean addActor(Actor a) {
		return ar.addActor(a);
	}

}
