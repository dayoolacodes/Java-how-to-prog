import java.util.Scanner;

public class FirstForLoop {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
	
//		int i = 1;
//		while (i <= 20) {
//			System.out.printf("%d. Hello Dayo %n", i);
//		i++;
//		}
//		
		int i=1;
		for( ; i <= 40; i++) {
			System.out.println( i + ". Hello broda dayo");
		}
		
		System.out.print("Enter Number:" );
		 i= input.nextInt();
		for( ;i <= 0;) {
			System.out.print( i + ". Hello broda dayo\n");
			
			System.out.print("Enter Number:" );
			i= input.nextInt();
		}
		System.out.println(i);
//		
//		int i = 0;
//		do {
//			System.out.println("this is a do" +i);
//			i++;
//		}
//		while (i < 5);
	}

}
