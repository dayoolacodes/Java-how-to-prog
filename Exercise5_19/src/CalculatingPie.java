
public class CalculatingPie {

	double denominator = 1;
	int pie = 1;
	double numerator =4;
	int counter = 1;
	double add = 0;

	
	public void pieCalculator() {
		System.out.println("Term \t|\t Value");
		while (pie<=200000) {
			//if(add<3.14159) {
			add+=numerator/denominator;
			System.out.println(counter +". \t|\t"+add);
			denominator+=2;
			counter++;
			add-=numerator/denominator;
			System.out.println(counter +". \t|\t"+add);
			denominator+=2;
			counter++;
		//}
			//else {
				//break;
			//}
		pie++;
		}

	}
	
}
