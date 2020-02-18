import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Date today = new Date();
	
		System.out.print("Enter Day: ");
		int day = input.nextInt();
		today.setDay(day);
		
		System.out.print("Enter present Month: ");
		int month = input.nextInt();
		today.setMonth(month);
		
		System.out.print("Enter current Year: ");
		int year = input.nextInt();
		today.setYear(year);
		input.close();
		
		today = new Date(day, month, year);
		System.out.println(today.displayDate());
		System.out.printf("Today's date is %d/%d/%d", today.getDay(), today.getMonth(),today.getYear());
		
	}

}
