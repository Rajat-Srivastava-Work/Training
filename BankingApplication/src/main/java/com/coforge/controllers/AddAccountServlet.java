package com.coforge.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.coforge.DAO.AccountDAO;
import com.coforge.models.Account;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AddAccountServlet
 */
@WebServlet("/AddAccountServlet")
public class AddAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDAO dao=new AccountDAO();

    /**
     * Default constructor. 
     */
    public AddAccountServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		out.println("<html><body><form action=AddAccountServlet method=post>");
		out.println("<label>Account Number:</label><input type=text name=anumber><br>");
		out.println("<label>Account Holder Name:</label><input type=text name=aname><br>");
		out.println("<label>Account Type:</label><input type=text name=atype><br>");
		out.println("<label>Balance:</label><input type=text name=abal><br>");
		out.println("<button type=submit>Save Employee</button></form>");
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		Connection conn=(Connection) context.getAttribute("connection");
		int anumber= Integer.parseInt(request.getParameter("anumber"));
		String aname = request.getParameter("aname");
		String atype = request.getParameter("atype");
		double abal = Double.parseDouble(request.getParameter("abal"));
		
		Account acc = new Account();
		acc.setAccNo(anumber);
		acc.setAccHolderName(aname);
		acc.setAccType(atype);
		acc.setBalance(abal);
				//		Account account = new Account();
		System.out.println("DAO called");
		Account acc1=dao.addAccount(conn, acc);
		if(acc1!=null)
			response.sendRedirect("ViewAccountsServlet");
		
	}

}
