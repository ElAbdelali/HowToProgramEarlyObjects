package chapter8;

public enum Food {
	
	APPLE("Fruit", 95),
	BANANA("Fruit", 105),
	CARROT("Vegetable", 25);

	private final String fruitOrVege;
	private final int calories;

	Food(String fruitOrVege, int calories) {
		this.fruitOrVege = fruitOrVege;
		this.calories = calories;
	}
	
	public String getFruitOrVege() {
		return fruitOrVege;
	}

	public int getCalories() {
		return calories;
	}
}

