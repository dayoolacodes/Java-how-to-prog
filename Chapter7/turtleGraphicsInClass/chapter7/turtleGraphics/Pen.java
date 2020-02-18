package chapter7.turtleGraphics;

public class Pen {
	private Position penPosition = Position.UP;

	public Position getPenPosition() {
		return penPosition;
	}

	public void setPenPosition(Position myPosition) {
		this.penPosition = myPosition;
	}

}
