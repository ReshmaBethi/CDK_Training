
public class BookStoreTest {

	public static void main(String[] args) {
		BookStore bookStore=new BookStore();
		Book []books=bookStore.getBooks();
		for(Book book:books){
			System.out.println("ISBN : "+book.getIsbn()+"\t Name :"+book.getName()+"\t Publication :"+book.getPublication()+"\tPrice :"+book.getPrice());
		}
		Book book=bookStore.findBookById(books, 111);
		System.out.println("");
		book.display(book);
		book=bookStore.updateBook(111, 998, books);
		book.display(book);
	}

}
