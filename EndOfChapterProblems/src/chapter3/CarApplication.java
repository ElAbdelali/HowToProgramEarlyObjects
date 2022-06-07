package chapter3;
public class CarApplication {

	public static void main(String[] args) {
		// creating instance variables to be used in the method
		double discountPrice1;
		double discountPrice2;
		// creating car objects 
		Car car1 = new Car("Toyota Camry", "2015", 15963.23);
		Car car2 = new Car("BMW M2", "2021", 60000.60);
		// outputting the model, year, and price of the car using getters from the Car class
		System.out.printf("The %s built in %s is worth: %7.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
		System.out.printf("The %s built in %s is worth: %7.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());
		// initializing the values for discountprice1 and 2 
		discountPrice1 = car1.getPrice() - (car1.getPrice() * 1.05);
		discountPrice2 = car2.getPrice() - (car2.getPrice() * .07);

		// outputting the values after the discount
		System.out.printf("%nThe %s built in %s is now worth: %7.2f%n", car1.getModel(), car1.getYear(), discountPrice1);
		System.out.printf("The %s built in %s is now worth: %7.2f%n", car2.getModel(), car2.getYear(), discountPrice2);
		
		
	}

}
