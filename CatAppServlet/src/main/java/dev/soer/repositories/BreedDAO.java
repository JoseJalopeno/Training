package dev.soer.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.soer.models.Breed;
import dev.soer.utils.JDBCConnection;

public class BreedDAO implements GenericRepository<Breed> {

	private Connection conn = JDBCConnection.getConnection();

	@Override
	public Breed add(Breed b) {
		String sql = "insert into breeds values (default, ?) returning *;";

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
	public Breed getById(Integer id) {
		String sql = "select * from breeds where id = ?;";

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
	public boolean update(Breed b) {

		String sql = "update breeds set id = ?, breed = ? where id = ?;";

		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(b.getId()));
			ps.setString(2, b.getBreed());

			boolean success = ps.execute();

			if (success) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public boolean delete(Breed b) {
		String sql = "delete from breeds where id = ?;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(b.getId()));

			boolean success = ps.execute();

			if (success) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
}
