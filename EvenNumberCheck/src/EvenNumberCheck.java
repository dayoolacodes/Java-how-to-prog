
public class EvenNumberCheck {
	private int number;
	
	public void NumberChecker(int evenNumber) {
		number = evenNumber;
		if ((evenNumber%2) == 0) 
		{
			
			for(int i=2; i<evenNumber; i+=2) { 
				System.out.printf(" %d ", i);
		} System.out.print(evenNumber);
			}
		
		else {
//			evenNumber = evenNumber;
		}
//			return number;	
	}
	
	public int getNumber() {
		return number;
	}
	
	public void number(int numb) {
		number = numb;
	}
}

