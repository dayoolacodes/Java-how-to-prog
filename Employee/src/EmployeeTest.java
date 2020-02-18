import java.util.Scanner;

public class EmployeeTest {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Employee dayo = new Employee();
		Employee dayo2 = new Employee("dayo", "ayoola", 5);
		
		System.out.print("Enter First Name: ");
		String firstName = input.nextLine();
		dayo.setFirstName(firstName);
		
		System.out.print("Enter Last Name: ");
		String lastName = input.nextLine();
		dayo.setLastName(lastName);
		
		System.out.print("Enter Monthly Income: ");
		double monthlySalary = input.nextDouble();
		if (monthlySalary < 0) {
			monthlySalary = 0;}
		if(monthlySalary > 0)	{
		dayo.setMonthlySalary(monthlySalary);
		}
		
		System.out.printf("Fullname: %s %s\nMonthly Income: %f",dayo.getFirstName(),dayo.getLastName(),dayo.getMonthlySalary());
		System.out.println("\nYearly income: " + dayo.EmployeeYearly());
		System.out.println("Yearly income with 10% increase: " + dayo.EmployeeYearlyI());
		
//		System.out.printf("Fullname: %s %s\nMonthly Income: %f",dayo2.getFirstName(),dayo2.getLastName(),dayo2.getMonthlySalary());
//		System.out.println("\nYearly income: " + dayo2.EmployeeYearly());
//		System.out.println("Yearly income with 10% increase: " + dayo2.EmployeeYearlyI());
	
	}

}
