package cs111b;

public class Circle2Tester {

	public static void main(String[] args) {
//		TEST BENCH
//__________________________________________________________________//
//    	Creating Point instances
		Point testPoint1 = new Point(1.0, 4.0);
		Point testPoint2 = new Point(99.0, 65.0);

//		System.out.println(testPoint1.distanceTo(testPoint2));
		
//		Creating Circle2 instances
		Circle2 testCircle1 = new Circle2(testPoint1, 2.0);
		Circle2 testCircle2 = new Circle2(testPoint2, 2.0);

//		Testing get methods
		System.out.println("Test for get methods/ circle 1: " + "x: " + testCircle1.getX() + ", y: " + testCircle1.getY() + ", radius: " + testCircle1.getRadius());
		System.out.println("Test for get methods/ circle 2: " + "x: " + testCircle2.getX() + ", y: " + testCircle2.getY() + ", radius: " + testCircle2.getRadius());

//		Testing set methods	
//		testCircle1.setCenter(testPoint2);
//		testCircle2.setCenter(testPoint1);

//		Testing getCenter()
		System.out.println("Test for getCenter(): " + testCircle1.getCenter());

//		Testing toString()
		System.out.println("Test for toString(): " + testCircle1);

//  	Testing equals()
		System.out.println("Test for equals(): " + testCircle1.equals(testCircle2));

//  	Testing getArea()
		System.out.println("Test for getArea(): " + testCircle1.getArea());

//		Testing doesOverlap()
		System.out.println("Test for doesOverlap(): " + testCircle1.doesOverlap(testCircle2));
	}

}
