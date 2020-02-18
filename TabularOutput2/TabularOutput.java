package TabularOutput;

import java.util.Scanner;
	public class TabularOutput {
	Scanner input = new Scanner(System.in);
		public void print() {
				int sum   =   0;
				int count =   1;
		
				System.out.println( "N\tN*10\tN*100\tN*1000\n" );
				while(count<=5) {
				System.out.println( count+"\t"+ 10*count +"\t" + 100*count +"\t"+ 1000*count+"\n");
				count++;
				}
		}
		
		
		String e= "";
		int j = 0;
		
		
				public String print1() {
					
					for(int i = 0; i <=10; i++) {
						for(int j = 0; j < i; j++) {
							System.out.print("*");
						}
						System.out.println(" ");
					}
					return e;
				}	
				public String print2() {
					System.out.print("\n");
					for(int i = 0; i <=10; i++) {
						for(int j = 10; j >= i; j--) {
							System.out.print("*");
						}
						System.out.println(" ");
					}
					return e;
				}
					public String print3() {
					for(int i = 0; i <=10; i++) {
						for(int a = 0; a <= (i-1); a++) {
							System.out.print(" ");
						}
						
						for(int j = 10; j >= i; j--) {
							System.out.print("*");
						
						}	
						System.out.println(" ");
						
					}return e;
					}
					public String print4() {
					for(int i = 0; i <=10; i++) {
						for(int a = 10; a >= (i-1); a--) {
							System.out.print(" ");
						}
						
						for(int j = 0; j < i; j++) {
							System.out.print("*");
						
						}	
						System.out.println(" ");
						
					}return e;
					}
					
//					for(int i = 0; i <= 0; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t");
//					for(int i1 = 0; i1 <= 9; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t");
//					for(int i1 = 0; i1 <= 9; i1++){
//						System.out.print('*');
//						
//					}
//					System.out.print("\t\t");
//					for(int i = 0; i <= 0; i++){
//						System.out.print('*');
//					}
//					
//					System.out.println(" ");
//					for(int i = 0; i <= 1; i++){
//						System.out.print('*');
//					}
//					
//					System.out.print("\t\t");
//					for(int i1 = 0; i1 <= 8; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t ");
//					for(int i1 = 0; i1 <= 8; i1++){
//						System.out.print('*');
//					}
//					
//					System.out.print("\t       ");
//					for(int i = 0; i <= 1; i++){
//						System.out.print('*');
//					}
//					
//					System.out.println(" ");
//					for(int i = 0; i <= 2; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t");
//					for(int i1 = 0; i1 <= 7; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t  ");
//					for(int i1 = 0; i1 <= 7; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t      ");
//					for(int i = 0; i <= 2; i++){
//						System.out.print('*');
//					}
//					System.out.println(" ");
//					for(int i = 0; i <= 3; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t");
//					for(int i1 = 0; i1 <= 6; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t   ");
//					for(int i1 = 0; i1 <= 6; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t     ");
//					for(int i = 0; i <= 3; i++){
//						System.out.print('*');
//					}
//					System.out.println(" ");
//					for(int i = 0; i <= 4; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t");
//					for(int i1 = 0; i1 <= 5; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t    ");
//					for(int i1 = 0; i1 <= 5; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t    ");
//					for(int i = 0; i <= 4; i++){
//						System.out.print('*');
//					}
//					System.out.println(" ");
//					for(int i = 0; i <= 5; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t");
//					for(int i1 = 0; i1 <= 4; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t     ");
//					for(int i1 = 0; i1 <= 4; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t   ");
//					for(int i = 0; i <= 5; i++){
//						System.out.print('*');
//					}
//					System.out.println(" ");
//					for(int i = 0; i <= 6; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t");
//					for(int i1 = 0; i1 <= 3; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t      ");
//					for(int i1 = 0; i1 <= 3; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t  ");
//					for(int i = 0; i <= 6; i++){
//						System.out.print('*');
//					}
//					System.out.println(" ");
//					for(int i = 0; i <= 7; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t");
//					for(int i1 = 0; i1 <= 2; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t       ");
//					for(int i1 = 0; i1 <= 2; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t ");
//					for(int i = 0; i <= 7; i++){
//						System.out.print('*');
//					}
//					System.out.println(" ");
//					for(int i = 0; i <= 8; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t");
//					for(int i1 = 0; i1 <= 1; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t        ");
//					for(int i1 = 0; i1 <= 1; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t");
//					for(int i = 0; i <= 8; i++){
//						System.out.print('*');
//					}
//					System.out.println(" ");
//					for(int i = 0; i <= 9; i++){
//						System.out.print('*');
//					}
//					System.out.print("\t");
//					for(int i1 = 0; i1 <= 0; i1++){
//						System.out.print('*');
//					}
//					System.out.print("\t\t         ");
//					for(int i1 = 0; i1 <= 0; i1++){
//						System.out.print('*');
//					}
//					System.out.print("     ");
//					for(int i = 0; i <= 9; i++){
//						System.out.print('*');
//					}
		}


	
