import java.util.Scanner;

public class SeparatingDigits {
	
	public static int integerPart(int a, int b) {
		int c = a/b;
		return c;
	}
	
	public static int remainder(int a, int b) {
		int c = a%b;
		return c;
	}

	public static void displayDigits(int x) {
		System.out.print(integerPart(x,10000)+"  "+ remainder(integerPart(x,1000), 10) +
			"  "+ remainder(integerPart(x,100), 10)+"  "+ remainder(integerPart(x,10), 10)+"  "+remainder(x,10));	
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter digits from 1-99999 number to be separated: ");
		int fourDigits=input.nextInt();
		
		if (fourDigits < 1 || fourDigits > 99999) {
			System.out.print("Only numbers within range allowed!");
		}
		else {
			displayDigits(fourDigits);
		}
		
		
		

	}

}
