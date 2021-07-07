package dev.soer.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.soer.beans.Breed;
import dev.soer.utils.JDBCConnection;

public class BreedDAO implements GenericRepository<Breed> {

	private Connection conn = JDBCConnection.getConnection();

	@Override
	public Breed getById(Integer id) {
		String sql = "select * from breeds where id = ?";
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				Breed b = new Breed();
				b.setId(rs.getInt("id"));
				b.setBreed(rs.getString("breed"));
				
				return b;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public List<Breed> getAll() {
		List<Breed> breeds = new ArrayList<Breed>();
		String sql = "select * from breeds;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Breed b = new Breed();
				b.setId(rs.getInt("id"));
				b.setBreed(rs.getString("breed"));
				breeds.add(b);
			}
			return breeds;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Breed add(Breed b) {
		String sql = "insert into breeds values (default, ?);";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getBreed());
			
			boolean success = ps.execute();
			
			if (success) {
				ResultSet rs = ps.getResultSet();
				
				if (rs.next()) {
					b.setId(rs.getInt("id"));
					return b;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public void update(Breed t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Breed t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Breed getByName(String n) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
