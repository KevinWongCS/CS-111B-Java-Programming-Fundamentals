package cs111b;
import cs111b.Circle;

public class CircleTester {

	public static void main(String[] args) {
		// initializing 3 circles
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();
		
		// showing areas of three circles
		// circle1
		circle1.setX(2.0);
		circle1.setY(4.0);
		circle1.setRadius(6.0);
		System.out.print("Area of circle1: ");
		System.out.println(circle1.getArea());
		// circle2
		circle2.setX(3.0);
		circle2.setY(5.0);
		circle2.setRadius(10.0);
		System.out.print("Area of circle2: ");
		System.out.println(circle2.getArea());
		// circle3 note: case for no over lap
		// Note: two circles overlap if the sum of their 
		//radius' is greater than or equal to the distance
		//between their centers.
		circle3.setX(99.0);
		circle3.setY(99.0);
		circle3.setRadius(2.0);
		System.out.print("Area of circle3: ");
		System.out.println(circle3.getArea());
		System.out.println();
		// overlap test
		System.out.println(circle1.doesOverlap(circle2));
		System.out.println(circle1.doesOverlap(circle3));
		System.out.println(circle2.doesOverlap(circle3));
	}

}
