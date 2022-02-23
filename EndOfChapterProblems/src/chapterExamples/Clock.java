package chapterExamples;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		/*if(hour < 10) {
			System.out.print("0" + hour + ":");
		}
		if(hour > 23) {
			System.out.print("00:");
		}
		else {
			System.out.print(hour + ":");
		}
		if(minute < 10) {
			System.out.print("0" + minute + ":");
		}
		if(minute > 59) {
			System.out.print("00:");
		}
		else {
			this.minute = minute;
		}
		if(second < 10) {
			System.out.print("0" + second);
		}
		if(second > 59) {
			System.out.print("00");
		}
		else {
			this.second = second;
		}*/
	}
	
	public void setHour(int hour) {
		if(hour < 10) {
			System.out.print("0" + hour + ":");
			}
		else if(hour > 23) {
			System.out.print("00:");
			}
		else {
			System.out.print(hour + ":");
		}
	}
	
	public int getHour() {
		return hour;
	}
	public void setMinute(int minute) {
		if(minute < 10) {
			System.out.print("0" + minute + ":");
		}
		else if(minute > 59) {
			System.out.print("00:");
		}
		else {
			System.out.print(minute + ":");

		}
	}
	
	public int getMinute() {
		return minute;
	}
	public void setSecond(int second) {
		if(second < 10) {
			System.out.print("0" + second);
		}
		else if(second > 59) {
			System.out.print("00");
		}
		else {
			System.out.print(second);
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	

}
