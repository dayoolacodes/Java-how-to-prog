import java.util.Scanner;

public class SquareOfAsterisks {
	Scanner input = new Scanner(System.in);
	
	public void asterisks() {
		System.out.println("Enter Number: ");
		int asterisks = input.nextInt();
		
		if(asterisks>0 && asterisks<21) {
		for(int i=0; i<asterisks; i++) {
				System.out.print("* ");
		}
		System.out.println();
		
		for(int a=2; a<asterisks;a++) {
			System.out.print("*");
			for(int i=0; i<(asterisks*2)-3; i++) {
			System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=0; i<asterisks; i++) {
			System.out.print("* ");
		}
		
	}
		else {
		System.out.println("Enter a number between 1 and 20");
		}
	}
}
