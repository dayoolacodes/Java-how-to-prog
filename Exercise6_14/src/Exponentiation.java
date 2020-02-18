import java.util.Scanner;

public class Exponentiation {
	static Scanner input = new Scanner (System.in);
	
	public static void integerPower(int base, int exponent){
		
		int raiseToPower = 1;
		System.out.println("Enter Number: ");
		base = input.nextInt();
		
		System.out.println("Enter Exponent: ");
		exponent = input.nextInt();
		if (exponent>0) {
		for(int i=0;i<exponent;i++) {
			raiseToPower *= base;
		}
		System.out.printf("%d to the power of %d is : %d", base, exponent, raiseToPower);
		}
		else {
			System.out.println("The exponent has to be positive or non-zero integer.");
		}
		//Scanner.close();
	}
	
}
