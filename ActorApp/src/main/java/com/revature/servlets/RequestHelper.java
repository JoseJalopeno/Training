package com.revature.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.ActorController;
import com.revature.controllers.MovieController;

public class RequestHelper {
	
	/**
	 * This method will delegate other methods on the controller
	 * layer of our application to process the request.
	 * @param request the HTTP Request
	 * @param response the HTTP Response
	 * @throws IOException 
	 */
	public static void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String uri = request.getRequestURI();
		
		System.out.println(uri);
		
		switch (uri) {
		
		case "/ActorApp/getActor.do": {
			ActorController.getActor(request, response);
			break;
		}
		case "/ActorApp/addActor.do": { 
			ActorController.addActor(request, response);
			break;
		}
		case "/ActorApp/addMovie.do": {
			MovieController.addMovie(request, response);
			break;
		}
		default: {
			response.sendError(418, "Default case hit. Cannot brew coffee, is teapot.");
			break;
		}
		}
		
	}

}
