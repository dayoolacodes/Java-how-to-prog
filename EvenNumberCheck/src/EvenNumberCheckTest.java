import java.util.Scanner;

public class EvenNumberCheckTest {

		public static void main(String [] args) {
			Scanner input = new Scanner(System.in);
			EvenNumberCheck checker = new EvenNumberCheck();
			
			System.out.print("Enter Number to be Checked: ");
			int num = input.nextInt();

//			System.out.print(checker.NumberChecker(y));
			checker.NumberChecker(num);
	}

}
