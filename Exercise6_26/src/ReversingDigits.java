import java.util.Scanner;

public class ReversingDigits {

	
	public static void reverse(int x) {
			
		if(x<1000 || x>9999) {
			System.out.print("Only 4digits number allowed!");
		}	
		else {
			System.out.println("Reversed = "+(x%10)+""+((x%100)/10)+""+((x/100)% 10)+""+(x/1000));
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 4 digits Number: ");
		int numbReverse = input.nextInt();
		
		reverse(numbReverse);

	}

}
