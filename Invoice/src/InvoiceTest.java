import java.util.Scanner;
public class InvoiceTest {

	public InvoiceTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Invoice shop = new Invoice();
		Invoice shop2 = new Invoice("hgs", "gddd", 23, 34);
		
		
		System.out.print("Enter Part Number: ");
		String partNumber = input.nextLine();
		shop2.setPartNumber(partNumber);
		
		System.out.print("Enter Part Description: ");
		String partDescription = input.nextLine();
		shop2.setPartDescription(partDescription);
		
		System.out.print("Enter Quantity of Item: ");
		int quantityOfItem = input.nextInt();
		shop2.setQuantityOfItem(quantityOfItem);
		
		/*System.out.print("Enter Price of Item: ");
		Double priceOfItem = input.nextDouble();
		shop.setPricePerItem(priceOfItem);*/
		
		System.out.printf("%f",shop2.getInvoiceAmount());
		
		
	}

}
