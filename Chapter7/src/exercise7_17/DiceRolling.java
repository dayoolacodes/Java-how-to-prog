package exercise7_17;

import java.security.SecureRandom;

public class DiceRolling {

	public static int die() {
		SecureRandom rand = new SecureRandom();
		
		int die = 1 + rand.nextInt(6);
		return die;
		
	}
	public static int dieRoller() {
		int firstDie = die();
		int secDie = die();
		
		int sum = firstDie + secDie;
		
		return sum;
	}
	
	public static void dieGame() {
		int [] frequency = new int[13];
		for(int i=0;i<36_000_000;i++) {
			int dieCase = dieRoller();
			
			switch(dieCase) {
			case 2:
				++frequency[2];
				break;
			case 3:
				++frequency[3];
				break;
			case 4:
				++frequency[4];
				break;
			case 5:
				++frequency[5];
				break;
			case 6:
				++frequency[6];
				break;
			case 7:
				++frequency[7];
				break;
			case 8:
				++frequency[8];
				break;
			case 9:
				++frequency[9];
				break;
			case 10:
				++frequency[10];
				break;
			case 11:
				++frequency[11];
				break;
			case 12:
				++frequency[12];
				break;
			}
		}
		System.out.printf("%s%30s%n","Possible Sum","Number of times appeared");
		for(int face=2;face<frequency.length;face++) {
			System.out.printf("%d\t\t|%10d", face, frequency[face]);
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dieGame();
		
	}

}
