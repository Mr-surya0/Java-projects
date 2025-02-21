package com.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps=null;
		
		con=DBConnection.getDB();
		try {
			String sq1="select * from fruits";
			ps=con.prepareStatement(sq1);
		ResultSet query=ps.executeQuery();
		System.out.println("id:\tname:\tprice:");
	     while(query.next()) {
	    	 int id = query.getInt("fid");
	    	 String name=query.getString("fname");
	    	 String price=query.getString("fprice");
	    	 System.out.println(id+"\t"+name+"\t"+price);
	     }
				
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
