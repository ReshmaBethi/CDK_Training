package com.book;

public class Book {
	private long isbn;
	private String name;
	private double price;
	private String publication;
	private String author;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(long isbn,String name,double price) {
		// TODO Auto-generated constructor stub
		this.isbn=isbn;
		this.name=name;
		this.price=price;
	}
	public Book(long isbn,String name,String publication,String author) {
		// TODO Auto-generated constructor stub
		this.isbn=isbn;
		this.name=name;
		this.publication=publication;
		this.author=author;
	}
	public Book(long isbn,String name,double price,String publication,String author) {
		// TODO Auto-generated constructor stub
		this.isbn=isbn;
		this.name=name;
		this.price=price;
		this.publication=publication;
		this.author=author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.isbn+"\t"+this.name+"\t"+this.price;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj)
		{
			return true;
		}
		if(obj==null)
		{
			return false;
		}
		Book b=(Book)obj;
		if(name==null){
			if(b.name!=null){
				return false;
			}
		}else if(name.equals(b.name)){
			return true;
		}
		return true;
		
	}

}
