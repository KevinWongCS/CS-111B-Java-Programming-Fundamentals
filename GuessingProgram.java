package cs111b;
import java.util.Scanner;

public class GuessingProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// parameters
		int min = 1;
		int max = 10;
		int currentGuess = 0;
		char answer = 'y';
		char again = 'y';
		
		// original NumberGuesser
//		NumberGuesser guesser = new NumberGuesser(min, max);
		
		// New subclass RandomNumberGuesser
		RandomNumberGuesser guesser = new RandomNumberGuesser(min, max);
		
//		// main logic for guessing game
		while (true) {
			System.out.println("Think of a number from " + min + " to " + max);
			while (answer != 'c') {
				currentGuess = guesser.getCurrentGuess();
				System.out.print("Is the number " + currentGuess + "? (h/l/c): ");
				System.out.print("");
				
				answer = scnr.next().charAt(0);
				if (answer == 'h') {
					guesser.higher();
				}
				else if (answer == 'l') {
					guesser.lower();
				}
			}
			// guessing game completed output
			System.out.println("You picked " + currentGuess + ". Great pick it!");
			// Play again option?
			System.out.println("Do you want to play again? (y/n): ");
			again = scnr.next().charAt(0);
			if (again != 'n') {
				guesser.setLowerUpper(min, max);
				answer = 'y';	
			}
			else if (again == 'n'){
				System.out.println("Good bye.");
				break;
			}
		}
		
		// TEST BENCH
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println("");
//		guesser.lower();
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println("");
//		guesser.higher();
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println(guesser.getCurrentGuess());
//		System.out.println("");
		

	}

}
