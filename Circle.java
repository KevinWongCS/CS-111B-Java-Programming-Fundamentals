package cs111b;

public class Circle {
	private double x;
	private double y;
	private double radius;
	
	// setters
	public void setX(double X) {
		x = X;
	}
	public void setY(double Y) {
		y = Y;
	}
	public void setRadius(double Radius) {
		radius = Radius;
	}
	
	// getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	// overlap
	public boolean doesOverlap(Circle otherCircle) {
		if ((radius + otherCircle.radius) >= Math.sqrt(Math.pow(x - otherCircle.x, 2) + Math.pow(y - otherCircle.y, 2))) {
			return true;
		}
		else {
			return false;
		}
	}
}
