package com.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
       Connection con=null;
       PreparedStatement ps=null;
       con=DBConnection.getDB();
       try {
    	   String sql="delete from fruits where fid=1";
    	   ps=con.prepareStatement(sql);
    	   ps.executeUpdate();
    	   System.out.println("deleted successfully");
    	   }catch(Exception e) {
    	   System.out.println(e);
       }
	}

}
