package chapter9exercise14;

public class Employee {
	
	private String fName;
	private String lName;
	private String social;
	
	public Employee(String fName, String lName, String social) {
		
		this.fName = fName;
		this.lName = lName;
		this.social = social;
	}
	
	public String getFName() {
		return fName;
	}
	public String getLName() {
		return lName;
	}
	public String getSocial() {
		return social;
	}
	
	public String toString() {
		return String.format("%s: %s%n%s: %s%n%s: %s%n", "First Name", getFName(), "Last Name", getLName(), "SSN", getSocial());
	}
}
