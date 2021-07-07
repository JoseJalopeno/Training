package com.revature.repositories;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.Actor;
import com.revature.util.JDBCConnection;

public class ActorRepositoryImpl implements ActorRepository {

public static Connection conn = JDBCConnection.getConnection();
	
	@Override
	public Actor getActor(int id) {
		
		try {
			String sql = "SELECT * FROM actors WHERE id = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(id));

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				Actor a = new Actor();
				a.setId(rs.getInt("ID"));
				a.setName(rs.getString("NAME"));
				a.setWorth(rs.getInt("WORTH"));

				return a;
//				return new Actor(rs.getInt("ID"), rs.getString("NAME"), rs.getInt("WORTH"));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean addActor(Actor a) {
		try {

			String sql = "CALL add_actor(?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, a.getName());
			cs.setString(2, Integer.toString(a.getWorth()));

			cs.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<Actor> getAllActors() {
		return null;
	}

	@Override
	public boolean updateActor(Actor change) {
		return false;
	}

	@Override
	public boolean deleteActor(int id) {
		return false;
	}


	
}
