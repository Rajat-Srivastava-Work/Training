package com.coforge.Day7Prj;

import java.util.Scanner;
import java.sql.*;

public class MenuDrivenCRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname="root";
        String password="Cfg@1234";
        String url="jdbc:mysql://localhost:3306/cfgdb";

        Connection con = DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");
        
        Statement st = con.createStatement();
        String query = "select * from user_table";
        ResultSet rs = st.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();
        for(int i=1;i<=count;i++) {
        	System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));
        }
		
		
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1-insert");
			System.out.println("2-update");
			System.out.println("3-delete");
			System.out.println("4-exit");
			
			System.out.println("Enter yoir choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter Name: ");
	            String name = sc.next();
	            System.out.println("Enter Password: ");
	            String pss = sc.next();
	            System.out.println("Enter id: ");
	            int id4 = sc.nextInt();
	            String query2 = "insert into user_table values(?,?,?)";
	            PreparedStatement ps1 = con.prepareStatement(query2);
	            ps1.setString(1, name);
                ps1.setString(2, pss);
                ps1.setInt(3, id4);
                ps1.executeUpdate();
                System.out.println("row inserted");
                break;
			case 2:
				System.out.println("User ID: ");
				int id = sc.nextInt();
				System.out.println("Enter Password: ");
				String pswd = sc.next();
				String query3 = "update user_table set password = ? where userid=?";
				PreparedStatement ps2 = con.prepareStatement(query3);
				ps2.setString(1, pswd);
				ps2.setInt(2, id);
				ps2.executeUpdate();
				System.out.println("row updated");
                break;
			case 3:
				System.out.println("Enter user id: ");
				int id1= sc.nextInt();
				String query4 = "delete from user_table where userid=?";
				PreparedStatement ps3 = con.prepareStatement(query4);
				ps3.setInt(1,id1);
				ps3.execute();
				System.out.println("row deleted");
				break;
			case 4:
				System.out.println("exiting application");
			default:
				System.out.println("Invalid choice");
				
			}
		}while (choice!=4);
        
        while(rs.next()) {
        	System.out.println("Username: " + rs.getString("username"));
        	System.out.println("Password: " + rs.getString("password"));
        	System.out.println("User ID: " + rs.getInt("userid"));
        	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }
        
        System.out.println();
        
		sc.close();

	}

}
