package com.CollectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

class Input {
	int id;
	String PartNo;
	int ah;

	public Input(int id, String PartNo, int ah) {
		super();
		this.id = id;
		this.PartNo = PartNo;
		this.ah = ah;
	}

	@Override
	public String toString() {
		return "Input [ id=" + id + ", PartNo=" + PartNo + ", ah=" + ah + "]";
	}

}

public class JDBCMap {
	Map<Integer, Input> dataMap = new HashMap<>();

	public void add(int id, Input s) {
		dataMap.put(id, s);
	}

	public void display() {
		System.out.println("Retrieved data:");
		for (Map.Entry<Integer, Input> entry : dataMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/Tera";
		String username = "postgres";
		String password = "sqlsurya";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		JDBCMap jd = new JDBCMap();
		try {
			connection = DriverManager.getConnection(url, username, password);

			statement = connection.createStatement();

			resultSet = statement.executeQuery("SELECT * FROM product_tbl order by id asc");

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String part_no = resultSet.getString("part_no");
				int ah = resultSet.getInt("ah");
				jd.add(id, new Input(id, part_no, ah));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 

		jd.display();
	}
}
