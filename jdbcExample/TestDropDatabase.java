package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestDropDatabase {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		con=DBConnection.getDB();
		try {
			st=con.createStatement();
			String sql="drop database product";
			st.executeUpdate(sql);
			System.out.println("Database dropped sucessfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
