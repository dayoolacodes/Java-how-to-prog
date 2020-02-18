
public class Factorials {

	long factorial=1;
	long multiplier=1;
	
	public void factorials() {
		System.out.println("Number\t\tFactorial");
		for (int j=1; j<=20; j++) {
	
			multiplier*=factorial;
			factorial++;
			
			System.out.println(j +"! \t\t"+multiplier);
		
		}
		
	
	}
	
}

