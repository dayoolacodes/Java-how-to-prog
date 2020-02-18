import java.util.Scanner;

public class ModifiedDiamondPrinting {
	
	public void diamond() {
	
		Scanner input = new Scanner(System.in);
					
		System.out.println("Enter odd number between 1-19: ");
			int diamondFig = input.nextInt();
	
		if (diamondFig<1||diamondFig>19) {
			System.out.print("Kindly Enter an Odd Number between 1-19.");
		}
		else if(diamondFig%2!=0) {
			
			for(int i=1; i<diamondFig ;i+=2) {
				for (int j=0; j<i;j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		
		for(int i=diamondFig; i>=1;i-=2) {
			for (int j=0; j<i;j++) {
			System.out.print("*");
			}
			System.out.println("");
			}
		}else {
			System.out.println("Kindly Enter an Odd Number between 1-19.");
		}
		
}

}
