package exercise7_21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TurtleGraphics {

	Scanner input = new Scanner(System.in);

	private int direction = 1;
	private int row = 0;
	private int column = 0;
	private int[][] turtleArray = new int[40][40];
	private boolean penDown = false;
	private boolean errorLoop = true;
	int currentRow = 0;
	int currentColumn = 0;

//	public TurtleGraphics() {// SAMPLE CONSTRUCTOR CALL
//		this(5);
//		int j;
//
//	}
//
//	public TurtleGraphics(int x) { //Sample constructor)
//		int y = x * 5;
//		TurtleGraphics u;
//
//	}

	public void move(int numberOfSpace) {

		do {
			try {
				if (direction == 1) { // moving northward

					for (int i = 0; i < numberOfSpace; i++) {

						if (penDown == true) {
							turtleArray[row][column] = 1;

						} else {

						}
						errorLoop = false;
						row--;
					}

				} else if (direction == 2) { // moving eastward

					for (int i = 0; i < numberOfSpace; i++) {

						if (penDown == true) {
							turtleArray[row][column] = 1;

						} else {
							// turtleArray[row][column] = 0;
						}
						errorLoop = false;
						column++;
					}
				} else if (direction == 3) { // moving southward

					for (int i = 0; i < numberOfSpace; i++) {

						if (penDown == true) {
							turtleArray[row][column] = 1;

						}
						errorLoop = false;
						row++;
					}
				}

				else if (direction == 4) { // moving westward

					for (int i = 0; i < numberOfSpace; i++) {

						if (penDown == true) {
							turtleArray[row][column] = 1;

						}
						errorLoop = false;
						column--;
					}

				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("You are out of the Floor already");
			}
		} while (errorLoop == true);

	}

	public void turnRight() {

		if (direction < 4) {
			direction++;
		} else if (direction == 4) {
			direction -= 3;
		}
	}

	public void turnLeft() {
		if (direction > 1) {
			direction--;
		}

		else if (direction == 1) {
			direction += 3;
		}
	}

	public void diagonalDown(int steps) {
		do {
			try {

				for (int i = 0; i < 1; i++) {
					for (int j = 0; j < steps; j++) {
						if (row < 0 || column < 0 || row > turtleArray.length || column > turtleArray.length) {
							throw new ArrayIndexOutOfBoundsException("You're out of the floor already!");
						}
						if (penDown == true) {
							turtleArray[row][column] = 1;
						}

						row++;
						column++;
						errorLoop = false;
					}
				}
			} catch (ArrayIndexOutOfBoundsException a) {
				System.err.println("You're out of the floor already!");
			}

		} while (errorLoop == true);
	}

	public void diagonalUp(int steps) {
		do {
			try {
				for (int i = 0; i < 1; i++) {
					for (int j = 0; j < steps; j++) {

						if (row < 0 || column < 0 || row > turtleArray.length || column > turtleArray.length) {
							throw new ArrayIndexOutOfBoundsException();
						}
						if (penDown == true) {
							turtleArray[row][column] = 1;

						}
						row--;
						column++;
						errorLoop = false;
					}
				}

			} catch (ArrayIndexOutOfBoundsException a) {
				System.err.println("You're out of the floor already...");
//				row = 0;
//				column = 0;
			}
		} while (errorLoop == true);

	}

	public String printTurtlePosition() {

		if (direction == 1) {
			System.out.println("Facing North");
		} else if (direction == 2) {
			System.out.println("Facing East");
		} else if (direction == 3) {
			System.out.println("Facing South");
		} else if (direction == 4) {
			System.out.println("Facing West");
		}

		return String.format("%d,%d",  row, column);
	}

	public void displayFloor() {
		for (int irow = 0; irow < turtleArray.length; irow++) {
			for (int icolumn = 0; icolumn < turtleArray[irow].length; icolumn++) {
				if (turtleArray[irow][icolumn] > 0) {
					System.out.print("* ");
				} else if (turtleArray[irow][icolumn] == 0) {
					System.out.print("  ");
				}
				// System.out.print(turtleArray[irow][icolumn] + " ");
			}
			System.out.println();
		}
	}

	public void runApp() {
		String movementCommands = "Kindly Enter \n0: for Menu \n1: for penUp\n2: for penDown\n3: to move right\n4: to move left\n" + 
				"5: to move forward\n6: to display\n7: to move diagonally\n8: to go back to the initial position\n9: to end game\n";
		System.out.println(movementCommands);
		System.out.println(printTurtlePosition());
		
		int command = 0;
		boolean checkInput = true;
		do {

			try {

				if (row < 0 || column < 0 || row > turtleArray.length || column > turtleArray.length) {
					throw new ArrayIndexOutOfBoundsException();
				}
				System.out.println("Enter a command: ");
				command = input.nextInt();

				while (command != 9) {

					switch (command) {

					case 1:
						penDown = false;
						break;
					case 2:
						penDown = true;
						break;
					case 3:
						turnRight();
						break;
					case 4:
						turnLeft();
						break;

					case 5:
						int spaces = 0;
						boolean mismatch = true;

						do {
							try {
								System.out.println("Enter number of spaces");
								spaces = input.nextInt();
								mismatch = false;
							} catch (InputMismatchException e) {
								input.nextLine();
								System.out.println("wrong input");
							}
						} while (mismatch == true);

						move(spaces);

						break;
					case 6:
						displayFloor();
						break;
					case 7:
						System.out.println("Enter 1 for diagonal down or 2 for diagonal up: ");
						int diagDecider = input.nextInt();

						switch (diagDecider) {

						case 1:

							System.out.println("Facing SouthEast \nEnter number of diagonal steps: ");
							diagonalDown(input.nextInt());
							break;

						case 2:
							System.out.println("Facing NorthEast \nEnter number of diagonal steps: ");
							diagonalUp(input.nextInt());
							break;
						default:
							System.out.println("Sorry wrong input, try again: ");
							continue;
						}
						break;
					case 8:
						System.out.println("Back to initial position");
						row = 0;
						column = 0;
						break;
					default:
						System.out.println(movementCommands);
						break;

					}

					System.out.println(printTurtlePosition());
					System.out.println("Enter a command: ");
					command = input.nextInt();

				}
				checkInput = false;
			} catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
				input.nextLine();
				System.out.println("wrong input, try again ");

			}
		} while (checkInput == true);
		System.out.println("End of Game!");
		input.close();
	}

	public static void main(String[] args) {
		TurtleGraphics turtleApp = new TurtleGraphics();

		turtleApp.runApp();

	}

}
