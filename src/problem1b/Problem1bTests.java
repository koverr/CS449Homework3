package problem1b;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem1bTests {

	@Test
	public void testRectangle2() {
		Rectangle2 rectangle2 = new Rectangle2();
		rectangle2.setWidth(2);
		rectangle2.setHeight(3);
		
		assertTrue(rectangle2.computeArea() == 6);
		assertTrue(rectangle2.computePerimeter() == 10);
	}
	
	@Test
	public void testSquare2() {
		Square2 square2 = new Square2();
		square2.setHeight(2);
		
		assertTrue(square2.computeArea() == 4);
		assertTrue(square2.computePerimeter() == 8);
	}
	
}
