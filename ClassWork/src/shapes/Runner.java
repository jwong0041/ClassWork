package shapes;
/**
 * @author Mr Levin Created 10/16/2017
 * 
 *         Lab 2.1 shapes Create implement all necessary methods in this package
 *         to run the code below successfully. After your code below runs
 *         successfully, you will design, implement, and test a couple of your
 *         own Shape classes.
 * 
 *         Choose one of the following: Triangle, Pentagon, Hexagon, Heptagon,
 *         etc. 
 *         Choose one of the following: Rhombus, Trapezoid, Parallelogram,
 *         Kite
 * 
 *         Both classes must implement shape, and implement all necessary methods.
 */
public class Runner {

	public static void main(String[] args) 
	{
		Shape circle1 = new Circle(3);
		Shape rectangle1 = new Rectangle(10, 4);
		Shape square1 = new Square(10);
		Shape triangle1 = new Triangle(2,2,2);
		Shape parallelogram1 = new Parallelogram(10,10,10);

		Shape[] shapeArr = { circle1, rectangle1, square1, triangle1, parallelogram1 };

		for (Shape shape : shapeArr) 
			{
			System.out.println(shape);
			}
		
		System.out.println("\nDid the four shapes above add up to the total printed here?\n");
		System.out.println("Total Area: " + ShapeUtilities.sumArea(shapeArr)); // 168.26
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr)); // 86.84
		System.out.println("\nYes. \n");
		System.out.println("___________________________________________________________");
		System.out.println("\n\n Now testing the random array.\n");

		shapeArr = new Shape[10];

		// Why are we using a for loop instead of a for-each loop here?
			// For-each loop reads the array, but doesn't allow you to add or save more.
		for (int i = 0; i < shapeArr.length; i++) 
			{
			shapeArr[i] = ShapeUtilities.randomShape();
			}

		for (Shape shape : shapeArr) 
			{
			System.out.println(shape);
			}

		System.out.println("\nTotal Area: " + ShapeUtilities.sumArea(shapeArr));
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr));

	}

}
