package com.preeti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import sun.net.www.http.HttpCaptureOutputStream;

//using annotation instead of web.xml
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	/*public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("in service");
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.println(k);
	}*/
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("in do get ");
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		//below code is when only addition done not transfer to other servlet for square
	//	PrintWriter out=res.getWriter();
		//out.println("Addition is"+k);
		
		//1 One way using request dispatcher
		
		/* sending both the objects to servlet two
		req.setAttribute("squarei", i);
		req.setAttribute("squarej", j);
		RequestDispatcher rd=req.getRequestDispatcher("square");
		rd.forward(req, res);*/
		
	/*	//session management
		req.setAttribute("squarek", k);
		
		//reqdispatcher is interface hence we call it with req object 
		//and we are passing here the servlet to be called  i.e. square and we are sending data k with req object by setting attribute
		
		RequestDispatcher rd=req.getRequestDispatcher("square");
		rd.forward(req, res);*/
		
		/*//Second way using sendredirect
		//url rewriting
		res.sendRedirect("square?k="+k);*/
		
		/*//using session object
		
		HttpSession session= req.getSession();
		session.setAttribute("k",k);
		res.sendRedirect("square");*/
		
		//coookie is class so we can use new keyword here k shall be of string so appended with k+""
				Cookie cookie= new Cookie("k", k+"");
				System.out.println("cookie "+cookie);
				res.addCookie(cookie);
				res.sendRedirect("square");
	}
	

}
