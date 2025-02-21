package com.CollectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getDB() {
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/hii","postgres","sqlsurya");
		}catch(SQLException e) {
			System.out.println(e);
		}
		return con;
	}
}
