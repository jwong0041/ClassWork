package shapes;

import java.util.Random;

public class ShapeUtilities 
{

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() 
	{
		Random rand = new Random();
		int x = rand.nextInt(3);

		switch (x) 
		{
		
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Triangle(rand.nextInt(33), rand.nextInt(34), rand.nextInt(33));
		case 4:
			return new Parallelogram(rand.nextInt(25), rand.nextInt(50), rand.nextInt(25));
		default:
			return new Circle(rand.nextInt(100));
			
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapes) 
	{
		int x = 0;
		double totalArea = 0.0;
		for (x = 0; x <= shapes.length-1; x++)
		{	
			totalArea = totalArea + shapes[x].calculateArea();	
		}
		return totalArea ;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapes) 
	{
		int y = 0;
		double totalPerimeter = 0.0;
		for (y = 0; y <= shapes.length-1; y++)
		{
			totalPerimeter = totalPerimeter + shapes[y].calculatePerimeter();
		}
		
		return totalPerimeter;
	}

}
