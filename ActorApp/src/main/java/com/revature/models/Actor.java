package com.revature.models;

public class Actor {
	
	private int id;
	private String name;
	private int worth;
	
	public Actor() {
		super();
	}

	public Actor(int id, String name, int worth) {
		super();
		this.id = id;
		this.name = name;
		this.worth = worth;
	}

	public Actor(String name, int worth) {
		super();
		this.name = name;
		this.worth = worth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorth() {
		return worth;
	}

	public void setWorth(int worth) {
		this.worth = worth;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", worth=" + worth + "]";
	}
}
