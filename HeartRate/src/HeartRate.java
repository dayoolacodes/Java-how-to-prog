

public class HeartRate {
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	
	private int day;
	private int month; 
	
	
	public int dateOfBirth(int day, int month, int year){
		int Dob =  day / month / year;
		return Dob;		
	}
	
	public int age(int year){
		int age = 2019 - year;
		return age;		
	}
	public int maximumHeartRate(int year) {
		int MHR = 220 - year;
		return MHR;
	}
	
	public double targetHeartRate(double age) {
		double MHR = 220 - age;
		double THR = MHR * ((int)(Math.random() * 35 + 1 + 50))/100;
		return THR;
	}
	
	public HeartRate() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
}
