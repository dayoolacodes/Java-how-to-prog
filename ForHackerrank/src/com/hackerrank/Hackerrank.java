package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.IntStream;



public class Hackerrank {
	List<String> li = new ArrayList<>();
	Vector<Integer> lti = new Vector<>();
	
	static void miniMaxSum(int[] arr) {
	
		
		long sum = 0;
		int min = 1000000000;
        int max = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
           if (max < arr[i]) {
        	    
        	   max = arr[i];
        	   System.out.println(max);
            }
//            int arr[] = {769082435, 210437958, 673982045, 375809214, 380564127};
        }
        System.out.println(sum);
        System.out.println((sum - max) + " " + (sum - min));
//      
//        long minim = IntStream.of(arr).sum()- IntStream.of(arr).max().getAsInt();
//        long maxim = IntStream.of(arr).sum()- IntStream.of(arr).min().getAsInt();
//        System.out.printf(minim +" "+maxim);
    }
	
	 static void plusMinus(int[] arr) {
	        float positiveNumbers=0;
	        float negativeNumbers=0;
	        float zeros=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>0){
	                positiveNumbers++;
	            }
	            else if(arr[i]<0){
	                negativeNumbers++;
	            }
	            else if (arr[i]==0){
	                zeros++;
	            }
	        }
	        System.out.printf("%f%n%f%n%f", positiveNumbers/arr.length, negativeNumbers/arr.length, zeros/arr.length);

	    }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hackerrank obj = new Hackerrank();
		//obj.codeBattleApp();
		int arr[] = {769082435, 210437958, 673982045, 375809214, 380564127};
		List<int[]> r = Arrays.asList(arr);
	
		miniMaxSum(arr);
//		while(r.contains(IntStream.of(arr).min().getAsInt())) {
//		r.remove(IntStream.of(arr).min().getAsInt());
//		System.out.println(r);
//		}
//		
//		plusMinus(arr);
//		
		StringBuilder sb = new StringBuilder("Testing Testing");
		//System.out.println(sb.capacity());
		sb.setLength(7);
		sb.ensureCapacity(5);
		//System.out.println(sb.capacity());
//		System.out.println(sb.insert(4, "bO"));
		
		int age= 20;
		String ageInt = String.valueOf(age);
//		
//		System.out.println(sb.delete(11, 16));
		Character tt='o';
		
		

		
		
//		System.out.println("\n"+(IntStream.of(arr).min().getAsInt()-IntStream.of(arr).sum()));
//		miniMaxSum(arr);
//	StringBuilder i = new StringBuilder("good");
//	String n = "day";
//	int a= 22;
//	
//	
//	
//	i.reverse();
//	
//	i.append("book");
//	String join = i + n + a;
//	System.out.println(join);
		
		}
}



