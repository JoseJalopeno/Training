package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.revature.models.Movie;

public class MovieController {
	
	public static Gson gson = new Gson();
	
	public static void addMovie(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		BufferedReader reader = request.getReader();
		
		Movie m = gson.fromJson(reader, Movie.class);
		System.out.println(m);
		
//		String line = reader.readLine();
//		while(line !=  null) {
//			System.out.println(line);			
//			
//			line = reader.readLine();
//		}
		
		//Typically I would have added the new movie to my DB
		
		response.getWriter().append(gson.toJson(m));
		
//		response.sendRedirect("/ActorApp/actorviewer.html");
		
	}

}
