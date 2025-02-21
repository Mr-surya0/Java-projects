package com.jdbcExample;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateDb {

	public static void main(String[] args) {
               Connection con=null;
               PreparedStatement ps=null;
               con =DBConnection.getDB();
              
               try {
            	   String sql="create database Datas";
            	   ps=con.prepareStatement(sql);
            	   ps.executeUpdate();
            	   System.out.println("DB created successfully");
               }catch(Exception e) {
            	   System.out.println(e);
         }           
	}
}
