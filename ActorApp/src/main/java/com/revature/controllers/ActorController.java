package com.revature.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.revature.models.Actor;
import com.revature.services.ActorService;

public class ActorController {
	
	/*
	 * Read any necessary information from the request
	 * Call the appropriate Service(s).
	 * Prepare our data to be added to the response
	 * Add said data into the Response Body.
	 * 
	 * Processing Requests and Generating Responses
	 */
	
	public static ActorService as = new ActorService();
	public static Gson gson = new Gson();
	
	public static void getActor(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		String input = request.getParameter("id");
		
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			response.sendError(400, "ID parameter incorrectly formatted.");
			return;
		}
		
		Actor a = as.getActor(id);
		
		response.getWriter().append((a != null) ? gson.toJson(a) : "{}");
	}

	public static void addActor(HttpServletRequest request, HttpServletResponse response) throws JsonSyntaxException, JsonIOException, IOException {

		/*
		 * This time we are going to need to make a POST Request
		 * POST Requests are for creating (adding) data to your DB.
		 * 
		 * What's going to change is that you don't pass
		 * around data you plan to add via parameters.
		 * Instead, any non-GET Request has access to a
		 * Request Body.
		 */
		
		//GSON will convert a JSON passed into the Request Body
		//into an Object for your choosing.
		Actor a = gson.fromJson(request.getReader(), Actor.class);
		
		//Call the appropriate Service for adding Actors
		boolean success = as.addActor(a);
		
		//Most common practice is to send back the added Object
		//Just in case the Client wants to use it again.
		response.getWriter().append((success) ? gson.toJson(a) : "{}");
	
		
	}

}
