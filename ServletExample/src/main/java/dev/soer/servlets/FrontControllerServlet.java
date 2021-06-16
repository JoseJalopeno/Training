package dev.soer.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FrontControllerServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Welcome to the front controller");
		
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		System.out.println(uri);
		
		response.getWriter().append("\n" + uri);
		
		// Sessions
//		HttpSession session = request.getSession();
//		System.out.println(session.getId());
		
//		session.setAttribute("currentUser", "{'firstname':'Joey', 'lastName':'Soer', 'age':1234}");
//		System.out.println(session.getAttribute("currentUser"));
//		session.setMaxInactiveInterval(180);
		//session.invalidate();
		
		switch(uri) {
			case "/ServletExample/Test": {
				response.getWriter().append("\nTest Worked");
				//response.getWriter().append("\n" + session.getAttribute("currentUser"));
				break;
			}
			case "/ServletExample/googleredirect": {
				response.sendRedirect("https://www.google.com");
				break;
			}
			case "/ServletExample/bean": {
				response.sendRedirect("/ServletExample/BeanServlet");
				break;
			}	
			case "/ServletExample/employee": {
				response.sendRedirect("/ServletExample/EmployeeServlet");
			}
			case "/ServletExample/insert": {
				response.sendRedirect("/ServletExample/insert.html");
			}
			default: {
				response.sendError(418, "Busy eating cookies. Come back later.");
				break;
			}
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}
}
