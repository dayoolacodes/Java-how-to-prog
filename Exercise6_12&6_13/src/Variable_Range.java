/*6.12 Write statements that assign random integers to the variable n in the

following ranges:
1. 1 ≤ n ≤ 2.
2. 1 ≤ n ≤ 100.
3. 0 ≤ n ≤ 9.
4. 1000 ≤ n ≤ 1112.
5. –1 ≤ n ≤ 1.
6. –3 ≤ n ≤ 11.*/
import java.security.SecureRandom;

public class Variable_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		
		SecureRandom randomNumber = new SecureRandom();
		
		int x = 1 + randomNumber.nextInt(3);
		int y = 1 + randomNumber.nextInt(101);
		int z = randomNumber.nextInt(10);
		int i = 1000 + randomNumber.nextInt(113);
		int j = -1 + randomNumber.nextInt(2);
		int k = -3 * 1 + randomNumber.nextInt(7);
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",x, y, z, i, j, k);
		
/*		6.13 Write statements that will display a random number from each of the
		following sets:
		1. 2, 4, 6, 8, 10.
		2. 3, 5, 7, 9, 11.
		3. 6, 10, 14, 18, 22.*/
		int a = (2 + 1 * randomNumber.nextInt(5));
		int b = (3 + 2 * randomNumber.nextInt(5));
		int c = (6 + 4 * randomNumber.nextInt(5));
		
		System.out.printf("\n%d\n%d\n%d",a, b, c);
		
	}

}
