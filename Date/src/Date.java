
public class Date {
	private int month;
	private int day;
	private int year;
	
	
	public Date() {
		this(0,0,0);
	}
	
	public Date (int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;

	}
	public String displayDate() {
		
		String dispDate = String.format("%d/%d/%d",day, month, year);
		return dispDate;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
