package com.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class selectRuntime {

	public static void main(String[] args) {
       Connection con=null;
       PreparedStatement ps=null;
       con=DBConnection.getDB();
       Scanner scan=new Scanner(System.in);
       System.out.println("enter id");
       int a=scan.nextInt();
       try {
    	   String sql ="select * from fruits where fid  ="+a+"";
    	   ps=con.prepareStatement(sql);
    	   ResultSet r=ps.executeQuery();
    	   while(r.next()) {
    		   int i=r.getInt("fid");
    		   String s=r.getString("fname");
    		   String s1=r.getString("fprice");
    		   System.out.println(i+"\t"+s+"\t"+s1);
    				  
    	   }
    	   
       }
       catch(Exception e) {
    	   System.out.println(e);
       }
	}

}
