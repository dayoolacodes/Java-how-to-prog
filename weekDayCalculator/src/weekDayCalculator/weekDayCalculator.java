package weekDayCalculator;

import java.util.Scanner;

public class weekDayCalculator {
	
	public void DayCalculator(){
		
		int week = 0;
		int dayNumber = 0;	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		dayNumber = input.nextInt();
		week = (dayNumber / 7)+1;
		
		if (dayNumber > 6) {
			dayNumber = dayNumber % 7;
		}
		
		switch (dayNumber) {
		case 0: 
			System.out.printf("Sunday week-%d", week);
			break;
		case 1:
			System.out.printf("Monday week-%d", week);
			break;

		case 2:
			System.out.printf("Tuesday week-%d", week);
			break;
			
		case 3:
			System.out.printf("Wednesday week-%d", week);
			break;
			
		case 4:
			System.out.printf("Thursday week-%d", week);
			break;
			
		case 5:
			System.out.printf("Friday week-%d", week);
			break;
			
		case 6:
			System.out.printf("Saturday week-%d", week++);
			break;
			
		default:
			System.out.println("Enter a valid number");
			break;
		
		
	
		}
		input.close();
		
		
	}

}
