
public class BookStore {
	public Book[] getBooks(){
		Book books[]=new Book[3];
		books[0]=new Book(111,"Raja","ABC",888);
		books[1]=new Book(222,"Ranga","XYZ",999);
		books[2]=new Book(333,"Ramu","PQR",777);
		return books;
	}
	public Book findBookById(Book []books,long isbn){
		Book book=null;
		for(Book book1:books){
			if(book1.getIsbn()==isbn){
				book=book1;
				break;
			}
		}
		return book;
	}
	public Book updateBook(long isbn,double price,Book []books){
		Book book1 = null;
		for(Book book:books){
			if(book.getIsbn()==isbn){
				book.setPrice(price);
				book1=book;
				break;
			}
		}
		return book1;
	}
}
