import java.util.Scanner;

public class SolidAsterisks {
	
	public static void squareOfAsterisks(int number, char fillCharacter) {

		for(int i=0; i<number; i++) {
			for(int j=0; j<number ; j++) {
				System.out.print(fillCharacter);
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number for Solid Square: ");
		int squareNumber = input.nextInt();
		
		System.out.print("Enter prefered character: ");
		char characterFill = input.next().charAt(0);
		
		SolidAsterisks.squareOfAsterisks(squareNumber, characterFill);
		input.close();
	}
	// next() returns a String and charAt(0) gets the String’s first character
//	char fill = input.next().charAt(0);

}
