package com.groupD.week3.assignment1;

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
 * In this servlet session, cookie and ReuestDispatcher is used
 */
@WebServlet("/Responseservlet")
public class Responseservlet extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public Responseservlet() {
super();
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
*      response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub

}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
*      response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub
response.setContentType("text/html");
try {
Cookie ck = new Cookie("userName", request.getParameter("username")); //creating cookie
response.addCookie(ck); // adding cookies in response

HttpSession session = request.getSession(false); // instance of session created
String n = (String) session.getAttribute("uname");
RequestDispatcher rd=request.getRequestDispatcher("calculation.jsp");  // Using RequestDispatcher, calling calculation.jsp
rd.forward(request, response);
} catch (Exception e) {
System.out.println(e);
}
System.out.println("This is a string" + request.getParameter("username"));

}

}
