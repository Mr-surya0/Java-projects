package com.jdbcMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DbFilter {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the space separated values");
    	String q=scan.nextLine();
    	String[] values=q.split(" ");
        List<String> data =new ArrayList<>(Arrays.asList(values));

        List<String> filteredData = data.stream()
                .filter(s -> s.startsWith("a")) 
                .toList();

        try  {
            String sql = "INSERT INTO data VALUES (?)";
            Connection con=null;
            con=DBConnection.getDB();
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                for (String value : filteredData) {
                    statement.setString(1, value);
                    statement.executeUpdate();
                }
            }
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
