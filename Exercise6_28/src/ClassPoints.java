import java.util.Scanner;

public class ClassPoints {

	public static void qualityPoints(int point) {
		switch(point/10) {
		case 10:
		case 9: System.out.println(4);
		break;
		case 8: System.out.println(3);
		break;
		case 7: System.out.println(2);
		break;
		case 6: System.out.println(1);
		break;
		default:  System.out.println(0);
		break;
		
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Average: ");
		int avg = input.nextInt();
		
		ClassPoints.qualityPoints(avg);
	}

}
