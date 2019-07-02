package com.preeti.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.preeti.model.User;

public class UserDAO {
	
	public User getUser(int id) {
		User user=new User();
		
		try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapi", "preeti", "minshi");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from Book where id="+id);
	System.out.println(rs.toString());
	if(rs.next())
	{
		user.setAuthor(rs.getString("author"));
		user.setTitle(rs.getString("title"));
		user.setId(rs.getInt(id));
	}
		}
		catch(Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return user;
	}

}
