import java.util.InputMismatchException;
import java.util.Scanner;

/*write a code that will take two integers, an operator(+,-,*,^,%,/) and save the results in an array, 
  then output the results in the array in this format.
	operand 1	operand 2	operator	result
	   **		    **		   **		  **
the programme should accept input 10 times
ensure that any exception is caught at runtime such as divide by zero
*/
public class ArrayAssignment {
	
	public static void arrayOperator() {
		Scanner input = new Scanner(System.in);
		String solution = "";
		double total = 0.0;
		String [] resultsArray = new String[2];
		int [] firstOperandArray = new int[resultsArray.length];
		int[] secondOperandArray = new int[resultsArray.length];
		char[] operatorArray = new char[resultsArray.length];
		
		for(int i=0,x=1; i<resultsArray.length; i++,x++) {
			System.out.println(x);
		try {
			System.out.print("Enter Operand 1: ");
			int value1 = input.nextInt();
			firstOperandArray[i] = value1;
			System.out.print("Enter Operand 2: ");
			int value2 = input.nextInt();
			secondOperandArray[i] = value2;
			System.out.print("Enter Operator: ");
			char operator = input.next().charAt(0);
			operatorArray[i] = operator;
			
			switch(operator) {
			case '+': 
				total = value1 + value2;
				solution = Double.toString(total);;
			break;
			case '-':
				total = value1 - value2;
				solution = Double.toString(total);
			break;
			case '*':
				total = value1 * value2;
				solution = Double.toString(total);;
			break;
			case '%':
				try {total = value1 % value2;
				if (total==0) {
					solution = "0";
				}
				else {
				solution = Double.toString(total);
				}
				}
				catch(ArithmeticException e) {
					System.out.println("Sorry can't divide by zero");
					solution = "NaN";
					continue;
				}
			break;
			case '/':
			case ':':
				try{
					total = value1 / value2;
					if (total==0) {
						solution = "0";
					}
					else {
					solution = Double.toString(total);
					}
				}
				catch(ArithmeticException e) {
					System.out.println("Sorry can't divide by zero");
					solution = "NaN";
					continue;
				}
			break;
			case '^':
				total = Math.pow(value1, value2);
				solution = Double.toString(total);;
			break;
			default:{
				System.out.println("\nWrong operator");
				continue;
			}
			
			}
			
			resultsArray[i] = solution;
			
			}
			catch (InputMismatchException e) {
				System.out.println("Your Input is wrong " + e.getMessage());
				continue;
			}
			
		}
			System.out.printf("\n%s\t%s\t%s\t%s\n", "Operand1", "Operand2", "Operator", "Result");
			for(int j=0; j<resultsArray.length;j++) {
				
			System.out.printf("%5d%15d%16c%15s\n",firstOperandArray[j],secondOperandArray[j],operatorArray[j],resultsArray[j]);
			
			}
			input.close();
		}

		
	}


