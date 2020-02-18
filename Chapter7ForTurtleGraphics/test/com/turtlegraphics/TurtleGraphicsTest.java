package com.turtlegraphics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurtleGraphicsTest {
	private TurtleGraphics myTurtle;
	
	
	@BeforeEach
	void setUp() throws Exception {
		TurtleGraphics myTurtle;
	}

	@Test
	void TurtleClassExists() {
		myTurtle = new TurtleGraphics();
	}
	
	@Test
	void TurtleClassNotNull() {
		assertNull(myTurtle);
	}

}
