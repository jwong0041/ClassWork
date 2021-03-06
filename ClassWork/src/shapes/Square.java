package shapes;

public class Square extends Rectangle 
{

	int side;

	public Square(int side) 
	{
		super(side, side);
		this.side = side;	
	}

	
	@Override
	public String toString() 
	{
		return "Square Side: " + side + "\nArea: " + this.calculateArea() + "\nPerimeter: "
				+ this.calculatePerimeter() + "\n\n";
	}

}
