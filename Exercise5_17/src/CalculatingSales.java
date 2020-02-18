import java.util.Scanner;

public class CalculatingSales {
	double product1 = 2.98;
	double product2 = 4.50;
	double product3 = 9.98;
	double product4 = 4.49;
	double product5 = 6.87;
		
	double prod1 = 0;
	double prod2 = 0;
	double prod3 = 0;
	double prod4 = 0;
	double prod5 = 0;
		
	int item = 1;
	int productCounter=0;
	
	double newValue1=0;
	double newValue2=0;
	double newValue3=0;
	double newValue4=0;
	double newValue5=0;
	
	
	public void salesCalculator() {
		Scanner input = new Scanner(System.in);
	
		while(item>0) {
		System.out.print("Enter Product Number: ");
		int productNumber = input.nextInt();
		
		System.out.print("Enter quantity sold: ");
		int quantitySold = input.nextInt();
		if(productNumber<1 || productNumber>5) {
			quantitySold = 0;
		}
		productCounter+=quantitySold;

		switch(productNumber) {
			case 1: prod1 = product1*quantitySold;
				newValue1+=prod1;
				continue;
			case 2: prod2 = product2*quantitySold;
				newValue2+=prod2;
				continue;
			case 3: prod3 = product3*quantitySold;
				newValue3+=prod3;
				continue;
			case 4: prod4 = product4*quantitySold;
				newValue4+=prod4;
				continue;
			case 5: prod5 = product5*quantitySold;
				newValue5+=prod5;
				break;
			default:
			System.out.println("Product range is between 1-5");
		}
		
		System.out.print("Enter zero to terminate or positive number to continue: ");
		item = input.nextInt();
		}
		
		
		System.out.printf("Total Product 1 sold is %.2f\n", newValue1);
		System.out.printf("Total Product 2 sold is %.2f\n", newValue2);
		System.out.printf("Total Product 3 sold is %.2f%n", newValue3);
		System.out.printf("Total Product 4 sold is %.2f\n", newValue4);
		System.out.printf("Total Product 5 sold is %.2f%n", newValue5);
		System.out.printf("Total Quantity Sold is %d ", productCounter);
		
		
		
	}
	
	
}
