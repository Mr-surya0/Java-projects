package com.jdbcMap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DbMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String value;
		System.out.println("Enter the names separated by spaces: ");
		value = s.nextLine();
		String[] v = value.split(" ");
		List<String> names = new ArrayList<>(Arrays.asList(v));
        List<String>  nama=names.stream().map(String::new).map(o->o.toUpperCase())
        		.collect(Collectors.toList());
		try (Connection con = DBConnection.getDB();
				PreparedStatement st = con.prepareStatement("insert into data values(?)")) {
        
			nama.stream().forEach(name -> {
				try {
					st.setString(1, name);
					st.executeUpdate();
				} catch (SQLException e) {
				System.out.println(e);
				}
			});

			System.out.println("Data inserted successfully.");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
