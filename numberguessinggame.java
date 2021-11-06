package cs111b;
import java.util.Scanner;

public class numberguessinggame {
static Scanner scnr = new Scanner(System.in);

		public static int getRandomNum() {
			// prompts user for a integer guess between 1 and a 100
			System.out.println("Guess a number from 1 to 100: ");
			int user_guess = scnr.nextInt();
			// checks that user guess is in the correct range
			while (user_guess < 1 || user_guess > 100) {
				System.out.println("Try again. Guess a number from 1 to 100: ");
				user_guess = scnr.nextInt();
			}
			return user_guess;
		}
		
		public static void guess(int current_guess) {
			// takes most recent guess and tries another guess
			// might need to break into a lower guesser and a higher guesser
			int upper = 100;
			int lower = 1;
			char correct;
			correct = 'c';
			// while loop executes until user enters 'c' for correct
			while(correct == 'l' || correct == 'h' || correct == 'c') {
				current_guess = (upper + lower) / 2;
				System.out.print("Is it " + current_guess + "? (h/l/c): ");
				correct = scnr.next().charAt(0);
				System.out.println("");
				// the below reassigns upper or lower (binary search algorithm)
				// note: program breaks when user incorrectly enters 'h' when 
				// input should have been 'l' and vice versa because the 
				// range that the correct guess is in will be removed
				if (correct == 'h') {
					lower = current_guess;
				}
				else if (correct == 'l') {
					upper = current_guess;
				}
				else if (correct == 'c'){
					System.out.print("Great! ");
					break;
				}
			}
		}
		
		public static int playOneGame() {
			// collects and executes methods above
			guess (getRandomNum());
			return -1;
		}
		
		public static boolean shouldPlayAgain() {
			// prompts to execute playOneGame again
			boolean play_again = true;
			// i want the input to be in an execute statement to keep the method clean 
			// and executing a single task, we'll see
			System.out.println("Do you want to play again? ");
			System.out.print("(y/n): ");
			/////////////////////////////////////////////////////////////
			char answer = scnr.next().charAt(0);
			if (answer == 'y') {
				return true;
			}
			else {
				System.out.println("See you next time, Goodbye.");
				return false;
			}
			
		}
		
	

	public static void main(String[] args) {
		do {

		playOneGame();

		} while (shouldPlayAgain());
		
	}

}
