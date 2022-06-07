package chapter3;

public class PetrolPurchase {
	
	// initializing Instance Variables with specified types
	private String location;
	private String petrol;
	private int quantity;
	private double price;
	private double discount;
	private double netPurchaseAmount;
	
	// Constructor object initializing the five instance variables
	public PetrolPurchase(String location, String petrol, int quantity, double price, double discount) {
		this.location = location;
		this.petrol = petrol;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setPetrol(String petrol) {
		this.petrol = petrol;
	}
	public String getPetrol() {
		return petrol;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getDiscount() {
		return discount;
	}

	public void setNetPurchaseAmount(double netPurchaseAmount) {
		this.netPurchaseAmount = netPurchaseAmount;
	}
	public double getNetPurchaseAmount() {
		return netPurchaseAmount = ((double) (price - (price * discount)) * quantity);
	}
	
}
