package com.jdbcMap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DBConnection {

	public static Connection getDB() {
        Connection con=null; 
		try {
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/datas","postgres","sqlsurya");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
