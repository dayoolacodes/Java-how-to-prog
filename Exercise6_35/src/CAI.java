import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;




public class CAI {
	SecureRandom random = new SecureRandom();
	Scanner input = new Scanner(System.in);
	static double total = 0;
	String[] correctAnswers = { "Very good!", "Excellent!", "Nice work!", "Keep up the good work!" };
	String[] wrongAnswers = { "No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying." };

	public double division() {
		// System.out.println("This is a division question");
		double firstNumber = 1 + random.nextInt(9);
		double secNumber = 1 + random.nextInt(9);
		double divide = (firstNumber / secNumber);

		DecimalFormat decimalPlaces2 = new DecimalFormat("#.##");

		String twoDecPlace = decimalPlaces2.format(divide);
		System.out.printf("How much is %.0f / %.0f to TWO DECIMAL PLACES:%n", firstNumber, secNumber);
		double answer = input.nextDouble();

		double backToDouble = Double.parseDouble(twoDecPlace);

		if (answer == backToDouble) {
			int selectComment = random.nextInt(4);
			System.out.println(correctAnswers[selectComment]);
			total++;
		} else {
			int selectComment = random.nextInt(4);
			System.out.println(wrongAnswers[selectComment]);
		}
		return divide;
	}

	public int multiply() {
		// System.out.println("This is a multiplication question");
		int firstNumber = random.nextInt(10);
		int secNumber = random.nextInt(10);
		int multiply = secNumber * firstNumber;

		System.out.printf("How much is %d * %d:%n", firstNumber, secNumber);
		int answer = input.nextInt();

		if (answer == multiply) {
			int selectComment = random.nextInt(4);
			System.out.println(correctAnswers[selectComment]);
			total++;
		} else {
			int selectComment = random.nextInt(4);
			System.out.println(wrongAnswers[selectComment]);
		}
		return multiply;
	}

	public int addition() {
		// System.out.println("This is addition question");
		int firstNumber = random.nextInt(10);
		int secNumber = random.nextInt(10);
		int addition = secNumber + firstNumber;

		System.out.printf("How much is %d + %d:%n", firstNumber, secNumber);
		int answer = input.nextInt();

		if (answer == addition) {
			int selectComment = random.nextInt(4);
			System.out.println(correctAnswers[selectComment]);
			total++;
		} else {
			int selectComment = random.nextInt(4);
			System.out.println(wrongAnswers[selectComment]);
		}
		return addition;
	}

	public int subtraction() {
		// System.out.println("This is a subtraction question");
		int firstNumber = random.nextInt(10);
		int secNumber = random.nextInt(10);
		int minus = firstNumber - secNumber;

		System.out.printf("How much is %d - %d:%n", firstNumber, secNumber);
		int answer = input.nextInt();

		if (answer == minus) {
			int selectComment = random.nextInt(4);
			System.out.println(correctAnswers[selectComment]);
			total++;
		} else {
			int selectComment = random.nextInt(4);
			System.out.println(wrongAnswers[selectComment]);
		}
		return minus;
	}

	public void mathCIA() {
		for (int k = 0; k < 10; k++) {
			System.out.print(
					"Choose question type: 1 for addition, 2 for subtraction, "
					+ "3 for multiplication, 4 for Division and 5 for a random question: ");
			int selectQuestion = input.nextInt();

			if (selectQuestion >= 1 | selectQuestion <= 5) {
				if (selectQuestion == 1) {
					addition();
				} else if (selectQuestion == 2) {
					subtraction();
				} else if (selectQuestion == 3) {
					multiply();
				} else if (selectQuestion == 4) {
					division();
				} else if (selectQuestion == 5) {
					int randomQuestSelect = 1 + random.nextInt(4);
					if (randomQuestSelect == 1) {
						addition();
					} else if (randomQuestSelect == 2) {
						subtraction();
					}

					if (randomQuestSelect == 3) {
						multiply();
					}
					if (randomQuestSelect == 4) {
						division();
					}
				}

				else {
					System.out.println("Kindly Enter Number Within Range.");
					k--;
					continue;
				}
			}
		}
		double avgTotal = (total * 10 / 100) * 100;
		System.out.println(avgTotal + "%");
		double avg = total / 10;
		if (avg < 0.75) {
			System.out.println("Please ask your teacher for extra help.");
		} else if (avg >= 0.75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		input.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CAI obj = new CAI();
		

		
		try{
			obj.mathCIA();
		}
		catch(InputMismatchException e){
			System.err.println("Wrong Input! Try Again");
			
		}
		
	}

}
