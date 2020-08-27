package com.bookstore;

import java.util.Scanner;

import com.book.Book;

public class BookStoreImpl implements BookStore{
	Book[] books=new Book[5];
	Scanner sc=new Scanner(System.in);
	static int count=0;
	public Book[] getBooks(){
		
		/*for(int i=0;i<5;i++){
			Book book=new Book();
			System.out.println("Enter the Book id : ");
			book.setIsbn(sc.nextLong());
			System.out.println("Enter the Book name : ");
			book.setName(sc.next());
			System.out.println("Enter the Book price : ");
			book.setPrice(sc.nextDouble());
		}*/
		
		
		
		
		long id;
		String name;
		double price;
		System.out.println("Enter the Book id : ");
		id=sc.nextLong();
		System.out.println("Enter the Book name : ");
		name=sc.next();
		System.out.println("Enter the Book price : ");
		price=sc.nextDouble();
		books[count]=new Book(id,name,price);
		count++;
		System.out.println("Book added successfully!!");
		return books;
	}

	@Override
	public Book findBookById(Book[] books, long id) {
		// TODO Auto-generated method stub
		for(Book book1:books){
			try{
			if(id==(book1.getIsbn())){
				return book1;
			}
			}catch(NullPointerException e){
				
			}
		}
		return null;
	}


	@Override
	public Book findBookByName(Book[] books, String name) {
		// TODO Auto-generated method stub
		for(Book book1:books){
			try{
			if(name.equals(book1.getName())){
				return book1;
			}
			}catch(NullPointerException e){
				
			}
		}
		return null;
	}

	@Override
	public Book updateBook(Book[] books, long id, double price) {
		// TODO Auto-generated method stub
		for(Book book:books){
			try{
			if(book.getIsbn()==id){
				book.setPrice(price);
				return book;
			}
			}catch(NullPointerException e){
				
			}
		}
		return null;
	}

	@Override
	public void displayBooks(Book[] books) {
		// TODO Auto-generated method stub
		for(int i=0;i<books.length;i++){
			//System.out.println(books.length);
			try{
				System.out.println(books[i].toString());
			}catch(NullPointerException e){
				
			}
		}
	}
	
}
