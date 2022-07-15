package chapter9exercise3;

public class BasePlusCommissionEmployeeComposition {
	
	private CommissionEmployee commissionEmployee;
	private double baseSalary;
	
	BasePlusCommissionEmployeeComposition(String fName, String lName, String socialSecurity, 
			double grossSales, double commissionRate, double baseSalary){
		
		commissionEmployee = new CommissionEmployee(fName, lName, socialSecurity, grossSales, commissionRate);
		
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.");
		}
		
		if (commissionRate <= 0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission Rate must be greater than 0 and less than 1.");
		}
		
		this.baseSalary = baseSalary;
	}
	
	public CommissionEmployee getCommissionEmployee() {
		return commissionEmployee;
	}
	
	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0.");
		}
		this.baseSalary = baseSalary;	
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public double earnings() {
		return getBaseSalary() + commissionEmployee.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "base-salaried", commissionEmployee, "base salary", getBaseSalary());
	}

}
