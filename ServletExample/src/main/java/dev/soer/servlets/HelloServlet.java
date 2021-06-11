package dev.soer.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		PrintWriter pw = response.getWriter();
//		
//		pw.write("<h1>Hello again</h1>");
		response.getWriter().write("This is another way to write");
	}
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		response.getWriter().write("Hello, " + firstName + " " + lastName);
	}
	
	

}