package chapter9exercise6;

public class AudioBook extends Book{
	
	private int sizeMb;

	public AudioBook(String title, int publicationYear, String author, int sizeMb) {
		super(title, publicationYear, author);
		
		this.sizeMb = sizeMb;
	}

	public int getSizeMb() {
		return sizeMb;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%d", super.toString(), "Size of AudioBook: ", getSizeMb());
	}
}
