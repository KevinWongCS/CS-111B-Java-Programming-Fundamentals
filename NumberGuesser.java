package cs111b;

public class NumberGuesser {
	// how this class is meant to be used:
	// Guesses an integer for a given range by finding the midpoint
	// between the range, if the guess is incorrect the range is
	// updated and the loop continues
	protected int lower;
	protected int upper;
	protected int currGuess;
	protected boolean lowerupperexecution = true;
	
	// constructor
	public NumberGuesser(int lowerBound, int upperBound) {
		this.lower = lowerBound;
		this.upper = upperBound;
	}
	
	// set parameters
	// I used this to reset the game instead of the reset() method
	public void setLowerUpper(int lower, int upper) {
		this.lower = lower;
		this.upper = upper;
		lowerupperexecution = true;
	}
	
	// returns the current guess
	public int getCurrentGuess() {
		currGuess = ((upper + lower) / 2);
		if ((upper - currGuess) == 1) {
			upper += 1;
		}
		return currGuess;
	}
	
	// if user's guess is higher that current guess
	public void higher() {
		lower = currGuess;
		lowerupperexecution = true;
	}
	
	// if user's guess is lower than current guess
	public void lower() {
		upper = currGuess;
		lowerupperexecution = true;
	}
	
	// reset parameters for next game
	public void reset() {
		upper = 100;
		lower = 0;
	}
}
