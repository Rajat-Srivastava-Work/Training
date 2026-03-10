package com.coforge.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.coforge.dao.CustomerDAO;
import com.coforge.entities.Customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerController() {
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		if(action.equals("select")) {
			List<Customer> customers = getAllCustomers();
			if(customers==null) {
				return;
			}
			out.println(customers);
		} else if(action.equals("insert")) {
			String customers=addCustomer();
			if(customers==null) {
				out.println("Failed to add customer");
				return;
			}
			out.println(customers);			
		} 
		else {
			out.println("no data found");
		} 
	}
	
	private List<Customer> getAllCustomers() {
		List<Customer> custList = CustomerDAO.getAllCustomers();
		custList.forEach(e->System.out.println(e));
		
		return custList;
		
	}
	
	private String addCustomer() {
		String customer = CustomerDAO.addCustomer(new Customer(122,"Gaurav","Hyderabad","gaurav@example.com","8912345420"));
		return customer;
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
