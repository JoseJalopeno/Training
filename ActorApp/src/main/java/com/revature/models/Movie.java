package com.revature.models;

public class Movie {
	
	private int id;
	private String title;
	private String description;
	private int runtime;
	
	public Movie() {
		super();
	}

	public Movie(int id, String title, String description, int runtime) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.runtime = runtime;
	}

	public Movie(String title, String description, int runtime) {
		super();
		this.title = title;
		this.description = description;
		this.runtime = runtime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", description=" + description + ", runtime=" + runtime + "]";
	}
	
	

}
