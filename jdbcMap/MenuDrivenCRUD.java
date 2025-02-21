package com.jdbcMap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MenuDrivenCRUD {

	public static void main(String[] args) {
		 while(true) {
          Scanner s=new Scanner(System.in);
          System.out.println("\nEnter 1 to insert data");         
          System.out.println("Enter 2 to display data");
          System.out.println("Enter 3 to Search data");
          System.out.println("Enter 4 to drop table");
          System.out.println("Enter 5 to exit\n");
          
          
          int i=s.nextInt();
          Connection con= DBConnection.getDB();
          PreparedStatement ps=null;
          
         
          switch(i) {
                          
          case 1:
        	  System.out.println("Enter the value to insert in db");
        	  String a=s.next();
        	  try {
        	  String sql="insert into data values('"+a+"')";
        	  ps=con.prepareStatement(sql);
        	  ps.executeUpdate();
        	  System.out.println("Inserted successfully\n");
        	  }catch(Exception e) {
        		  System.out.println(e);
        	  }
        	break;  
          case 2:
        	  try {
        		  String sql="select * from data";
        		  ps=con.prepareStatement(sql);
        		  ResultSet r= ps.executeQuery();
        		  System.out.println("Names:");
        		while(r.next()) {
        			String name=r.getString("name");
        			System.out.println(name);
        		}  
        	  }catch(Exception e) {
        		  System.out.println(e);
        	  }
        	  break;
          case 3:
        	  try {
        		  System.out.println("Enter the value to search");
        		  String z=s.next();
        		  String sql="select * from data where name='"+z+"'";
        		  ps=con.prepareStatement(sql);
        		  ResultSet r= ps.executeQuery();
        		  System.out.println("Names:");
        		while(r.next()) {
        			String name=r.getString("name");
        			System.out.println(name);
        		}  
        	  }catch(Exception e) {
        		  System.out.println(e);
        	  }
        	  break;
          case 4:
        	  String sql="drop table data";
        	  try {
        	  ps=con.prepareStatement(sql);
        	  ps.executeUpdate();
        	  System.out.println("Table dropped successfully\n");
        	  }catch(Exception e) {
        		  System.out.println(e);
        	  }
        	  break;
          case 5:
        	  System.exit(0);
        default :
        	System.out.println("Enter valid choice");
          }
       }
	}
}
