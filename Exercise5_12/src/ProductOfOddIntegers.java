
public class ProductOfOddIntegers {

	int total=1;
	public void oddCalculator() {
		for(int oddProd=1; oddProd<=15; oddProd+=2) {
				total *= oddProd;
		}System.out.printf("%,d",total);
	}
}
