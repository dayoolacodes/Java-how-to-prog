package foursideshapes;

public class Rectangle extends Quadilateral {
	
	
	public Rectangle(int lenght, int breadth) {
		super(lenght, breadth);
		super.setLenght(lenght);
		super.setBreadth(breadth);
		
		
	}
	
	public int area() {		
		return super.getLenght() * super.getBreadth();
	}
}
