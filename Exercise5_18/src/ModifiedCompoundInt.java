import java.util.Scanner;
public class ModifiedCompoundInt {
	

		Scanner input = new Scanner (System.in);
		
			int principal = 0;
			int compoundInt;
			int years;
			
		public void calculateCompoundInt() {
			System.out.print("Enter Amount: ");
			principal = input.nextInt();
			principal*=100;
			
			System.out.print("Enter Number of Years: ");
			years = input.nextInt();
			
			for (int i=0; i<=years; i++) {
				compoundInt = (int) (principal * Math.pow((1+0.05),years));
			}
			
			int mod = compoundInt%100;
			compoundInt/=100;
			System.out.printf("$%d.%d",compoundInt, mod);
			
		}

}






