package chapterExamples;

public class Car {
	private String model;
	private String year;
	private double price;
	
	public Car(String model, String year, double price) {
		this.model = model;
		this.year = year;
		if(price > 0) {
			this.price = price;
		}
		else {
			System.out.println("The price of the car cannot be a negative amount.");
		}
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getYear() {
		return year;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	

}