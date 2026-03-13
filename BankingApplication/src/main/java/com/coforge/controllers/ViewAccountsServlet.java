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
 * Servlet implementation class ViewAccountServlet
 */
@WebServlet("/ViewAccountsServlet")
public class ViewAccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDAO dao=new AccountDAO();

    /**
     * Default constructor. 
     */
    public ViewAccountsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		Connection conn=(Connection) context.getAttribute("connection");
		List<Account> accList=new ArrayList<Account>();
		accList=dao.getAllAccounts(conn);
		
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<form action='SearchAccountsServlet'>");
		out.println("<input type='text' name='query' placeholder='Please enter Account Number, Account Type, Account Holder Name to search' />");
		out.println("<button>Search</button>");
		out.println("</form>");
		out.println("<table border=3px>");
		out.println("<thead><tr><th>Account Number</th><th>Account Holder Name</th><th>Account Type</th><th>Balance</th><th> Actions</th> </tr></thead>");
		out.println("<tbody><tr>");
		for(Account acc:accList) {
			out.println("<td>"+acc.getAccNo()+"</td>");
			out.println("<td>"+acc.getAccHolderName()+"</td>");
			out.println("<td>"+acc.getAccType()+"</td>");
			out.println("<td>"+acc.getBalance()+"</td>");
			out.println("<td><a href='DeleteAccountServlet?accNo="+acc.getAccNo()+"'>Delete</a></td> </tr>");
		}
		out.println("</tbody></table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
