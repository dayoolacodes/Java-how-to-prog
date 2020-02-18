public class AsterisksTable {		
	public void print1() {
		for(int i = 1; i <=10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");				
				}		
			for(int a = 10; a >= i; a--) {
				System.out.print(" ");				
				}
			for(int j = 10; j >= i; j--) {
			System.out.print("*");
			}
			for(int a = 0; a <= (i-1); a++) {
			System.out.print("  ");
			}
			for(int j = 10; j >= i; j--) {
				System.out.print("*");				
			}	
			for(int a = 10; a >= i; a--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
		System.out.println("");
		}
					
	}	
	
}


		


		



