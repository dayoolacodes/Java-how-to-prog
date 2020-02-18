import java.util.Scanner;

public class FindTheMinimum {
	
	public static float minimum3(float x, float y, float z) {
		float min = Math.min(Math.min(x,y),z);
		
		return min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		float firstNumb = input.nextFloat();
		System.out.print("Enter Second Number: ");
		float secNumb = input.nextFloat();
		System.out.print("Enter Third Number: ");
		float thirdNumb = input.nextFloat();
		
		System.out.print(FindTheMinimum.minimum3(firstNumb,secNumb,thirdNumb));
		
	}

}
