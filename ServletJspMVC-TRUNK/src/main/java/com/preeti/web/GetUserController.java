package com.preeti.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.preeti.model.User;
import com.preeti.web.dao.UserDAO;

/**
 * Servlet implementation class GetUserController
 */
public class GetUserController extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id= Integer.parseInt(request.getParameter("uid"));
		UserDAO dao=new UserDAO();
		User user=dao.getUser(id);
		
		request.setAttribute("name", user);
		RequestDispatcher rd = request.getRequestDispatcher("showUser.jsp");
		rd.forward(request, response);
	}

	

}
