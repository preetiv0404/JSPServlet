package com.preeti.model;

public class User {
	
	private int id;
	private String author;
	private String title;
	@Override
	public String toString() {
		return "User [id=" + id + ", author=" + author + ", title=" + title + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
