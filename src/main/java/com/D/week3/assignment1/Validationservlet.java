package com.D.week3.assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Date: 31.01.2022
 * Group D 
 * Member1: Manpreet kaur
 * Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel
 * Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal 
 */
@WebServlet("/Validationservlet")
public class Validationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * In this Assignment, the login page navigates to the Validationservlet where the login id and password is validated and then it is 
     * forwarded to the Responseservlet where we have used session, cookies 
     * and RequestDispatcher and then it goes to Calculationservlet where the average, grades,
     * minimum and maximum is calculated and the final result is then displayed on final.jsp 
     */
    public Validationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * This validates the id and password for the login page
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter(); 
	    
	    String n1 = request.getParameter("userName");
		//out.print("Welcome " + n1);
		
	    String n=request.getParameter("username");  
	    String p=request.getParameter("password");
	    
	    
	    if(n.equals("admin") && p.equals("123")) // admin is the username and 123 is the password required to login!
	    		
	    		{  
	        RequestDispatcher rd=request.getRequestDispatcher("Responseservlet");  
			HttpSession session = request.getSession();
			session.setAttribute("uname", n);
			rd.forward(request, response); 
	        
	    }  
	    else{  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");  
	        rd.include(request, response);   
	}

	}

}
