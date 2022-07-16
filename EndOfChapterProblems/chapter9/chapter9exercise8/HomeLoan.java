package chapter9exercise8;

public class HomeLoan extends Loan{
	
	private double homeInterest = .06;
	
	public HomeLoan(double principal, int tenure) {
		super(principal, tenure);
	}
	
	public double getHomeInterest() {
		return homeInterest;
	}
	

	
	

}
