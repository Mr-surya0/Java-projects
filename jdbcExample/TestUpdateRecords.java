package com.jdbcExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestUpdateRecords {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        con = DBConnection.getDB();
        try {
            st = con.createStatement();
            String sql = "UPDATE students SET stuname='palani', stumail='palani@gmail.com' WHERE studid=104";
            st.executeUpdate(sql);
            System.out.println("Updated successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
