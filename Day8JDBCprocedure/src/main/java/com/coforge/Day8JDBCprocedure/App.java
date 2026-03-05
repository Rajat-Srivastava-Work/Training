package com.coforge.Day8JDBCprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	System.out.println("Driver loaded");
    	String uname = "root";
    	String password = "Cfg@1234";
    	String url = "jdbc:mysql://localhost:3306/cfgdb";
    	
    	Connection conn = DriverManager.getConnection(url,uname,password);
    	System.out.println("Connection Established");
    	String query = "{call get_all_students()}";
    	CallableStatement cs = conn.prepareCall(query);
    	ResultSet rs = cs.executeQuery();
    	System.out.println("Student data");
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    	ResultSetMetaData rsmd = rs.getMetaData();
    	int count=rsmd.getColumnCount();
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
