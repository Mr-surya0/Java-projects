package com.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestCreateDB {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps=null;
		con=DBConnection.getDB();
		
		try {
			String sql="create database apple";
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Successfully database created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
