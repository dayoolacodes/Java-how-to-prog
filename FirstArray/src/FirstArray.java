import java.security.SecureRandom;

public class FirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tofunmi = new int[10];
				
		System.out.println("Index\tValue");
		for(int i=0,x = 9; i<tofunmi.length;i++,x--){
			tofunmi[i]= x;
			System.out.printf("%5d\t%5d%n",i,tofunmi[i]);
			
		}
//		//Random Numbers into an array
//		for(int i=0; i<tofunmi.length;i++) {
//			tofunmi[i]	= (int)(Math.random()*100);
//			System.out.println(tofunmi[i]);
//		}
		
		int[] frequency = new int[7];
		
		SecureRandom Die = new SecureRandom();
		System.out.printf("%s%20s\n","Face","Frequency");
		for(int i=0;i<60_000_000;i++) {
			
			++frequency[1+Die.nextInt(6)];
		}
		for(int face=1;face<=6;face++) {
			System.out.printf("%d %20d",face,frequency[face]);
			System.out.println();
		}
	
	}

}
