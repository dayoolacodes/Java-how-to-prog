import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SampleTask{

	
	
	 public static int diagonalDifference(List<List<Integer>> arr) {
		    // Write your code here
		    int firstDiagonal=0;
		    int secondDiagonal=0;
		    
		    
		        for(Integer a=0; a<arr.size();a++) {
		            for(Integer b=0; b<arr.size();b++) {
		                firstDiagonal+=arr.get(a).get(b);   
		            }            
		        }
		         for(Integer a=0, j = arr.size()-1; a<arr.size();a++,j--) {
		             secondDiagonal+=arr.get(a).get(j);
		        }
		        return Math.abs(firstDiagonal-secondDiagonal);

		    }



	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
            for(int i=0; i<3; i++){
                if(a.get(i)>b.get(i)){
                    ++alice;
                }
                else if(b.get(i)>a.get(i)){
                    ++bob;
                }
            }
            return Stream.of(alice,bob).collect(toList());
    }
		public static void main (String [] args) {
			   
			String num = "24315677678";
			int u=0;
			int j[] = new int[num.length()] ;
			int y[]= new int[num.length()];
			
			for(int i=0;i<j.length;i++) {
				j[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
			}
			
			int sumOf2Steps[]= new int[j.length];
			for(int i=0; i<j.length;i+=2) { 
				 sumOf2Steps[i]=j[i];
			}
			
			System.out.println(IntStream.of(sumOf2Steps).sum());
			System.out.println(Arrays.toString(j));
			
			//List<List<Integer> a= {{11,2,4},{4, 5, 6},{10, 8, -12}};
			
			//diagonalDifference();
		}
}






















//import java.util.Scanner;
//
//public class SampleTask {
//
//		Scanner input = new Scanner(System.in);
//		int sum = 0;
//		int x = 1;
//		int total = 0;
//		int counter = 0;
//		int product = 5;
//		
//		
////		
////		while (counter <= 100) {
////			sum = sum + counter;
////			counter ++;	
////			System.out.println(sum);
////		}
////		
////		System.out.println(product *= ++x);
////		
////		System.out.println(product);
////		
//
////		
////		int f = 5;
////		//System.out.println(f);	
////		
////		int d = input.nextInt();
////		int e = input.nextInt();
////		
////		System.out.println(d/e);
//		char d = 't';
//		int e = d;
//		
//		String s1 = "A";
//		String s2 = "a";
//		
//		System.out.println(s1==s2);
//		
////		System.out.print("Enter number less than 10 to start: ");
////		int num= input.nextInt();
//////		total = 0;
//		int i = 0;
//		
////		while(i!=10) {
////			System.out.print("Enter number less than 10 to continue: ");
////			i = input.nextInt();
////			total+=i;
////			
////		}
////
////		
////		System.out.printf("The total sum of number entered is: %d", total);
//		
//		
////		
////		for (; i<10;) {
////			System.out.print("Enter number less than 10 to continue: ");
////			i = input.nextInt();
////			total+= i;
////			
////		
////		}
////
////		System.out.printf("The total sum of number entered is: %d", total);
//		
//		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
//		
//
////			while(i!=-2) {
////				System.out.println("how are you?");
////				i++;
//		
//		}
//		
//		
//	}
//	
//
