package chapter4;

public class SalesCommission {
	private String name;
	private double itemOnePrice;
	private double itemTwoPrice;
	private double itemThreePrice;
	private double itemFourPrice;

	public SalesCommission(String name, double itemOnePrice, double itemTwoPrice, double itemThreePrice,
			double itemFourPrice) {
		this.name = name;
		this.itemOnePrice = itemOnePrice;
		this.itemTwoPrice = itemTwoPrice;
		this.itemThreePrice = itemThreePrice;
		this.itemFourPrice = itemFourPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getItemOnePrice() {
		return itemOnePrice;
	}

	public void setItemOnePrice(double itemOnePrice) {
		this.itemOnePrice = itemOnePrice;
	}

	public double getItemTwoPrice() {
		return itemTwoPrice;
	}

	public void setItemTwoPrice(double itemTwoPrice) {
		this.itemTwoPrice = itemTwoPrice;
	}

	public double getItemThreePrice() {
		return itemThreePrice;
	}

	public void setItemThreeSold(double itemThreePrice) {
		this.itemThreePrice = itemThreePrice;
	}

	public double getItemFourPrice() {
		return itemFourPrice;
	}

	public void setItemFourPrice(double itemFourPrice) {
		this.itemFourPrice = itemFourPrice;
	}
}
