package GridWriter;

public class GridWriterProgram {
	
	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);
		
		gw.add(new MyCircle(10, 10, 9));
		gw.add(new MyCircle(25, 20, 12));
		gw.add(new MyCircle(25, 20, 5));
		
		gw.add(new MyRectangle(25, 25, 20, 15));
		gw.add(new MyRectangle(5, 5, 3, 4));
		gw.add(new MyRectangle(40, 0, 10, 10));
		
		gw.add(new MySquare(25, 25, 20));
		gw.add(new MySquare(5, 5, 3));
		gw.add(new MySquare(40, 0, 10));
		
//		gw.display();
		
		// printing size of array of GridItem's
		System.out.println("Size of array: " + gw.size());
		
		// printing areas 
		for (int i = 0; i < gw.size(); i++) {
	        try {
				System.out.println(gw.get(i).getArea());
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		// out of range index 
			try {
				System.out.println(gw.get(10));
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

	}
}