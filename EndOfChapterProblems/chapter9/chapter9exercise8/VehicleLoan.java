package chapter9exercise8;

public class VehicleLoan extends Loan{
	
	private double vehicleInterest = .042;

	public VehicleLoan(double principal, int tenure) {
		super(principal, tenure);
		}
	
	public double getVehicleInterest() {
		return vehicleInterest;
	}

	
	

}
