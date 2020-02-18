import java.util.Scanner;

public class SumOddIntegersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		SumOddIntegers x = new SumOddIntegers();
		
		int numb=0;
		int largest=0;
		int smallest=0;
		
		System.out.println("Enter Number: ");
		numb = input.nextInt();
			if (numb > largest) {
				numb = largest;
			}
			else {
				numb = smallest;
			
		}
		System.out.println(numb);
		//x.sumIntegers();
		
		input.close();
		
	}

}
