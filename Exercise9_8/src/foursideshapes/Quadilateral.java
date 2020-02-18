package foursideshapes;

public class Quadilateral {
	private int lenght;
	private int breadth;
	
	public Quadilateral(int lenght, int breadth) {
		this.breadth = breadth;
		this.lenght = lenght;
	}
	
	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	private Points xCordinate;
	private Points yCordinate;
	
	public Quadilateral(Points xCordinate, Points yCordinate) {
		this.xCordinate = xCordinate;
		this.yCordinate = yCordinate;
		
		
	}
	
	public Points getX() {
		return xCordinate;
	}

	public Points getY() {
		return yCordinate;
	}

	public void setY(Points y) {
		this.yCordinate = y;
		
	}

	public void setX(Points x) {
		this.xCordinate = x;
	}
	
	 

}
