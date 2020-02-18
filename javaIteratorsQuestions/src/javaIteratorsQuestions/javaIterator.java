package javaIteratorsQuestions;

import java.math.BigInteger;
import java.util.Scanner;

public class javaIterator {
	
	final static Scanner input= new Scanner(System.in);
	final int FIVE = 5;
	final int TWO = 2;

	public void runApp() {

		for (int i=BigInteger.ONE.intValue(), x=BigInteger.ONE.intValue(); i <= FIVE; i++, x+=TWO) {

			for (int j = FIVE; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = BigInteger.ZERO.intValue(); j < x; j++) {
				System.out.print(i);
			}
			System.out.println();

		}

	}
	
	public void runApp2() {

		for (int i=BigInteger.ONE.intValue(); i <= FIVE; i++) {

			for (int j = FIVE; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int l=TWO, p=i; l<=i; l++, p--){
			      System.out.print(p);
			}
			for (int j = BigInteger.ONE.intValue(); j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			}

	}
	
	public void multiplicationTable() {
		System.out.println("\nEnter a positive Integer: ");
		int positiveInt = input.nextInt();
		
		for(int i=1;i<=12; i++) {
			System.out.printf("%d * %d = %d\n", positiveInt, i, positiveInt * i);
		}
		
	}
	
	public static void main(String[] args) {
		javaIterator obj = new javaIterator();
		obj.runApp();
		obj.runApp2();
		obj.multiplicationTable();
		
		input.close();
	}

}
