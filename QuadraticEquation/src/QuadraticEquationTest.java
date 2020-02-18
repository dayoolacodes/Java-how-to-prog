import java.util.Scanner;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		QuadraticEquation calculate = new QuadraticEquation();
		
			System.out.print("Enter integer for a: ");
			calculate.setA(input.nextInt());
//			calculate.setA(a);
			System.out.print("Enter integer for b: ");
			calculate.setB(input.nextInt());
		
			System.out.print("Enter integer for c: ");
			calculate.setC(input.nextInt());
	
			
			double discriminant = (Math.pow(calculate.getB(), 2) - (4 * calculate.getA() * calculate.getC()));
			double root1 = (-(calculate.getB()) + Math.sqrt(Math.pow(calculate.getB(), 2) - (4 * calculate.getA() * calculate.getC()))) / 2 * calculate.getA();
			double root2 = (-(calculate.getB()) - Math.sqrt(Math.pow(calculate.getB(), 2) - (4 * calculate.getA() * calculate.getC()))) / 2 * calculate.getA();
			if(discriminant == 0) {
				System.out.printf("The equation has one root which is %.2f", root1);
					}
			else if(discriminant < 0) {
				System.out.print("The equation has no real root ");
			}
			else if (discriminant > 0) {
				System.out.printf("The equation has two real roots which are %.2f and %.2f ",root1, root2);
			}
			input.close();
	}
	
}
