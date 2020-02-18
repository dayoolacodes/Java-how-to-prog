import java.util.Scanner;
public class ModifiedCompoundInt {
	

		Scanner input = new Scanner (System.in);
		
			int principal = 0;
//			int rate = (int)0.05;
			int compoundInt;
			int years;
			
		public void calculateCompoundInt() {
			System.out.print("Enter Amount: ");
			principal = input.nextInt();
			
			System.out.print("Enter Number of Years: ");
			years = input.nextInt();
			
			for (int i=0; i<=years; i++) {
				compoundInt = (int) (principal * Math.pow((1+0.05),years));
				
			}
			System.out.printf("$%,d.00", compoundInt);
			
			//double compoundInt = principal * Math.pow((1+rate), years);
			
			//System.out.printf("%.2f", compoundInt);
		
		
		}

}






