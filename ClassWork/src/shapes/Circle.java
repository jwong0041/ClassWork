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

	}

	@Override
	public double calculateArea() {

		
		return (pi)*(this.radius)*(this.radius);
	}

	@Override
	public double calculatePerimeter() {

		return (pi)*(2*(this.radius));
	}

	@Override
	public String toString() {
	
		return "Circle Radius: " + radius + "\nArea: " + this.calculateArea() + "\nPerimeter: "
				+ this.calculatePerimeter() + "\n\n";
	}
}
