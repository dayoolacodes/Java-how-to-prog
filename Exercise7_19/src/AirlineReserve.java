import java.util.Scanner;
public class AirlineReserve{
	public  static void boarderPass() {
		Scanner input = new Scanner(System.in);
		boolean[] totalSeat = new boolean[10];
		
		for(int first=1,econ=6;true;) {
			//collect choice of seat
		System.out.println("Please type 1 for First Class and 2 for Economy:");
		int seatAssigner = input.nextInt();
		if(seatAssigner<1||seatAssigner>2) {
			System.out.println("Wrong Value, Try Again!");
			continue;
		}
			//assign seat according to choice
		switch(seatAssigner) {
		case 1:
			if(first<=5) {
				System.out.printf("First Class Seat %d has been assigned to you.", first);
				totalSeat[first-1]=true;
				first++;
				break;}
			if(first>5){
				System.out.println("First  Class Full, If you Would like economy, type2: or 0 to quit: ");
				seatAssigner=input.nextInt();}
				
		break;
		case 2:
			if(econ<=10) {
				System.out.printf("Economy Seat %d has been assigned to you.", econ);
				totalSeat[econ-1]=true;
				econ++;
				break;}
			if(econ>10){
				System.out.println("Economy Full, If you Would like FirstClass, type1: ");
				seatAssigner=input.nextInt();}				
						
			break;
		default:
			continue;
			
		}
		
			System.out.println("\n");
			for(int j=0;j<10;j++) {
				System.out.print(totalSeat[j]+" ");
			}
			System.out.println();
			
			if(first>5&&econ>10||seatAssigner==0) {
				System.out.println("\nNext Flight Leaves in 3Hours!!!");
				break;
			}
		}
		input.close();
			System.out.println("Thanks for your patronage...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boarderPass();	
	}

}
