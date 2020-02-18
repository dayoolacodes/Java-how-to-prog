import java.util.Scanner;

public class MathRand {
//	public int random(int value) {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int digit1 = (int) (Math.random()*10+1);
		int digit2 = (int) (Math.random()*10+1);
		int digit3 = (int) (Math.random()*10+1);
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		
		int addition = digit1 + digit2 + digit3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Sum: ");
		int sum = input.nextInt();
		
		if (sum == addition) {
			System.out.println("CORRECT! Chop Knuckles!");
		}
		if (sum != addition) {
			System.out.println("WRONG! Olodo!");
		}
	
	
	}

}
