import java.util.Scanner;

public class FindTheSmallestValue {
	Scanner input = new Scanner(System.in);

	public void smallValueChecker() {
	
	System.out.println("Enter Number: ");
	int numberCollected = input.nextInt();
		
		int smallest = numberCollected;
		
		while (numberCollected!=-1) {
		
		if (numberCollected < smallest) 
		{
			smallest = numberCollected;
		}

		System.out.println("Enter Number to continue or -1 to quit: ");
		numberCollected = input.nextInt();
		
		
		}
		System.out.println("The smallest value is " + smallest);
		

	}
}
