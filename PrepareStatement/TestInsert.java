package com.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestInsert {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		con=DBConnection.getDB();
		
		try {
			String sql="insert into fruits values(5,'nellikai','100')";
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Query inserted successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
