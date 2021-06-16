package dev.soer.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.soer.beans.Employee;
import dev.soer.utils.JDBCConnection;

public class EmployeeDAO implements GenericRepository<Employee>{

	private Connection conn = JDBCConnection.getConnection();
	
	@Override
	public Employee add(Employee e) {
		String sql = "insert into employees values (default, ?, ?, ?) returning *";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, e.getFirstName());
			ps.setString(2, e.getLastName());
			ps.setString(3, e.getEmail());
			
			boolean success = ps.execute();
			if(success) {
				ResultSet rs = ps.getResultSet();
				
				if (rs.next()) {
					e.setId(rs.getInt("id"));
					return e;
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getById(Integer id) {
		return null;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "select * from employees";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setFirstName(rs.getString("first_name"));
				e.setLastName(rs.getString("last_name"));
				e.setEmail(rs.getString("email"));
				employees.add(e);
			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Employee e) {
		return false;
	}

	@Override
	public boolean delete(Employee e) {
		return false;
	}

	
}
