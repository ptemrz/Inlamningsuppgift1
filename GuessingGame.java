public class GuessingGame {
	
	public static void main(String[] args) {
		
		int low = 0;
		int high= 1000;
		
		if (args.length == 2) {
			low = Integer.parseInt(args[0]);
			high= Integer.parseInt(args[1]);

		} else if (args.length > 0) {
			System.out.println("Incorrect number of arguments to main()");
			System.exit(1);
		}
		
		Guesser guesser = new Guesser(low,high);
		guesser.start();
	}
}
