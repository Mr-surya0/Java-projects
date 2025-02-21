package com.jdbcExample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestWhereClause {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		con=DBConnection.getDB();
		try {
			st=con.createStatement();
			String sql="select * from students where studid in (101 , 103) and stuname='surya'";
			ResultSet query = st.executeQuery(sql);
			System.out.println("id\tname\tmail");
			while(query.next()) {
				int id = query.getInt("studid");
				String name=query.getString("stuname");
				String email=query.getString("stumail");

				System.out.println(id+"\t"+name+"\t"+email);
			}
		}catch(Exception e) {System.out.println(e);}
	}

}
