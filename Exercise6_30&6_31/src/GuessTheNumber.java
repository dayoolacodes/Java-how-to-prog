import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
	
	public static void guess() {
		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
		int number = 1 + random.nextInt(1000);
		int sentinel=1;
		
		while(sentinel>0) {
		//System.out.println(number);
		if(number==1||number<10) {
			System.out.println("*");
			break;
		}
		if(number==10||number<100) {
			System.out.println("**");
			break;
		}
		if(number==100||number<1000) {
			System.out.println("***");
			break;
		}
		sentinel++;
		}
		int counter = 0;
		while(sentinel>0) {	
			counter++;
		System.out.print("Guess a number between 1 - 1000: ");
		int guessed = input.nextInt();
		
		if(guessed == number) {
			System.out.println("Congratulations! You guessed the number!");
			if(counter<10) {
				System.out.println("Either you know the secret or you got lucky!");
			}
			else
				if (counter==10) {
					System.out.println("Aha! You know the secret!");
				}
				else
					if(counter>10) {
						System.out.println("You should be able to do better!");
						}
			System.out.println("Enter 1 to restart or 0 to quit");
			sentinel= input.nextInt();
			number = 1 + random.nextInt(1000);
			
			continue;
		}
		else 
			if(guessed > number) {
				System.out.println("Too High. Try Again.");
				continue;
		}
			else 
				if(guessed < number) {
					System.out.println("Too Low. Try Again.");
					continue;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessTheNumber.guess();
	}

}
