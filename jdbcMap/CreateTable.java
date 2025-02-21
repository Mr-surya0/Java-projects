package com.jdbcMap;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTable {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		con=DBConnection.getDB();
		
	
		try {
			String sql="create table data(name varchar(30))";
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Successfully table created");
		}catch(Exception e) {
			System.out.println(e);
		}
			}

		}
