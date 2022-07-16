package chapter9exercise8;

public class Loan {
	
	protected double principal;
	protected int tenure;
	
	public Loan(double principal, int tenure) {
		
		this.principal = principal;
		this.tenure = tenure;
		
	}
	
	public double getPrincipal() {
		return principal;
	}

	public int getTenure() {
		return tenure;
	}
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
}
