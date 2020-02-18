import java.util.Scanner;

public class BarChart {

	public void barChartAsterisks() {
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter Number1 between 1-30: " );
		int v = input.nextInt();
		System.out.print("Enter Number2 between 1-30: " );
		int w = input.nextInt();
		System.out.printf("Enter Number3 between 1-30: " );
		int x = input.nextInt();
		System.out.print("Enter Number4 between 1-30: " );
		int y = input.nextInt();
		System.out.print("Enter Number5 between 1-30: ");
		int z = input.nextInt();
				 
		if((v>0)&&(v<=30)) {
			for(int j=1; j<=v; j++) {
				System.out.print("*");
			}
		}
		else{
			System.out.println("Number1 is not within range");
			}
		System.out.println("");
	
		if((w>0)&&(w<=30)){
			for(int j=1; j<=w; j++) 
		{
			System.out.print("*");}
			}
			else {
				
				System.out.println("Number2 is not within range");
			}
		System.out.println("");
		if((x>0)&&(x<=30)){
			for(int j=1; j<=x; j++) 
		{
			System.out.print("*");}
			}
			else {
				
				System.out.println("Number3 is not within range");
			}
		System.out.println("");
		if((y>0)&&(y<=30)){
			for(int j=1; j<=y; j++) 
		{
			System.out.print("*");}
			}
			else {
				
				System.out.println("Number4 is not within range");
			}
		System.out.println("");
		if((z>0)&&(z<=30)){
			for(int j=1; j<=z; j++) 
		{
			System.out.print("*");}
			}
			else {
				
				System.out.println("Number5 is not within range");
			}
		
				 
	}
	
	
}

