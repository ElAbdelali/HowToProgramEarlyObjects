package chapter10exercise15;

public class PieceWorker extends Employee{
	
	private double wage;
	private int pieces;

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);
		if (wage < 0.0) {
			throw new IllegalArgumentException("Wage per piece needs to be >= 0.0.");
		}
		if (pieces < 0) {
			throw new IllegalArgumentException("Number of pieces must be >= 0.");
		}
		this.wage = wage;
		this.pieces = pieces;
	}

	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("Wage per piece needs to be >= 0.0.");
		}
		this.wage = wage;
	}
	
	public void setPieces(int pieces) {
		this.pieces = pieces;
		
	}
	public double getWage() {
		return wage;
	}
	public int getPieces() {
		return pieces;
	}
	
	@Override
	public double earnings() {
		return wage * pieces;
	}
	
	@Override
	public String toString() {
		return String.format("piece worker: %s%n%s: $%,.2f; %s: %d", super.toString(), "piece wage", getWage(),
				"number of pieces", getPieces());
	}

}
