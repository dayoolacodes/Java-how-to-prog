import java.util.Scanner;

public class FirstSwitch {
	int sol;
	public void operation() {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstOperand = input.nextInt();
		
		System.out.print("Enter Second number: ");
		int secondOperand = input.nextInt();
		
		
		System.out.print("Enter Operator: ");
		while(input.hasNext()) {
		char operator = input.next().charAt(0);
		
		
				
		switch(operator){
		case '+' : 
			sol = firstOperand + secondOperand;
		break;
		
		case '*' :
			sol = firstOperand * secondOperand;
		break;
		case '/' :
			sol = firstOperand / secondOperand;
		break;
		case '-' :
			sol = firstOperand - secondOperand;
		break;
		
		
		default: {
			System.out.println("No operation performed");
		}
		break;	
		
		}
		System.out.println(sol);}
	}

}
