package utilities;

import java.util.Scanner;

public class StandardInput {
	
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		String[] input = getInput();
		for (String word: input) {
			System.out.print(word + " ");
		}
		scnr.close();
	}
	
	/**
	 * Generic input method, using a static Scanner object to read 
	 * @return A line of user input and return it as an Array of whitespace-space separated Strings in lower case.
	 */
	private static String[] getInput() {
		return scnr.nextLine().toLowerCase().split(" ");
	}
	
	
}
