package com.jdbcExample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelectRecord {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		con=DBConnection.getDB();
		try {
			st=con.createStatement();
	String sql="select *from students";
	ResultSet query = st.executeQuery(sql);
	while(query.next()) {
		int id = query.getInt("studid");
		String name = query.getString("stuname");
		String mail = query.getString("stumail");
		System.out.println(id+":\t"+name+":\t"+mail);
	}
		}catch(Exception e) {System.out.println(e);}
	}

}
