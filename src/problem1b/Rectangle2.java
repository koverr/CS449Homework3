package problem1b;

public class Rectangle2 extends Square2{
	private double width;
	
	public double computeArea() {
		return width * getHeight();
	}
	
	public double computePerimeter() {
		return ((2 * width) + (2 * getHeight()));
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
}
