package com.coforge.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import com.coforge.DAO.AccountDAO;
import com.coforge.models.Account;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDAO dao=new AccountDAO();


    /**
     * Default constructor. 
     */
    public WithdrawServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<form action=WithdrawServlet method=post>");
		out.println("<label>Enter Account Number:</label><input type=text name=accnum>");
		out.println("<label>Enter Amount to Withdraw:</label><input type=text name=withdraw>");
		out.println("<button type=submit>Withdraw</button>");
		out.println("</form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		Connection conn=(Connection) context.getAttribute("connection");
		int accnum=Integer.parseInt(request.getParameter("accnum"));
		double withdraw=Double.parseDouble(request.getParameter("withdraw"));
		Account acc=new Account();
		acc.setAccNo(accnum);
		acc.setBalance(withdraw);
		System.out.println("Withdraw DAO called");
		dao.withdrawAmount(conn,acc);
	}

}
