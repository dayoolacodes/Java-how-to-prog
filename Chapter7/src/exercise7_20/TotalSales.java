package exercise7_20;

import java.security.SecureRandom;

public class TotalSales {
	
	
	public static int sumArray(int[] array) {
		int total = 0;
		for (int i: array) {
			total+=i;
		}
		return total;
	}
	
	public static void sales() {
		SecureRandom rand = new SecureRandom();
		
		int productNSalesPerson[][] = new int[5][4];
		System.out.println("\t\tSalesP1\tSalesP2\tSalesP3\tSalesP4\t|Total");
		System.out.print("\t\t ------------------------------------- \n");
		for (int i = 0; i < productNSalesPerson.length; i++) {
			System.out.printf("%s %d\t", "Product", (i + 1));
			for (int j = 0; j < productNSalesPerson[i].length; j++) {
				int sales = 100 + rand.nextInt(1000);
				System.out.printf(" %,d\t", productNSalesPerson[i][j] = sales);
			}
			System.out.printf("%s%,d\n", "|$", sumArray(productNSalesPerson[i]));
		}
		System.out.print("\t\t ------------------------------------- \n");
		System.out.print(" Total\t\t");
		int grandTotal=0;
		for (int j = 0; j < productNSalesPerson[j].length; j++) {
			int salesAdd = 0;
			for (int k = 0; k < productNSalesPerson.length; k++) {
				salesAdd += productNSalesPerson[k][j];
			}
			grandTotal += salesAdd;
			System.out.printf("$%,d\t", salesAdd);
		}
		System.out.printf("|$%,d",grandTotal);

	}

	public static void main(String[] args) {
		sales();
	}
}
