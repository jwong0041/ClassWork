package shapes;

public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		// To be written by student
		return (this.length)*(this.width);
	}


	public double calculatePerimeter() {
		// To be written by student
		
		return (2*(this.length))+ (2*(this.width));
	}


	public String toString() {
		return "Rectangle Width: " + width + "\nLength: " + length + "\nArea: " + this.calculateArea() + "\nPerimeter: "
				+ this.calculatePerimeter() + "\n\n";
	}
}
