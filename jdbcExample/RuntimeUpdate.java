package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class RuntimeUpdate {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		con = DBConnection.getDB();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student id to change name");
		int a = scan.nextInt();
		System.out.println("Enter the name to update");
		String b = scan.next();
		System.out.println("Enter the email to update");
		String c = scan.next();
		try {
			st = con.createStatement();
			String sql = "update students set stuname='" + b + "',stumail='" + c + "' where studid=" + a + "";
			st.executeUpdate(sql);
			System.out.println("Query updated successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
