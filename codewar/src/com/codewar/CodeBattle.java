package com.codewar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.stream.IntStream;

public class CodeBattle {
	
	
	 public void codeBattleApp(){
		 int num=0;
			Scanner input = new Scanner(System.in);	
			//collecting input
			System.out.println("Enter size of array: ");
			
			try{num = input.nextInt();}
			
			catch(InputMismatchException e) {
				System.err.println(e+"\nERROR! Pls try again");
			}
			//declaring array
			int arr[] = new int[num];
			for(int i=0; i<arr.length; i++) {
				System.out.print(Arrays.toString(arr));
				
				if(i==arr.length-1) {
					System.out.println("\nEnter last Number: ");
					try{arr[i]=input.nextInt();}
					catch(InputMismatchException e) {
						System.err.println("\nERROR! pls try again");
						break;
					}	
					break;
				}
				System.out.println("\nEnter number: ");
				try{arr[i]=input.nextInt();}
				
				catch(InputMismatchException e) {
					System.err.println("ERROR! pls try again");
					break;
				}			
			}			
			
			System.out.print(Arrays.toString(arr));
			
			

			//sum of array:
			int result = IntStream.of(arr).sum();
			System.out.println("\nresult is: " + result);
			input.close();
	 }
	 

	public static void main(String[] args) {
		CodeBattle obj = new CodeBattle();
		obj.codeBattleApp();
		
		}
}
