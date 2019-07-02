package com.preeti.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preeti.spring.model.Book;

@Repository
public class BookDaoImpl implements BookDAO {

	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public long save(Book book) {
		sessionfactory.getCurrentSession().save(book);
		return book.getId();
	}

	@Override
	public Book get(long id) {
		return sessionfactory.getCurrentSession().get(Book.class, id);
		
	}

	@Override
	public List<Book> listBooks() {
		List<Book> list=sessionfactory.getCurrentSession().createQuery("from Book").list();
		return list;
	}

	@Override
	public void update(long id, Book book) {
		Session session=sessionfactory.getCurrentSession();
		Book oldBook=session.byId(Book.class).load(id);
		oldBook.setAuthor(book.getAuthor());
		oldBook.setTitle(book.getTitle());
		session.flush();
	}

	@Override
	public void delete(long id) {
		Session session=sessionfactory.getCurrentSession();
		Book book=session.byId(Book.class).load(id);
		session.delete(book);

	}

}
