
public class PythagoreanTriple {
	
	double addition=0;
	
	public void calculatePythagorean() {
		System.out.println("Side_1\tSide_2\tHypotenuse");
		for(int hypotenuse=1; hypotenuse<=500; hypotenuse++) {
			for(int side1=1; side1<=500; side1++) {
				for(int side2=1; side2<=500; side2++) {
				 addition = Math.pow(side1, 2) + Math.pow(side2, 2);
				 	if (addition==Math.pow(hypotenuse, 2)) {
				 		System.out.printf("%d\t %d\t %d ", side1, side2, hypotenuse);
				 		System.out.println("");
				 	}
				}
			}
		}
		
	}

}
