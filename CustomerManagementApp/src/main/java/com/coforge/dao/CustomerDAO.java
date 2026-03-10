package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.coforge.entities.Customer;
import com.coforge.utils.DBUtil;

public class CustomerDAO {
	public static List<Customer> getAllCustomers() {
		List<Customer> custList=new ArrayList<Customer>();
		
		String query="select * from customers";
		try {
			Connection conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(query);
		
		
			while(rs.next()) {
				Customer customer=new Customer();
				customer.setCustId(rs.getLong("custId"));
				customer.setCustName(rs.getString("custName"));
				customer.setAddress(rs.getString("address"));
				customer.setEmail(rs.getString("email"));
				customer.setMobile(rs.getString("mobile"));
				custList.add(customer);
			}
			return custList;
		} catch(ClassNotFoundException | SQLException e) {
			System.err.println(e);
			e.printStackTrace();
			
			return null;
		}
	}
	
	public static String addCustomer(Customer customer) {
		Connection conn;
		String query="insert into customers values (?,?,?,?,?)";
		PreparedStatement ps=null;
		try {
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(query);
			ps.setLong(1, customer.getCustId());
			ps.setString(2, customer.getCustName());
			ps.setString(3, customer.getAddress());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getMobile());
			ps.executeUpdate();
			return "customer added successfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error";
		}
		
		
		
	}
	
	public static Customer getCustomerById(long custId) {
		return null;
	}

}
