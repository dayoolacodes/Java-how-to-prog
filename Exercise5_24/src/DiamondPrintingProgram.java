
public class DiamondPrintingProgram {

	public void diamond() {
		for(int i=1; i<=9;i+=2) {
			for (int j=0; j<i;j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=8; i>=1;i-=2) {
			for (int j=1; j<i;j++) {
			System.out.print("*");
			}
			System.out.println("");
			}
	}
	//EXERCISE 5.27{
	public void exercise() {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
			for (int k = 1; k <= 4; k++) {
			System.out.print('*');
			 }
			
			 System.out.println();
			 }
			
			 System.out.println();
			 }
	}
}
