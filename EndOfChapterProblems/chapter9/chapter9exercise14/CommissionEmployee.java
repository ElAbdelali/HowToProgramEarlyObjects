package chapter9exercise14;

public class CommissionEmployee extends Employee{

	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String fName, String lName, String social, double grossSales, double commissionRate) {
		super(fName, lName, social);
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public double getEarnings() {
		return grossSales * commissionRate;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
				super.toString(), "Gross Sales", getGrossSales(), "Commission Rate", getCommissionRate(), "Earnings", getEarnings());
	}

}
