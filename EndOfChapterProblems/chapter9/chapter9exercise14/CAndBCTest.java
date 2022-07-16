package chapter9exercise14;

public class CAndBCTest {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Ali", "Eljaouhari", "123-45-6789");
		CommissionEmployee commissionEmployee = new CommissionEmployee("Ali", "Eljaouhari", "123-45-6789", 9600.23, .2);
		BasePlusCommissionEmployee bPlusCEmployee = new BasePlusCommissionEmployee("Ali", "Eljaouhari", "123-45-6789", 9600.23, .2, 300.00);
		
		System.out.printf("%s%n", employee.toString());
		System.out.printf("%s%n%n", commissionEmployee.toString());
		System.out.printf("%s%n%n", bPlusCEmployee.toString());

	}

}
