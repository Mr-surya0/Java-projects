package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class RuntimeInsert {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		con = DBConnection.getDB();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student id");
		int a = scan.nextInt();
		System.out.println("Enter student name");
		String b = scan.next();
		System.out.println("Enter student email");
		String c = scan.next();
		try {
			st = con.createStatement();
			String sql = "insert into students values(" + a + ",'" + b + "','" + c + "')";
			st.executeUpdate(sql);
			System.out.println("Query inserted sucessfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
