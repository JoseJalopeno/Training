package dev.soer.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dev.soer.beans.Person;
import dev.soer.utils.JDBCConnection;

public class PersonDAO implements GenericRepository<Person> {

	private Connection conn = JDBCConnection.getConnection();

	public Person add(Person t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getByName(String n) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> getAll() {
		String sql = "select * from persons;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Person p = new Person();
				p.setId(rs.getInt("id"));
				p.setUsername(rs.getString("username"));
				p.setPassword(rs.getString("password"));
//				p.setCats();
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	public void update(Person t) {
		// TODO Auto-generated method stub

	}

	public void delete(Person t) {
		// TODO Auto-generated method stub

	}

}