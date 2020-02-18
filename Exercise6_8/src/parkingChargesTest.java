import java.security.SecureRandom;

public class parkingChargesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parkingCharges obj = new parkingCharges();
		
		//obj.calculateCharges();
	SecureRandom rand = new SecureRandom();
		
		int x = rand.nextInt(14) - 3;
		System.out.println(x);
	}

}
