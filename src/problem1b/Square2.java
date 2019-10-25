package problem1b;

public class Square2 {
	private double height;
	
	public double computeArea() {
		return height * height;
	}
	
	public double computePerimeter() {
		return (4 * height);
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
