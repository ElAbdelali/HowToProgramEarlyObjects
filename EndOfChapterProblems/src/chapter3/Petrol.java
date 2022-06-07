package chapter3;

public class Petrol {

	public static void main(String[] args) {

		PetrolPurchase purchase1 = new PetrolPurchase("Dallas", "Diesel", 30, 3.23, .12);
		PetrolPurchase purchase2 = new PetrolPurchase("Dallas", "Diesel", 40, 3.23, .12);
		
		System.out.printf("Location: %s %nPetrol: %s %nQuantity: %d %nPrice: %.2f %nDiscount: %.2f%n%n",
				purchase1.getLocation(), purchase1.getPetrol(), purchase1.getQuantity(), purchase1.getPrice(), purchase1.getDiscount());
		System.out.printf("Location: %s %nPetrol: %s %nQuantity: %d %nPrice: %.2f %nDiscount: %.2f",
				purchase2.getLocation(), purchase2.getPetrol(), purchase2.getQuantity(), purchase2.getPrice(), purchase2.getDiscount());
		
		System.out.printf("%n%nThe net amount paid in the first purchase is: $%.2f", 
				purchase1.getNetPurchaseAmount());
		System.out.printf("%nThe net amount paid in the second purchase is: $%.2f", 
				purchase2.getNetPurchaseAmount());

	}

}
