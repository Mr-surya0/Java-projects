package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestCreateDatabase {

	public static void main(String[] args) {
		Connection con = null;
		Statement st=null;
		con =DBConnection.getDB();
		try {
			st=con.createStatement();
			String sql="Create database students";
			st.executeUpdate(sql);
			System.out.println("Sucessfully Database created");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
