package chapter8;

public class FoodTest {
	public static void main(String[] args) {
		System.out.printf("%-10s%20s%10s%n", "All Fruits:", "Fruit or Vegetable?", "Calories");
		
		for(Food food: Food.values()) {
			System.out.printf("%-10s%10s%20s%n", 
					food, 
					food.getFruitOrVege(), 
					food.getCalories());
		}
	}

}
