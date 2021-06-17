package dev.soer.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import dev.soer.models.Cat;
import dev.soer.services.CatServiceImpl;

public class CatServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4139661865981806797L;
	private CatServiceImpl cs = new CatServiceImpl();
	private Gson gson = new Gson();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		String uri = request.getRequestURI();
		
		System.out.println(uri);

		/* for GET requests:
		 * 
		 *  localhost:8080/CatAppServlet/cats -> get all cats
		 *  
		 *  /cats/<id> -> get a cat by id
		 *  
		 *  */
		switch (uri) {

		case "/CatAppServlet/cats": {
			System.out.println("Getting all cats....");
			List<Cat> cats = cs.getAllCats();
			System.out.println(cats);
			response.setHeader("Access-Control-Allow-Origin","*");
			response.getWriter().append(gson.toJson(cats));
			break;
		}
		
		default: {
			System.out.println("Reached the default case...");
			response.sendError(418, "BRB MAKING TEA");
		}
		
		
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Post request");
	}
}
