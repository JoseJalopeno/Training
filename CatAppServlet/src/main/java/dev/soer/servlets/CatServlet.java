package dev.soer.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.soer.models.Cat;
import dev.soer.services.CatServiceImpl;

public class CatServlet extends HttpServlet {
	
	private CatServiceImpl cs = new CatServiceImpl();
	private Gson gson = new Gson();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println(uri);
		/*
		 * localhost:8080/CatAppServlets/cats -> get all cats
		 * 
		 * /cats/<id> -> get cat by id
		 */
		switch(uri) {
			case "/CatAppServlet/cats": {
				System.out.println("getting all cats...");
				List<Cat> cats = cs.getAllCats();
				System.out.println(cats);
				response.getWriter().append(gson.toJson(cats, Cat.class));
				break;
			}
			default: {
				System.out.println("Reached teh default case...");
				response.sendError(418, "BRB making tea");
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
