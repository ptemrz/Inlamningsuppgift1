public class GuessingGame {
	
	public static void main(String[] args) {
		
		IntervalParser range = new IntervalParser(args);
		
		if (!range.couldParse()) {
			System.err.println(range.getErrorMessage());
			usage();
			System.exit(range.getErrorCode());
		}
		
		Guesser guesser = new Guesser(range.low(),range.high());
		guesser.start();
	}
	
	private static void usage() {
		System.out.println("Usage: java GuessingGame low high\n"+
				"where low is an integer for the lower bound\n"+
				"and high is an integer for the upper bound\n"+
				"of the interval for the numbers of the GuessingGame");
		
	}
}
