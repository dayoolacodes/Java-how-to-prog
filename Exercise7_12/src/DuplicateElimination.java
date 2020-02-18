import java.util.Scanner;

public class DuplicateElimination {

	public static void duplicateChecker() {
		Scanner input = new Scanner(System.in);

		int[] array1 = new int[10];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Enter Number: ");
			int number = input.nextInt();

			if (number < 10 || number > 100) {
				while (number < 10 || number > 100) {
					System.out.println("Number not within range, enter another: ");
					number = input.nextInt();
				}
			}
			for (int j = 0; j < array1.length; j++) {
					while (array1[0] == number||
							array1[1] == number||
							array1[2] == number||
							array1[3] == number||
							array1[4] == number||
							array1[5] == number||
							array1[6] == number||
							array1[7] == number||
							array1[8] == number||
							array1[9] == number) {
						System.out.println("Number Already in Array, Enter Another: ");
						number = input.nextInt();
						while (number < 10 || number > 100) {
							System.out.println("Number not within range, enter another: ");
							number = input.nextInt();
						}
						continue;
					}
			}

			array1[i] = number;
			for (int y = 0; y < array1.length; y++) {
//				if(array1[y]==0) {
//					break;
//				}

				System.out.printf("%d,", array1[y]);

			}
			System.out.println();
		}
		input.close();
	}

	public static void main(String[] args) {
		int x = 0;
		if (args.length == 0) {
			x=10;
		} else {
			x = Integer.parseInt(args[0]);
		}
	
		duplicateChecker();

	}

}
