package exercise7_21;

public class TurtleGraph {
	
	public TurtleGraph() {
		int [][] turtArray = new int [20][20];
		
		for(int i=0; i<turtArray.length; i++) {
			for(int j=0; j<turtArray[i].length;j++) {
				System.out.print(turtArray[i][j]);
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TurtleGraph obj = new TurtleGraph();
		
		System.out.println(obj);
		
	}

	
}
