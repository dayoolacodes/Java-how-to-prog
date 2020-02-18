import java.util.Scanner;

public class HypotenuseCalculations {
	
	public static double hypotenuse(double side1, double side2) {
		Scanner input = new Scanner(System.in);
		double value = 0.0;
		System.out.println("Enter Side 1: ");
		side1 = input.nextDouble();
		
		System.out.println("Enter Side 2: ");
		side2 = input.nextDouble();
		
		value = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		
		return value;
	}

}
