package cs111b;

public class Circle2 {
	// aggregation
	Point center;
	double r;
	
	// constructor
	// lazy copy
	public Circle2 (Point center, double r) {
		this.center = center;
		this.r = r;
	}
	// center setter and getter
	public void setCenter(Point p) {
		// shallow copy
		this.center.setX(p.getX());
		this.center.setY(p.getY());
	}
	public Point getCenter() {
		return center;
	}
	
	// x setter and getter
	public void setX(double x) {
		this.center.setX(x);
	}
	public double getX() {
		return center.getX();
	}
	
	// y setter and getter
	public void setY(double y) {
		center.setY(y);
	}
	public double getY() {
		return center.getY();
	}

	// radius setter and getter
	public void setRadius(double r) {
		this.r = r;
	}
	public double getRadius() {
		return r;
	}
	
	// area
	public double getArea() {
		double area = Math.PI * Math.pow(r, 2);
		return area;
	}
	
	// string toString()
	public String toString() {
		return "Circle x: " + this.center.getX() + ", y: " + this.center.getY() + ", radius: " + this.r;
	}
	
	// do two circles have the same parameters 
	public boolean equals(Circle2 otherCircle) {
		if ((this.getX() == otherCircle.getX())&&(this.getY() == otherCircle.getY())&&(this.r == otherCircle.getRadius())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// does this circle over the other circle instance
	// Note: two circles overlap if the sum of their 
	//radius' is greater than or equal to the distance
	//between their centers.
	public boolean doesOverlap(Circle2 otherCircle) {
		if ((this.getRadius() + otherCircle.getRadius()) >= this.center.distanceTo(otherCircle.getCenter())) {
			return true;
		}
		else {
			return false;
		}
	}
}
