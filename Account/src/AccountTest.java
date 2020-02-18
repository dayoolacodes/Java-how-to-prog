import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		
		System.out.println("Enter Credit Value: ");
		double value = input.nextDouble();
		
		
		//kemiAccount.setName(collectedName);
	
		//System.out.printf("Name is: %s ", kemiAccount.getName());
		System.out.printf("%.0f", account.credit(value));
		
		input.close();
	}

}
