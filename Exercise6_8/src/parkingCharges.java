import java.util.Scanner;

public class parkingCharges {
	double upToThreeHours = 2.00;
	double additionalCharge = 0.50;
	double sumOfAdditionalCharge = 0.00;
	double totalCharge = 0.00;

	public void calculateCharges() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of hours: ");
		double numberOfHours = input.nextDouble();
		
		if (numberOfHours <24) {
		
			if(numberOfHours >=19) {
				totalCharge = 10.00;
			}
		else
			if(numberOfHours <= 3) {
				totalCharge = upToThreeHours;
			}
		else
			if(numberOfHours > 3) {
				
				for(int i=3; i<numberOfHours; i++) {	
					sumOfAdditionalCharge += additionalCharge;
				}
				totalCharge = upToThreeHours + sumOfAdditionalCharge;
			}
		System.out.println("Your total parking charge is: $"+ totalCharge);
		}
		else
		{
			System.out.println("No cars are allowed to park for longer than 24hrs");
		}
		
	
	}
}

