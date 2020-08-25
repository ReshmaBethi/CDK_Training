
public class Book {
	private long isbn;
	private String name;
	private double price;
	private String publication;
	private String author;
	public Book(){
		
	}
	public Book(long isbn,String name,double price){
		this.isbn=isbn;
		this.name=name;
		this.price=price;
	}
	public Book(long isbn,String name,String publication,double price){
		this.isbn=isbn;
		this.name=name;
		this.publication=publication;
		this.price=price;
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
	public void display(Book book){
		System.out.println("ISBN :"+book.getIsbn()+"\tName :"+book.getName()+"\tPrice :"+book.getPrice()+"\tPublication :"+book.getPublication());
	}
}
