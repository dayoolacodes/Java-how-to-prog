import java.util.Date;

public class Human {
	private Date dateOfBirth;
	Date currentDate = new Date();
	
		public Date getDateOfBirth() {
		return dateOfBirth;
		}

	public Human(String  birthday) {
		dateOfBirth = currentDate;
	}
	
}
