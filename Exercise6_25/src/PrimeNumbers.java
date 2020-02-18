
public class PrimeNumbers {
	private int prime=0;
//	private int counter=0;
//	private int counter1=0;
	public void primeNumb(int x) {
		
		for(int i=2;i<x;i++) {
			prime=x%i;
			if(prime==0) {
				break;
			}
		}
		if (prime==0 && x!=2) {
				System.out.println(x + " is not a prime number");
				//counter++;
		}
		else
			 {
				System.out.println(x+ " is a prime number");
//				counter1++;
			}
		
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers obj = new PrimeNumbers();
		
		for(int i=1;  i<=1000;i++) {
			obj.primeNumb(i);
		}

	}

}
