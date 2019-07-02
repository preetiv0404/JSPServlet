package com.preeti.spring.service;

import java.util.List;

import com.preeti.spring.model.Book;

public interface BookService {

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
