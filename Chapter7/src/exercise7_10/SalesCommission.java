package exercise7_10;

import java.util.Scanner;


public class SalesCommission {
	
	public int varArgs(int...num) {
	
		int total = 0;
		for(int x : num)
		total += x;
		
		
	return total/num.length;
	}
	
	public void calculator() {
		int [] salaries  = new int [11];

		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<salaries.length; i++) {
		System.out.print("Enter gross sales: ");
		int weeklySales = input.nextInt();
		double gross = 0.09 * weeklySales;
		int incomePerWeek = 200 + (int)gross;
		
		switch(incomePerWeek/100) {
		case 1:
			break;
		case 2: 
			++salaries[2];
			break;
		case 3:
			++salaries[3];
			break;
		case 4: 
			++salaries[4];
			break;
		case 5:
			++salaries[5];
			break;	
		case 6:
			++salaries[6];
			break;
		case 7: 
			++salaries[7];
			break;
		case 8:
			++salaries[8];
			break;	
		case 9: 
			++salaries[9];
			break;
		default:
			++salaries[10];
			break;	
		
		}
	
		}
		System.out.printf("%s%20s%n","Salaries","Frequency");
		for(int i=2; i<salaries.length; i++) {
			if (i==10) {
				System.out.printf("%d- \t%20d", i*100, salaries[i]);
			}
			else {
			System.out.printf("%d-%d %20d", i*100, (i*100+99), salaries[i]);
			System.out.println();}
		}
		input.close();
		
	}
	
	public static void main(String [] das) {
		SalesCommission obj = new SalesCommission();
		
		obj.calculator();
		//System.out.println(obj.varArgs(2,2));
		
		
	}

}
