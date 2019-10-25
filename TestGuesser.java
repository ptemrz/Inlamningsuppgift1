public class TestGuesser {

	public static void main(String[] args){
		System.out.println("Running tests");
		testToString();
		testConstructor();	
	}
	
	private static void testConstructor() {
		int low = 0;
		int high;
		
		for(high = 1; high < 1000000; high *= 10) {
			Guesser g = new Guesser(low,high);
			System.out.print("Guesser("+low+", "+high+"): ");
			System.out.println(g.toString().equals("low: "+low+" high: "+ high) ? "Pass!":"Fail!");
		}
	}
	
	private static void testToString() {
		Guesser g1 = new Guesser(0,1);
		Guesser g2 = new Guesser(0,1);
		
		System.out.print("Guesser(0, 1).toString(): ");
		System.out.println(g1.toString().equals(g2.toString()) ? "Pass!":"Fail!");		
		
	}
	
}
