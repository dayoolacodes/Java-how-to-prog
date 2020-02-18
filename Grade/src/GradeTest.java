import java.util.Scanner;

public class GradeTest {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		Grade x = new Grade();
		System.out.print("enter: ");
		int r = input.nextInt();
		x.setScore(r);
		
		System.out.print(x.getScore());
	}
}
