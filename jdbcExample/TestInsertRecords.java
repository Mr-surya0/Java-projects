package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestInsertRecords {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		con=DBConnection.getDB();
		try {
			st=con.createStatement();
			String sql="insert into students values(102,'react','react@gmail.com')";
			st.executeUpdate(sql);
			System.out.println("Records inserted sucessfully");
			
			String sql1="insert into students values(103,'python','python@gmail.com')";
			st.executeUpdate(sql1);
			System.out.println("Second query executed sucessfully");
		}catch(Exception e) {System.out.println(e);}
	}

}
