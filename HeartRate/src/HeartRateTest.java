import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeartRate yourHeart = new HeartRate();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Name: ");
		String firstName = input.next();
		yourHeart.setFirstName(firstName);
		
		System.out.print("Enter Last Name: ");
		String lastName = input.next();
		yourHeart.setLastName(lastName);
		
		System.out.print("Enter Day of Birth: ");
		int x = input.nextInt();
		
		System.out.print("Enter month of Birth: ");
		int y = input.nextInt();
		
//		System.out.print("Enter year of Birth: ");
//		int z = input.nextInt();
		System.out.print("Enter Year of Birth: ");
		int ag = input.nextInt();
				
		
		System.out.printf("you are %dyears old and your target heart rate is %f", yourHeart.age(ag), yourHeart.targetHeartRate(yourHeart.age(ag)));
		
		
	}

}
