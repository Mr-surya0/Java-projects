package com.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Asc {

	public static void main(String[] args) {
      Connection con=null;
      PreparedStatement ps=null;
      con=DBConnection.getDB();
      try {
    	  String sql="select * from fruits  order by fid Asc";
    	  ps=con.prepareStatement(sql);
    	  ResultSet query=ps.executeQuery();
    	  while(query.next()) {
    		  int id=query.getInt("fid");
    		  String name=query.getString("fname");
    		  String price=query.getString("fprice");
    		  System.out.println(id+"\t"+name+"\t"+price);
    	  }
      }catch(Exception e) {
    	  System.out.println(e);
      }
	}

}
