import java.util.Scanner;
public class InvoiceNewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoiceNew reciept = new InvoiceNew();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Part Number: ");
		String partNumber = input.nextLine();
		reciept.setPartNumber(partNumber);
		
		System.out.print("Enter Part Description: ");
		String partDescription = input.nextLine();
		reciept.setPartDescription(partDescription);
		
		System.out.print("Enter Quantity of Item: ");
		int quantityOfItem = input.nextInt();
		reciept.setQuantityOfItem(quantityOfItem);
		
		System.out.print("Enter Price per Item: ");
		double pricePerItem = input.nextDouble();
		reciept.setPricePerItem(pricePerItem);
		
		
		
		
		System.out.printf("\n The Part Number is %s\n The Part Description is %s\n The Number of Item is %d\n The Price per Item is %f\n The Total Invoice amount is %f",reciept.getPartNumber(),reciept.getPartDescription(),reciept.getQuantityOfItem(), reciept.getPricePerItem(), reciept.getInvoiceAmount(quantityOfItem,pricePerItem));
	}

}
