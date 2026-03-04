package com.coforge.Day7Prj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        
        Statement st = con.createStatement();
        String query = "select * from student_table";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()) {
        	System.out.println("Student ID: " + rs.getInt(1));
        	System.out.println("Student Name: " + rs.getString(2));
        	System.out.println("Student Marks: " + rs.getDouble(3));
        	System.out.println("Mobile No.: " + rs.getString(4));
        	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
