
public class TabularOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TabularOutput table = new TabularOutput();
		
		System.out.println("N \t10*N\t100*N\t1000*N");
		table.tabular();
		
		
		// Exercise 4.25: Mystery2.java
	 int count = 1;

		 while (count <= 10) {
		 System.out.println(count % 2 == 1 ? "****" : "++++++++");
		 ++count;
		}
		 
		 // Exercise 4.26: Mystery3.java
		  int row = 10;
		  while (row >= 1) {
		  int column = 1;
		  while (column <= 5) {
		 System.out.print(row % 2 == 1 ? "<" : ">");
		 ++column;
		 }
		 --row;
		 System.out.println();
		 }
		 
	}

}
