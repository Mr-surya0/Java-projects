package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestCreateTable {

	public static void main(String[] args) {
Connection con=null;
Statement st=null;
con=DBConnection.getDB();
try {
	st=con.createStatement();
	String sql="create table students(studid int,stuname varchar(30),stumail varchar(30))";
	st.executeUpdate(sql);
	System.out.println("Successfully table created");
}catch(Exception e) {
	System.out.println(e);
}
	}

}
