 import java.security.SecureRandom;
public class GameOfChance {
  
	public void roller() {
		int initialPoint = 0;
		SecureRandom randomDie = new SecureRandom();
		
		int firstDie= 1 + randomDie.nextInt(6);
		int secondDie= 1 + randomDie.nextInt(6);
		

		System.out.printf("try1: The values of each die is %d and %d which is: ", firstDie, secondDie);
		
		int sumOfDice = (firstDie + secondDie);
//		int sumOfDice = ((1 + randomDie.nextInt(6)) + (1 + randomDie.nextInt(6)));
		System.out.println(sumOfDice);
		
		
		if (sumOfDice == 7 || sumOfDice == 11) {
			System.out.print("You Win");
		}
		if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
			System.out.print("Crap");
		}
		if (sumOfDice == 4 || sumOfDice == 5 || sumOfDice == 6 || sumOfDice == 8 || sumOfDice == 9 || sumOfDice == 10) {
				initialPoint = sumOfDice;
		for(int i = 2; true ; i++) {
			
			int sumOfDice2 = ((1 + randomDie.nextInt(6)) + (1 + randomDie.nextInt(6)));
			System.out.println(sumOfDice2);
			if (sumOfDice2 == initialPoint) {
				System.out.printf("Your try%d equal %d ", i, sumOfDice2);
				System.out.print("You win");
				break;
				}
			if (sumOfDice2 == 7) {
				System.out.printf("Your try%d is equal to %d%nYou Lose", i, sumOfDice2);
				break;
			}
			else {
				continue;
			}
		}
	}
		}
}
