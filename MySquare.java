package GridWriter;

//Write a MySquare class that extends GridItem. CHECK
//
//Give it the instance variable ‘side’ instead of the rectangle’s height and 
//width, or the circle’s radius. CHECK
//
//Also give it an appropriate constructor, and 
//
//implementations of getArea and containsPoint. 
//
//Instantiate some squares in the testing program to make sure it works. 

public class MySquare extends GridItem {
	
	// instance variable side
	private int side;
	
	// constructor
	public MySquare (int xValue, int yValue, int side) {
		x = xValue;
		y = yValue;
		this.side = side;
	}
	
	// implementing getArea
	public double getArea() {
		return Math.pow(side, 2);
	}
	
	// implementing containsPoint
	public boolean containsPoint(int xValue, int yValue) {
		return	xValue >= x &&
				xValue <= x + side &&
				yValue >= y &&
				yValue <= y + side;
	}
}
