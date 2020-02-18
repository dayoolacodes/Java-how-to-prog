import java.util.Scanner;

public class EvenOrOdd {
	
	public static boolean isEven(int number) {
		boolean isEven;		
		
		if(number % 2==0) {
			isEven = true;
		}
		else {
			isEven=false;
		}
		System.out.println(isEven);
		return(isEven);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numberEntered = 0;
		
		while(numberEntered != -1) {
			
		System.out.print("Enter Number to Check if Even or Odd: ");
		numberEntered = input.nextInt();
		EvenOrOdd.isEven(numberEntered);
		
		System.out.println("Enter -1 to terminate or anynumber to contiue: ");
		numberEntered = input.nextInt();
		}
	}
	
	

}

