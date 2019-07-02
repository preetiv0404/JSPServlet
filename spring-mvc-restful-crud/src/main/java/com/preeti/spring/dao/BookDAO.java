package com.preeti.spring.dao;

import java.util.List;

import com.preeti.spring.model.Book;

public interface BookDAO {
	
	//save the record
	long save(Book book);
	
	//get a single record
	Book get(long id);
	
	//get all records
	List<Book> listBooks();
	
	//update a reord
	 void update(long id, Book book);
	 
	 //delete a record
	 void delete(long id);

}
