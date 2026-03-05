package com.coforge.Day7Prj;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname="root";
        String password="Cfg@1234";
        String url="jdbc:mysql://localhost:3306/cfgdb";
        
        Connection con = DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");
        
        /* String query2 = "insert into student_table values (?, ?, ?, ?, ?)";
        PreparedStatement ps1 = con.prepareStatement(query2);
        ps.setInt(1, 472);
        ps.setString(2, "Nayan");
        ps.setDouble(3, 97);
        ps.setString(4, "8291426367");
        ps.setDate(5, Date.valueOf("2026-08-26"));
        ps.executeUpdate();
        System.out.println("row inserted"); */
        
        /* String query3 = "update student_table set marks=? where stdid=?";
        PreparedStatement ps = con.prepareStatement(query3);
        ps.setDouble(1,95);
        ps.setInt(2, 748);
        ps.executeUpdate();
        System.out.println("row updated");
        */
        
        //Delete code
        String query4 = "delete from student_table where stdid=?";
        PreparedStatement ps =con.prepareStatement(query4);
        ps.setInt(1,749);
        ps.execute();
        System.out.println("row deleted");
        System.out.println();
        
        Statement st = con.createStatement();
        String query = "select * from student_table";
        ResultSet rs = st.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();
        for(int i=1;i<=count;i++) {
        	System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));
        }
        
        System.out.println();
        
        while(rs.next()) {
        	System.out.println("Student ID: " + rs.getInt("stdid"));
        	System.out.println("Student Name: " + rs.getString("stdname"));
        	System.out.println("Student Marks: " + rs.getDouble("marks"));
        	System.out.println("Mobile No.: " + rs.getString("mobile_no"));
        	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }
    }

}
