package com.bookstore;


import com.book.Book;

public interface BookStore {
	public abstract Book[] getBooks();
	public abstract Book findBookById(Book [] books,long id);
	public abstract Book findBookByName(Book []books,String name);
	public abstract Book updateBook(Book [] books,long id,double price);
	public abstract void displayBooks(Book[] books);
	

}
