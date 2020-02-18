import java.security.SecureRandom;
public class SecureRandomNumber {

	public static void main(String...args) {
		SecureRandom randomNumber = new SecureRandom();

//		for(int i=1; i<=20; i++) {
//			int faceOfDie = 1 + randomNumber.nextInt(6);
//			System.out.print(" " + faceOfDie);
//			if(i%5 == 0) {
//				System.out.println();
//			}
//		int counter1=0;
//		int counter2=0;
//		int counter3=0;
//		int counter4=0;
//		int counter5=0;
//		int counter6=0;
//		
//		for(int i=1; i<=60_000_000; i++) {
//			int faceOfDie = 1 + randomNumber.nextInt(6);
//			
//			switch(faceOfDie) {
//			case 1:
//				counter1++;
//				break;
//			case 2:
//				counter2++;
//				break;
//			case 3:
//				counter3++;
//				break;
//			case 4:
//				counter4++;
//				break;
//			case 5:
//				counter5++;
//				break;
//			case 6:
//				counter6++;
//				break;
//			}	
//		}
//		System.out.println("1 appeared " + counter1 + " times");
//		System.out.println("2 appeared " + counter2 + " times");
//		System.out.println("3 appeared " + counter3 + " times");
//		System.out.println("4 appeared " + counter4 + " times");
//		System.out.println("5 appeared " + counter5 + " times");
//		System.out.println("6 appeared " + counter6 + " times");
	
		int [] array = {1,2,3,4,5,9,8,7,6,0};
		int[] array2 = new int[array.length];
		
		
		
		for(int i=0; i<10;i++) {	
			int rand1 = randomNumber.nextInt(5);
//			array2[i]=rand1;
			if(array2[i]==rand1) {
	
		System.out.print(array2[i]);}}
		
			}
		
		
		
		
	
	
	
	
	
}
