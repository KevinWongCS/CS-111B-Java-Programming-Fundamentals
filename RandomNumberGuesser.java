package cs111b;
import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser{
	Random randGen = new Random();
	//parameters
	protected int N;
	
	
	// constructor
	public RandomNumberGuesser(int lowerBound, int upperBound) {
		super(lowerBound, upperBound);
		
	}

	// note: 
	// overrides getCurrentGuess()
	// inherits setLowerUpper()
	// inherits higher()
	// inherits lower()
	
	
	@Override
	public int getCurrentGuess() {
		if (lowerupperexecution == true) {
			N = upper - lower + 1;
			currGuess = randGen.nextInt(N) + lower;
			// resetting lower() and upper() execution tracker
			lowerupperexecution = false;
			return currGuess;
		}
		return currGuess;
	}
}
