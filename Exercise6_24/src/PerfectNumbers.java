import java.util.Scanner;

public class PerfectNumbers {

	public static void isPerfect(int x) {
		
	int sum=0;
	 for(int i=1;i<x;i++) {
		 if(x%i==0) {
			 sum+=i;
		 }
	 }
 	if(sum==x) {
 		for(int i=1;i<x;i++) {
 			if(x%i==0) {
 				System.out.print(i +" ");
 			}
 		}
	System.out.printf("= %d, %d is a perfect number\n",x, x);
	 }
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		for(int i=1; i<1000;i++) {
		PerfectNumbers.isPerfect(i);}
	}

}
