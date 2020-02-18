import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {
	
	private enum Status{WON, LOST, CONTINUE};
	private static final int two = 2;
	private static final int eleven = 11;
	private static final int seven = 7;
	private static final int twelve = 12;
	private static final int three = 3;
	private static int bankBalance = 1000;
		public static void diceGame() {
			Scanner input = new Scanner(System.in);
			int point=0;
			int x=0;
			Status gameStatus;
			
			System.out.println("Enter Wager: ");
			int wager = input.nextInt();
			
			while(x>0) {
			if (wager<=1000) {
				int sumOfDice1 = rollDice();
			switch(sumOfDice1) {
			case eleven: 
			case seven: 
				gameStatus = Status.WON;
				System.out.println("You Won!");
				break;
			case two:
			case three: 
			case twelve:
				gameStatus = Status.LOST;
				System.out.println("Craps");
				break;
			default: 
				gameStatus = Status.CONTINUE;
				point = sumOfDice1;
				break;
			}
			while (gameStatus == Status.CONTINUE) {
				sumOfDice1=rollDice();
				if (sumOfDice1==seven) {
					gameStatus=Status.LOST;
					System.out.println("craps");
				}
				if (sumOfDice1==point) {
					gameStatus=Status.WON;
					System.out.println("You Won!");
				}
			}
		if(gameStatus==Status.WON) {
			bankBalance+=wager;
		}
		else 
			if(gameStatus==Status.LOST) {
				bankBalance-=wager;
		}	System.out.println(bankBalance);
			wager = bankBalance;
			}
		System.out.println("Enter 0 to quit or 1 to continue");
		x=input.nextInt();
			
			}
		}
			public static int rollDice() {
				SecureRandom random = new SecureRandom();
				int die1 = 1 + random.nextInt(6);
				int die2 = 1 + random.nextInt(6);
				int sumOfDice = die1 + die2;
				System.out.printf("You Rolled %d & %d which is %d\n", die1, die2,sumOfDice);
				return sumOfDice;
			}
	public static void main(String[]args) {	
			diceGame();
	}
	
}
