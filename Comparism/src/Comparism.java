
public class Comparism {

	private int firstNumber;
	private int secondNumber;


	public Comparism() {
	}
	
	public Comparism(int x, int y) {
		firstNumber = x;
		secondNumber = y;
	}
	
	public int compareTwoNumb(int x, int y) {
		int max = 0;
		if(x > y) {
			max = x;
		}
		if (y > x) {
			max = y;
		}
		else {
			max = max;
		}
		
		return max;
	}
	

	
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	

}
