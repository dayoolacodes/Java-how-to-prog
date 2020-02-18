import java.util.Scanner;

public class TheTwelveDaysOfChristmasSong {
	Scanner input = new Scanner(System.in);
	int x=0;
	public void twelveDays(){
		do {
		System.out.println("Enter Number: ");
		x = input.nextInt();
		
		switch (x) {
		case 1: System.out.print("First Day of christmas my true love sent to me:\n");
		break;
		case 2: System.out.print("Second Day of christmas my true love sent to me:\n");
		break;
		case 3: System.out.print("Third Day of christmas my true love sent to me:\n");
		break;
		case 4: System.out.print("Fourth Day of christmas my true love sent to me:\n");
		break;		
		case 5: System.out.println("Fifth Day of christmas my true love sent to me:\n");
		break;
		case 6: System.out.print("Sixth Day of christmas my true love sent to me:\n");
		break;
		case 7: System.out.print("Seventh Day of christmas my true love sent to me:\n");
		break;
		case 8: System.out.print("Eight Day of christmas my true love sent to me:\n");
		break;
		case 9: System.out.print("Ninth Day  of christmas my true love sent to me:\n");
		break;
		case 10: System.out.print("Tenth Day of christmas my true love sent to me:\n");
		break;
		case 11: System.out.print("Eleventh Day of christmas my true love sent to me:\n");
		break;
		case 12: System.out.print("Twelfth Day of christmas my true love sent to me:\n\n");
		break;
		
		default: System.out.println("Enter Number between 1 - 12");
		break;
		
		}
		System.out.print(" ");
		switch(x) {
		case 12: System.out.println("twelve drummers drumming.");
		
		case 11: System.out.println("eleven pipers piping.");
		
		case 10: System.out.println("ten lords a-leaping.");
		
		case 9: System.out.println("nine ladies dancing");
		
		case 8: System.out.println("eight maids  a-milking");
		
		case 7: System.out.println("seven Swans a-swimming");
		
		case 6: System.out.println("six geese a-laying");
		
		case 5: System.out.println("five gold rings");
		
		case 4: System.out.println("four calling birds");
		
		case 3: System.out.println("three French Hens");
		
		case 2: System.out.println("two turtle doves and");
		
		case 1: System.out.println("A partridge in a pear tree\n");
		break;
		
		}
		
		}while(x!=-1);
		
	
		
		
		
		
	}

}
