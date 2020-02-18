import java.util.Scanner;

public class GasMileage {
	private int miles;
	private int gallons;
	
	Scanner input = new Scanner(System.in);
	
	public void milesPerGallon() {
		System.out.print("Enter Number to start or zero/negative number to terminate: ");
		int trip = input.nextInt();
		int mile = 0;
		int gallon = 0;
		double total = 0;
		double milesPerGallon = 0.0;
		while (trip > 0) {
			System.out.print("Enter Miles: ");
			mile = input.nextInt();
			System.out.print("Enter Gallon: ");
			gallon = input.nextInt();
			milesPerGallon = mile / gallon;
			System.out.printf("the miles per gallon is %.2f \n", milesPerGallon);
			System.out.print("Enter Number to continue or zero/negative number to terminate: ");
			trip = input.nextInt();
			total += milesPerGallon;
			}
		System.out.printf("the total miles per gallon is %,f ", total);
				
	}

}