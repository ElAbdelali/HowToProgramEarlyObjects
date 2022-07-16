package chapter9exercise8;

public class PersonalLoan extends Loan{

	private double personalInterest = .073;
	public PersonalLoan(double principal, int tenure) {
		super(principal, tenure);
				}
	
	public double getPersonalInterest() {
		return personalInterest;
	}
	

}
