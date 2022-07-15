package chapter9exercise6;

public class ToStringOverRide {
	
	public static void main(String[] args) {
		Book book1 = new Book("Example Title 1", 1999, "Ali Eljaouhari");
		PrintBook book2 = new PrintBook("Example Title 2", 2000, "Ali Eljaouhari", "Eljaouhari Publishing", 124321);
		AudioBook book3 = new AudioBook("Example Title 3", 1999, "Ali Eljaouhari", 9999);
		
		
		System.out.printf("%s%n", book1.toString());
		System.out.printf("%n%s%n", book2.toString());
		System.out.printf("%n%s", book3.toString());
	}
	

}
