package com.preeti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int ck = 0;
		//for request dispatcher
		//int k= (int)	req.getAttribute("squarek");
		//out.println("Addition is :"+kk+ " "+ "Square is:" +kk);
		
		/*//for sendredirect
		int kk= (int)	Integer.parseInt(req.getParameter("k"));
		kk=kk*kk;
		PrintWriter out=res.getWriter();
		out.println( "Square is:" +kk);*/
		
		//tried for two values passed from req
		/*int ii= (int)	req.getAttribute("squarei");
		int jj= (int)	req.getAttribute("squarej");
		int kk=ii+jj;
		int kkk=kk*kk;
		PrintWriter out=res.getWriter();
		out.println("Addition is :"+kk+ " "+ "Square is:" +kkk);*/
		
		/*//using session
		HttpSession session=req.getSession();
		int k= (int) session.getAttribute("k");
		k=k*k;
		System.out.println("k:"+k);
		PrintWriter out=res.getWriter();
		out.println( "Square is:" +k);*/
		
		//using cookies
		Cookie cookies[]=req.getCookies();
		for(Cookie c: cookies) {
			
			if(c.getName().equals("k")) {
				
				ck=Integer.parseInt(c.getValue());
				
			}
			
		}
		ck=ck*ck;
		PrintWriter out=res.getWriter();
		out.println( "Square is:" +ck);
	}

}
