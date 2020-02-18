import java.util.Scanner;

public class TemperatureConversions{
	
	public static double fahrenheit(double celsius) {
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return fahrenheit;
	}

	public static double celsius(double fahrenheit) {
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		return celsius;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1 to convert from Celsius to Fahrenheit or 2 to covert from Fahrenheit to Celsius: ");
		int decider= input.nextInt();
		
		if (decider == 1) {
		System.out.print("Convert Celsius to Fahrenheit: ");
		double cel = input.nextDouble();
		System.out.printf("%.1fdegrees celsius = %.2ffahrenheit", cel, fahrenheit(cel));
		}
		
		else
			if (decider == 2) {
		System.out.print("Convert Fahrenheit to Celsius: ");
		double fah = input.nextInt();
		System.out.printf("%.1fdegrees fahrenheit = %.2fcelsius", fah, celsius(fah));
		}
		
			else {
				System.out.println("Number not recognised");
			}
	}
	
	
}
