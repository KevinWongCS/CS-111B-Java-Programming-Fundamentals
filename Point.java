package cs111b;

public class Point {
	// note: this class stores x and y coordinates
    private double x;
    private double y;
    // Point with 2 parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Overload, takes in an-other point
    public Point(Point p) {
        this(p.x, p.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point p) {
        // replace this line with your logic
    	return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

    public boolean equals(Point p) {
        return this.distanceTo(p) < 0.00001;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
