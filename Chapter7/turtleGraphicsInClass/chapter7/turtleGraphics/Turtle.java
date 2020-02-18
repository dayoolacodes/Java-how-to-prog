/**
 * 
 */
package chapter7.turtleGraphics;

import java.math.BigInteger;



import java.util.logging.Logger;

import chapter7.turtleGraphics.exception.TurtleException;

/**
 * @author @Dayoola
 *
 */
public class Turtle {
	private Pen turtlePen;
	private Orientation turtleOrientation = Orientation.COLUMN_RIGHT;
	private int columnCoordinate;
	private int rowCoordinate;
	private Logger logger = Logger.getLogger(TurtleException.class.getName());
	
	/**
	 * @return the turtlePen
	 */
	public Pen getTurtlePen() {
		return turtlePen;
	}

	/**
	 * @param turtlePen the turtlePen to set
	 */
	public void setTurtlePen(Pen turtlePen) {
		this.turtlePen = turtlePen;
	}

	/**
	 * @return the turtleDirection
	 */
	public Orientation getTurtleOrientation() {
		return turtleOrientation;
	}

	/**
	 * @param turtleDirection the turtleDirection to set
	 */
	public void setTurtleOrientation(Orientation turtleDirection) {
		this.turtleOrientation = turtleDirection;
	}

	/**
	 * @return the columnCoordinate
	 */
	public int getColumnCoordinate() {
		return columnCoordinate;
	}

	/**
	 * @param columnCoordinate the columnCoordinate to set
	 */
	public void setColumnCoordinate(int columnCoordinate) {
		this.columnCoordinate = columnCoordinate;
	}

	/**
	 * @return the rowCoordinate
	 */
	public int getRowCoordinate() {
		return rowCoordinate;
	}

	/**
	 * @param rowCoordinate the rowCoordinate to set
	 */
	public void setRowCoordinate(int rowCoordinate) {
		this.rowCoordinate = rowCoordinate;
	}

	public void draw(int numberOfSteps, SketchPad drawingPad) throws TurtleException {
	if(numberOfSteps < BigInteger.ONE.intValue()) {
	 logger.info("Method draw was called with invalid number of steps "+ numberOfSteps);
		throw new TurtleException("Number has to be greater than Zero");
	}
	
	if (drawingPad == null ) {
		throw new TurtleException("Sketch Pad is absent");		
	}
	int targetColumnLocation = getColumnCoordinate() + numberOfSteps;
	
	int targetRowLocation = getRowCoordinate() + numberOfSteps;
	if(targetColumnLocation>drawingPad.getFloor().length || targetRowLocation > drawingPad.getFloor().length) {
		 logger.info("Method draw was called with invalid number of steps "+ targetColumnLocation);
			throw new TurtleException("You are out of the floor");
		
	}
	
		for(int i = 0; i < numberOfSteps; i++) {
			drawingPad.getFloor()[this.rowCoordinate][this.columnCoordinate] = 1;
			if(this.turtleOrientation == Orientation.COLUMN_RIGHT && i != numberOfSteps-1) {
				this.columnCoordinate++;
			} else if(this.turtleOrientation == Orientation.ROW_RIGHT && i != numberOfSteps-1){
				this.rowCoordinate++;
			} else if(this.turtleOrientation == Orientation.COLUMN_LEFT && i != numberOfSteps-1){
				this.columnCoordinate--;
			} else if(this.turtleOrientation == Orientation.ROW_LEFT && i != numberOfSteps-1){
				this.rowCoordinate--;
			}
		}
	}
}
