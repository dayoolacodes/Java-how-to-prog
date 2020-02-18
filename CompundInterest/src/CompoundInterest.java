import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {
	Scanner input = new Scanner (System.in);
	
		double principal = 0;
		double rate = 0.05;
		double compoundInt;
		
	public double calculateCompoundInt() {
		
		System.out.print("Enter Amount: ");
		principal = input.nextDouble();
		
		System.out.print("Enter Number of Years: ");
		int years = input.nextInt();
		
		for (int i=0; i<=years; i++) {
			compoundInt = principal * Math.pow((1+rate), years);
			DecimalFormat decimalPlaces2 = new DecimalFormat("#.##");
			
			compoundInt = Double.parseDouble(decimalPlaces2.format(compoundInt));
			
			
		}
		System.out.printf("$%.2f%n", compoundInt);
		return compoundInt;
		//double compoundInt = principal * Math.pow((1+rate), years);
		
		//System.out.printf("%.2f", compoundInt);
	
	
	}

}



