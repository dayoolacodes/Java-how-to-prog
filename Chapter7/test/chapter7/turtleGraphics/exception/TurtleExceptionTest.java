package chapter7.turtleGraphics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurtleExceptionTest {
	Throwable cause;
	Exception cause2;
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void turtleExceptionExistsTest() {
		TurtleException problem = new TurtleException("Turtle has a problem");
		assertNotNull(problem);
	}
	
	@Test
	void turtleExceptionExistsTest2() {
		TurtleException problem2 = new TurtleException("Turtle has a problem", cause2);
		assertNotNull(problem2);
	}


}
