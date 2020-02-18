package chapter7.turtleGraphics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chapter7.turtleGraphics.exception.TurtleException;

class TurtleTest {
	private Turtle myTurtle;
	private Pen biro;
	private SketchPad aPad;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		myTurtle = new Turtle();
		biro = new Pen();
		aPad = new SketchPad();
		myTurtle.setTurtlePen(biro);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void turtleExistsTest() {
		assertNotNull(myTurtle);
	}

	@Test
	void penNotNullTest() {
		assertNotNull(biro);
	}

	@Test
	void turtlePenNotNull() {
		myTurtle.setTurtlePen(biro);
		assertNotNull(myTurtle.getTurtlePen());
	}

	@Test
	void turtlePenPositionIsUp() {
		myTurtle.setTurtlePen(biro);
		assertNotNull(myTurtle.getTurtlePen().getPenPosition());
		assertEquals(Position.UP, myTurtle.getTurtlePen().getPenPosition());
	}

	@Test
	void turtleHasDirection() {
		assertNotNull(myTurtle.getTurtleOrientation());
	}

	@Test
	void turtleDirectionByDefaultIsRight() {
		assertNotNull(myTurtle.getTurtleOrientation());
		assertEquals(Orientation.COLUMN_RIGHT, myTurtle.getTurtleOrientation());
	}

	@Test
	void turtleDefaultCoordinatesAreZero() {
		assertNotNull(myTurtle);
		assertEquals(0, myTurtle.getColumnCoordinate());
		assertEquals(0, myTurtle.getRowCoordinate());
	}

	@Test
	void sketchpadExists() {
		assertNotNull(aPad);
	}

	@Test
	void sketchPadHasAFloor() {
		assertNotNull(aPad.getFloor());
	}

	@Test
	void changeTurtleDirection() {
		assertEquals(Orientation.COLUMN_RIGHT, myTurtle.getTurtleOrientation());
		myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
		assertEquals(Orientation.ROW_RIGHT, myTurtle.getTurtleOrientation());
	}

	@Test
	void changePenPosition() {
		assertEquals(Position.UP, biro.getPenPosition());
		biro.setPenPosition(Position.DOWN);
		assertEquals(Position.DOWN, biro.getPenPosition());
	}

	@Test
	void drawMovingForwardOnSketchPad() {
		myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
		try {
			myTurtle.draw(12, aPad);
		} catch (TurtleException e) {
			e.printStackTrace();
		}

		assertEquals(0, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for (int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[0][i]);
		}
	}

	@Test
	void drawMovingForwardAndTurnRightOnSketchPad() {
		myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
		try {
			myTurtle.draw(12, aPad);
		} catch (TurtleException e) {
			e.printStackTrace();
		}
		assertEquals(0, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for (int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[0][i]);
		}

		myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
		try {
			myTurtle.draw(12, aPad);
		} catch (TurtleException e) {
			System.err.println("Caught");
			//e.printStackTrace();
		}
		assertEquals(11, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for (int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[i][11]);
		}
	}

	@Test
	void drawAndDisplaySketchPad() {
		myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
		try {
			myTurtle.draw(12, aPad);
		} catch (TurtleException e) {
			//e.printStackTrace();
			System.err.println("Caught");
		}
		assertEquals(0, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for (int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[0][i]);
		}

		myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
		try {
			myTurtle.draw(12, aPad);
		} catch (TurtleException e) {
			//e.printStackTrace();
			System.err.println("Caught");
		}
		assertEquals(11, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for (int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[i][11]);
		}

		myTurtle.setTurtleOrientation(Orientation.COLUMN_LEFT);
		try {
			myTurtle.draw(12, aPad);
		} catch (TurtleException e) {
			System.err.println("Caught");
			//e.printStackTrace();
		}
		assertEquals(11, myTurtle.getRowCoordinate());
		assertEquals(0, myTurtle.getColumnCoordinate());
		for (int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[11][i]);
		}

		myTurtle.setTurtleOrientation(Orientation.ROW_LEFT);
		try {
			myTurtle.draw(12, aPad);
		} catch (TurtleException e) {
			System.err.println("Caught");
			//e.printStackTrace();
		}
		assertEquals(0, myTurtle.getRowCoordinate());
		assertEquals(0, myTurtle.getColumnCoordinate());
		for (int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[i][0]);
		}

		for (int i = 0; i < aPad.getFloor().length; i++) {
			for (int j = 0; j < aPad.getFloor().length; j++) {
				if (aPad.getFloor()[i][j] == 0) {
					System.out.print("  ");
				} else if (aPad.getFloor()[i][j] == 1) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	@Test
	void AssertZeroNumberOfSteps() {
		Assertions.assertThrows(TurtleException.class, ()-> {myTurtle.draw(0, aPad);});

	}
	
	@Test
	void AssertNullSketchPad() {
		aPad = null;
		Assertions.assertThrows(TurtleException.class, ()-> {myTurtle.draw(12, aPad);});
		
	}
	
	@Test
	void drawWithTooManyStepsFromCurrentColumnPosition() {
		myTurtle.setColumnCoordinate(15);
		myTurtle.setTurtleOrientation(Orientation.COLUMN_RIGHT);
		Assertions.assertThrows(TurtleException.class, ()-> {myTurtle.draw(6, aPad);});
	}
	
	@Test
	void drawWithTooManyStepsFromCurrentRowPosition() {
		myTurtle.setRowCoordinate(15);
		myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
		Assertions.assertThrows(TurtleException.class, ()-> {myTurtle.draw(10, aPad);});
	}
	
}
