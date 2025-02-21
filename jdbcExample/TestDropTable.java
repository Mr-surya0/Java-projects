package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestDropTable {

	public static void main(String[] args) {
      Connection con=null;
      Statement st=null;
      con=DBConnection.getDB();
      try {
    	  st=con.createStatement();
    	  String sql="drop table students";
    	  st.executeUpdate(sql);
    	  System.out.println("Table dropped successfully");
      }catch(Exception e) {System.out.println(e);}
	}

}
