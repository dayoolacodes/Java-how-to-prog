import java.util.InputMismatchException;

public class ExponentiationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {		
		Exponentiation.integerPower(0, 0);
		}
		catch(InputMismatchException e) {
			System.out.println("Sorry wrong value, try again " + e.getLocalizedMessage());
		}
	}

}
