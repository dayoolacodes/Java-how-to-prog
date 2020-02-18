
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee() {
		}
	public Employee(String name, String surname, double monthlySalary) {
		firstName = name;
		lastName = surname;
		this.monthlySalary = monthlySalary;
	}
	public double EmployeeYearly() {
		double yearlySal = monthlySalary * 12;
		return yearlySal;
	}	
	public double EmployeeYearlyI() {
		double percentIncrease = (((monthlySalary * 12) * 10/100) + (monthlySalary * 12));
		return percentIncrease;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
}