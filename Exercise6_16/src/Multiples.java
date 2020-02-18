
public class Multiples {
	
	public static void isMultiple(int firstNumber, int secondNumber) {
		boolean isMultiple;
		
		if(firstNumber%secondNumber==0) {
			isMultiple=true;	
		}
		else {
			isMultiple=false;
		}
		System.out.print(isMultiple);
	}

}
