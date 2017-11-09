package shapes;

public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
		// to be implemented by student
	}

	@Override
	public double calculateArea() {
		// to be implemented by student
		
		return (pi)*(this.radius)*(this.radius);
	}

	@Override
	public double calculatePerimeter() {
		// to be implemented by student
		return (pi)*(2*(this.radius));
	}

	@Override
	public String toString() {
		// to be implemented by student
		return "Circle Radius: " + radius + "\nArea: " + this.calculateArea() + "\nPerimeter: "
				+ this.calculatePerimeter() + "\n\n";
	}
}
