package dev.soer.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.soer.beans.Employee;
import dev.soer.data.EmployeeDAO;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {

	public Gson gson = new Gson();
	public EmployeeDAO edao = new EmployeeDAO();
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		List<Employee> employees = edao.getAll();
//		for(Employee e : employees) {
//			//System.out.println(e);
//			response.getWriter().append(gson.toJson(e, Employee.class));
//		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		
		Employee e = new Employee();
		e.setFirstName(first_name);
		e.setLastName(last_name);
		e.setEmail(email);
		
		edao.add(e);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
