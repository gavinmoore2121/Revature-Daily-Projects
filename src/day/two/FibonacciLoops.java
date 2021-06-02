package day.two;

public class FibonacciLoops {
	public static void main(String[] args) {
		
		// Var to control how many Fib. nums are printed out.
		final int numsToPrint = 20;
		
		// Initialize the sequence
		int numberOneBack = 1;
		int numberTwoBack = 1;
		int nextNum;
		
		// Print initialized sequence
		System.out.print(numberOneBack + " " + numberTwoBack + " ");
		
		// Main loop
		for (int i=2; i<numsToPrint; i++) {
			nextNum = numberOneBack + numberTwoBack;
			System.out.print(nextNum + " ");
			numberTwoBack = numberOneBack;
			numberOneBack = nextNum;
		}
	}
}
