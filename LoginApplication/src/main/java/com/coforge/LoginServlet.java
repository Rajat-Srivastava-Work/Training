package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    //PrintWriter out=response.getWriter();
	    String uname=request.getParameter("uname");
	    String pwd=request.getParameter("pwd");
	    RequestDispatcher rd=null;
	    /* if(uname.equals("Rajat") && pwd.equals("rajat123")) {
	    	request.setAttribute("uname", uname);
	    	rd=request.getRequestDispatcher("/welcome.jsp");
	    	rd.forward(request, response);
	    }
	    else {
	    	rd=request.getRequestDispatcher("/error.jsp");
	    	rd.forward(request, response);
	    }
	    out.close();*/
	    
	    User loggedInUser = null;
	    
	    for(User u:UserDB.userSet) {
	    	if(u.getUsername().equals(uname) && u.getPassword().equals(pwd)) {
	    		loggedInUser = u;
	    		break;
	    	}
	    }
	    
	    if(loggedInUser != null) {
	    	request.setAttribute("user", loggedInUser);
	    	rd=request.getRequestDispatcher("/welcome.jsp");
	    } else {
	    	rd=request.getRequestDispatcher("/error.jsp");
	    }
	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
