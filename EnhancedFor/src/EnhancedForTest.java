import java.security.SecureRandom;
/*generate numbers between 0-20
20times
fill an array with the values
add all the even numbers except 20
*/
public class EnhancedForTest {
	
	public static void enhancedfor() {
	SecureRandom random = new SecureRandom();
	int [] array = new int[20];
	int sumTotal=0;

		for(int number : array) {
			int num = random.nextInt(21);
			array[number]=num;
			System.out.print(array[number]+" ");
			if(num%2==0&&num!=20) {
				sumTotal += num;
			}
		}
		
		System.out.println("\nSum Total of Even Number is: "+sumTotal);
	}
//	public static void enhancedfor1() {
//		int[] a = {2,3,4};
//		int[] b = {4,5,6};
//		
//		for(int x : a) {
//			a[x] = b[x];
//			
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enhancedfor();
	}

}

