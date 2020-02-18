import java.util.Scanner;

public class CreditTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Credit Pay = new Credit();

		System.out.print("Enter Value: ");
		double money = input.nextDouble();
		
		double moneyPaid = money;	
		double moneyCollected = (money - (money * 0.05));

		Pay.setMoney(money);
		
		System.out.printf("The Amount Deposited is %.0f", Pay.getMoney());
		System.out.printf("\nAfter five percent deduction, balance is: %.2f ", moneyCollected);
	}

}
