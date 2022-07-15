package chapter9exercise3;

public class CompositionBaseEmployeePlusCommissionTest {

	public static void main(String[] args) {
		BasePlusCommissionEmployeeComposition employee =
				new BasePlusCommissionEmployeeComposition("Ali", "Eljaouhari", "333-33-3333", 10000.00, .2, 300.00);
		
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("%s %s%n", "First name is", employee.getCommissionEmployee().getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee.getCommissionEmployee().getLastName());
		System.out.printf("%s %s%n", "Social security number is",
				employee.getCommissionEmployee().getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", employee.getCommissionEmployee().getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionEmployee().getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());
		
		employee.setBaseSalary(2000);
		
		System.out.printf("%n%s:%n%n%s%n%s%.2f%n", "Updated employee information obtained by toString", employee.toString(), "Earnings: ", employee.earnings());	}

}
