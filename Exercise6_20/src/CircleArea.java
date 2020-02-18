import java.util.Scanner;

public class CircleArea {
	
	public static void circleArea() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		double radius = input.nextDouble();
		
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("%.2f", area);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleArea.circleArea();
	}

}
