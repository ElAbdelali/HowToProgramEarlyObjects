/*
(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
that your heart rate stays within a safe range suggested by your trainers and doctors. According to
the American Heart Association (AHA) (http://bit.ly/TargetHeartRates), 
			the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years. 
Your target heart rate is a range that’s 50–85% of your maximum heart rate. 
[Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and
gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] 

	Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes
for the month, day and year of birth). Your class should have a constructor that receives this data as
parameters. For each attribute provide set and get methods. The class also should include a method
that calculates and returns the person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that calculates and returns the 
person’s target heart rate.
Write a Java app that prompts for the person’s information, instantiates an object of class HeartRates and prints the information from that object—including the person’s first name, 
last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target heart-rate range.



*/

package chapterExamples;

public class HeartRates {
	
	private String fName;
	private String lName;
	private int birthDay;
	private int birthYear;
	private int birthMonth;
	
	
	public HeartRates(String fName, String lName, int birthMonth, int dayOfBirth, int birthYear) {
		setFirstName(fName);
		setLastName(lName);
		setDay(birthDay);
		setMonth(birthMonth);
		setYear(birthYear);
	}

	public void setFirstName(String fName) {
		this.fName = fName;
	}
	
	public void setLastName(String lName) {
		this.lName = lName;
	}
	
	public void setDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	public void setMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	public void setYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public String getFirstName(){
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public String getDateOfBirth() {
		return String.format("%d%d%d", birthMonth, birthDay, birthYear);
	}
	
	public int getAge() {
		return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - birthYear;
	}
	
	public int maxHeartRate(){
		return (220 - getAge());
	}
	
	public String targetHeartRate(){
		return String.format("%.0f - %.0f", maxHeartRate() * 0.5, maxHeartRate() * 0.85);	
	}

}
