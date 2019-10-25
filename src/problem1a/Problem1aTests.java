package problem1a;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem1aTests {

	@Test
	public void testRectangle1() {
		Rectangle1 rectangle1 = new Rectangle1();
		rectangle1.setWidth(2);
		rectangle1.setHeight(3);
		
		assertTrue(rectangle1.computeArea() == 6);
		assertTrue(rectangle1.computePerimeter() == 10);
	}
	
	@Test
	public void testSquare1() {
		Square1 square1 = new Square1();
		square1.setWidth(2);
		square1.setHeight(2);
		
		assertTrue(square1.computeArea() == 4);
		assertTrue(square1.computePerimeter() == 8);
	}
	
}
