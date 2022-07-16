package chapter9exercise14;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String fName, String lName, String social, double grossSales,
			double commissionRate, double baseSalary) {
		super(fName, lName, social, grossSales, commissionRate);
		
		this.baseSalary = baseSalary;
		
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getEarnings() {
		return super.getEarnings() + getBaseSalary();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f%n%s: %.2f%n", super.toString(), "BaseSalary", getBaseSalary(), "Earnings", getEarnings());
	}

}
