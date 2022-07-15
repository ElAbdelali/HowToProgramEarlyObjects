package chapter3;

public class ClockTest {
	
	
	public static void main(String[] args) {
		Clock newClock = new Clock(24, 3, 60);
		
		System.out.print("The time is: ");
		newClock.setHour(newClock.getHour());
		newClock.setMinute(newClock.getMinute());
		newClock.setSecond(newClock.getSecond());
		
	}

}
