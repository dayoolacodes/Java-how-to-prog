package com.chapter15self;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class fileHandling {
	
	public static void main(String[]args) throws IOException {
		
		File myObj = new File("C:\\Users\\user\\Desktop\\createdFromEclipse.txt");
		//FileWriter myObj = new FileWriter("C:\\Users\\user\\Desktop\\createdFromEclipse.txt");
		Scanner readData = new Scanner(myObj);

		
		String words[] = new String[9];
		int counter=0;
		while(readData.hasNextLine()) {
			String data = readData.next();
			words[counter] = data;
			System.out.println(data);
			counter++;
		}
		
		readData.close();
		System.out.println(Arrays.toString(words));
		
		
		String story = "the, boy is good";
		String [] token = story.split(" ");
		
		System.out.print(Arrays.toString(token));
		
//		myObj.write("i am a man");
//		myObj.close();
		
//		try {
//			if(myObj.createNewFile()) {
//				System.out.println("file created! "+ myObj.getName());
//			}
//			else {
//				System.out.println("japa");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.err.println("error");
//		}
	}

}
