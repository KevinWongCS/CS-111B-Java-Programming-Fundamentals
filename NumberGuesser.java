package NumberGuesser;


public class NumberGuesser extends NumberGuesserIllegalStateException{
	
	protected int high;
	protected int low;
	
	private int originalHigh;
	private int originalLow;
	
	public NumberGuesser (int l, int h) {
		super("You are cheating");
		low = originalLow = l;
		high = originalHigh = h;
	}
	
	public int getCurrentGuess() {
		return (high + low) / 2;
	}
	
	public void higher() throws NumberGuesserIllegalStateException {
		low = getCurrentGuess() + 1;
		// TESTING
//		System.out.println("high: " + high);
//		System.out.println("low: " + low);
		
		
		if (high < low) {
			throw new NumberGuesserIllegalStateException("You are cheating");
		}
	}
	
	public void lower() throws NumberGuesserIllegalStateException {
		high = getCurrentGuess() - 1;
		// TESTING
//		System.out.println("high: " + high);
//		System.out.println("low: " + low);
		
		if (high < low) {
			throw new NumberGuesserIllegalStateException("You are cheating");
		}
	}
	
	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}