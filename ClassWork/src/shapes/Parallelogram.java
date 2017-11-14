package shapes;

public class Parallelogram implements Shape {
	
	private int base;
	private int height;
	private int side;

	public Parallelogram(int height, int base, int side) {
		this.height = height;
		this.base = base;
		this.side = side;
	}


	public double calculateArea() {

		
		return (this.base)*(this.height);
	}


	public double calculatePerimeter() {

		
		return ((2*(this.side))+(2*(this.base)));
	}


	public String toString() {
		return "Parallelogram Base: " + base + "\nHeight: " + height + "\nSide: " + side + "\nArea: " + this.calculateArea() + "\nPerimeter: "
				+ this.calculatePerimeter() + "\n\n";
	}
}
