package com.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestDropDb {

	public static void main(String[] args) {
         Connection con=null;
         PreparedStatement ps=null;
         con=DBConnection.getDB();
	
	try {
		String sql="drop database apple";
		ps=con.prepareStatement(sql);
		ps.executeUpdate();
		System.out.println("successfully database dropped");
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
