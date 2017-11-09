package shapes;

public class Triangle implements Shape {
	
	private int base;
	private int height;
	private int side;

	public Triangle(int height, int base, int side) {
		this.height = height;
		this.base = base;
		this.side = side;
	}


	public double calculateArea() {
		// To be written by student\
		
		return ((0.5*(this.base))*(this.height));
	}


	public double calculatePerimeter() {
		// To be written by student
		
		return (3*(this.side));
	}


	public String toString() {
		return "Triangle Base: " + base + "\nHeight: " + height + "\nSide: " + side + "\nArea: " + this.calculateArea() + "\nPerimeter: "
				+ this.calculatePerimeter() + "\n\n";
	}
}
