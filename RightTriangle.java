package cs111b;

public class RightTriangle {

	public static void main(String[] args) {
		// parameters
        int i;
        int y;
        int x;
        

        // upside down right triangle
        // this prints the rows
        for (i = 5; i > 0; i--){
            // this prints characters for each row
            for (x = 0; x < i; x++){
                     System.out.print("*");
            }
            System.out.println();
        }
        

        // right triangle
        // this prints the rows
        for (i = 0; i < 7; i++){
            // this prints characters for each row
            for (x = 0; x < i; x++){
                     System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        

        // upside down pyramid
        // this prints the rows
        for (i = 0; i < 6; i++){
            // this prints characters for each row
            for (x = 0; x < i; x++){
                     System.out.print("?");
            }
            for (x = 6; x > i; x--){
                System.out.print("$");
            }
            for (x = 5; x > i; x--){
                System.out.print("$");
            }

            System.out.println();
        }
        System.out.println();
        
        
        // pyramid
        for (i = 5; i > 0; i--){
            // this prints characters for each row
            for (x = 0; x < i; x++){
                     System.out.print("*");
            }
            for (x = 6; x > i; x--){
                System.out.print("X");
            }
            for (x = 5; x > i; x--){
                System.out.print("X");
            }
            System.out.println();
        }
	}
}
