import java.util.Scanner;

import com.book.Book;
import com.bookstore.*;
import com.exception.BookNotFoundException;

public class TestBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book []books=new Book[5];
		long id;
		int op;
		String name;
		Book b=null;
		Scanner sc=new Scanner(System.in);
		try{
		do{
		System.out.println("Enter your option \n1.Add a Book\t 2.Find Book by id\t3.Find Book by Name \t 4.update Book\t5.Display\t 6.exit\n");
		op=sc.nextInt();
		BookStoreImpl bs=new BookStoreImpl();
		switch(op){
		case 1:
			books=bs.getBooks();
			break;
		case 2:
			System.out.println("Enter book id : ");
			id=sc.nextLong();
			//System.out.println((bs.findBookById(books, id).equals(null)));
			if(bs.findBookById(books, id)==(null)){
					throw new BookNotFoundException("Book not found By name");
			}
			else{
				System.out.println("Book Found");
			}
			break;
		case 3:
			System.out.println("Enter book name : ");
			name=sc.next();
			b=bs.findBookByName(books, name);
			if(b==null){
					throw new BookNotFoundException("Book Not found by name!!");
			}
			else{
				System.out.println("Book Found");
			}
			break;
		case 4:
			//update
			System.out.println("Enter book id and price");
			b=bs.updateBook(books, sc.nextLong(), sc.nextDouble());
			if(b==null){
					throw new BookNotFoundException("Book not found for updating");
			}
			else{
				System.out.println("Book updated successfully!!");
			}
			break;
		case 5:
			bs.displayBooks(books);
			break;
		case 6:
			System.out.println("You are successfully exited!!");
			System.exit(0);
		default:
			System.out.println("Please choose correct option");
		}
		}while(true);
		}catch(BookNotFoundException e){
			e.displayMessage();
		}
		
	}
}
