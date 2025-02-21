package com.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRuntime {

	public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps=null;
        con=DBConnection.getDB();
        Scanner scan=new Scanner(System.in);
        int a ;
        String b,c;
        System.out.println("enter id");
        a=scan.nextInt();
        System.out.println("enter fruit name");
        b=scan.next();
        System.out.println("enter price");
        c=scan.next();
        try {
        	String sql="insert into fruits values("+a+",'"+b+"','"+c+"')";
        	ps=con.prepareStatement(sql);
        	ps.executeUpdate();
        	System.out.println("values inserted successfully");
        }catch(Exception e) {
        	System.out.println(e);
        }
	}

}
