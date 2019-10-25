package problem1a;

public class Rectangle1 {
	private double width;
	private double height;
	
	public double computeArea() {
		return width * height;
	}
	
	public double computePerimeter() {
		return ((2 * width) + (2 * height));
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
