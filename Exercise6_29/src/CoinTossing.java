import java.security.SecureRandom;
import java.util.Scanner;
public class CoinTossing {
	
	enum CoinFlips{
			HEADS,TAILS
		}
		
	public static void flips() {
		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);	
		CoinFlips Status;
		
		int flipper=1, counter=0, counter1=0;
		
		while(flipper>0&&flipper<2) {
		int coin = random.nextInt(2);
		
		System.out.print("Enter 1 to Toss Coin or any number to stop: ");
		flipper = input.nextInt();
		if (flipper<=0||flipper>1) {
			break;
		}
		
		if (coin==0) {
			Status = CoinFlips.HEADS;
			counter++;
		}
		else {
			Status = CoinFlips.TAILS;
			counter1++;
		}
	
		System.out.println(Status);
		
		}
		System.out.printf("Heads appeared %dtime(s)", counter);
		System.out.printf("\nTails appeared %dtime(s)", counter1);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinTossing.flips();
	}

}
