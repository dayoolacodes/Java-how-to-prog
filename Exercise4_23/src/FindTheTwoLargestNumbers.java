	import java.util.Scanner;
public class FindTheTwoLargestNumbers {
	

	Scanner input = new Scanner (System.in);
	
	public void largeNumbers() {
			int largestNumber = 0;
			int secondLargestNumber = 0;
			int y []=new int[10];
			
			int i=0;
			while(i<y.length) {
		
			System.out.println("Enter Number: ");
			 y[i] = input.nextInt();	
			
			i++;
			}
			for(int j:y) {
				
				if (j>largestNumber) {
					secondLargestNumber = largestNumber;
					largestNumber = j;}
				
				else if (j>secondLargestNumber && j != largestNumber) {
					secondLargestNumber=j;}
					
			}
				
				
				
			
			System.out.println("Largest Number is: "+ largestNumber +" Second Largest Number is: " + secondLargestNumber);

	}

}
