package chapter9exercise6;

public class PrintBook extends Book {
	private String publisher;
	private int isbn;

	public PrintBook(String title, int publicationYear, String author, String publisher, int isbn) {
		super(title, publicationYear, author);
		
		this.isbn = isbn;
		this.publisher = publisher;

	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getIsbn() {
		return isbn;
	}
	@Override
	public String toString() {
		return String.format("%s%n%s%s%n%s%d", super.toString(), "Publisher: ", getPublisher(), "ISBN: ", getIsbn());
	}
	
}
