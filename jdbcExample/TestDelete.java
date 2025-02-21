package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		con=DBConnection.getDB();
		try {
			st=con.createStatement();
			String sql="DELETE from students where studid=103";
			st.executeUpdate(sql);
			System.out.println("Deleted sucessfully");
			
		}catch(Exception e) {System.out.println(e);}
	}

}
