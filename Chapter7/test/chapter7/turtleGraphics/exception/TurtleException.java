package chapter7.turtleGraphics.exception;



public class TurtleException extends Exception {
	
	public TurtleException (String errorMessage){
		super(errorMessage);
	}
	
	public TurtleException(String error, Throwable cause) {
		super(error, cause);
		
	}
	
	public TurtleException(String error, Exception cause) {
		super(error, cause);
		
	}

}
