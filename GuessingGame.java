public class GuessingGame {
	
	public static void main(String[] args) {
		
		if (!(args.length == 2)) {
			usage();
			System.exit(1);
		}
		
		int low = Integer.parseInt(args[0]);
		int high= Integer.parseInt(args[1]);
		
		Guesser guesser = new Guesser(low,high);
		guesser.start();
	}
	
	private static void usage() {
		System.out.println("Usage: java GuessingGame low high\n"+
				"where low is an integer for the lower bound\n"+
				"and high is an integer for the upper bound\n"+
				"of the interval for the numbers of the GuessingGame");
		
	}
}
