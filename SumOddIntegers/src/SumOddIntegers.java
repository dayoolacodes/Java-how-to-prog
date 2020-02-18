//Exercise 5.3 page 647
public class SumOddIntegers {
	
	int sum = 1;
	
	public void sumIntegers() {
		for(int count=1; count<=15; count+=2) {
			sum *= count;			
		}
		System.out.printf("%,d",sum);
		System.out.println("\n" +Math.pow(2.5,3));
		System.out.println(12%5);
		
		int i;
		i=1;
		while(i<=20) {
			System.out.print(i+" ");
			if(i%5 == 0) {
				System.out.println();
			}
			i++;
		}
		for(;i<=20;i++){
			System.out.print(i +" ");
			if(i%5 == 0) {
				System.out.println();
			}
		}
//		for (double k = 0.1; k != 1.0; k += 0.1) {
//			 System.out.println();
//			 }
		int n = 1;
		while (n <= 10) {
		System.out.println(n++);
		}
		for (int i1 = 1; i1 <= 10; i1++) {
			for (int j = 1; j <= 5; j++) {
			System.out.print('@');
			}
			System.out.println();
		}
	}
}
	
