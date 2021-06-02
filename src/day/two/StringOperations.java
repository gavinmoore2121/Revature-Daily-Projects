package day.two;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		String sample = "This is a demonstration string.";
		System.out.println("String has " + sample.split(" ").length + " words.");
		System.out.println("String has an occurance of 'a' at index: " + sample.indexOf('a'));
		System.out.println("The string with no spaces: " + sample.replaceAll(" ", ""));
		
		System.out.println("\nPalindrome checks: ");
		String palindromeSample = "Demonstration string gnirts noitartsnomeD";
		System.out.println(checkPalindrome(sample));
		System.out.println(checkPalindrome(palindromeSample));
		
		System.out.println("\nWord size demo:");
		findShortestAndLongestWord(sample);
		
		System.out.println("\nString sorted alphabetically: ");
		String[] splitString = sample.split(" ");
		// Use function to convert to lower case before comparing alphabetically.
		Arrays.sort(splitString, (a, b) -> a.toLowerCase().compareTo(b.toLowerCase()));
		// Print all words in order.
		for (String str: splitString) {
			System.out.print(str + " ");
		}
	}
	
	public static boolean checkPalindrome(String str) {
		// Get first half.
		String firstHalf = str.substring(0, str.length() / 2);
		// Get second half, skipping the middle character.
		String secondHalf = str.substring(str.length() % 2 + str.length() / 2);
		
		// Reverse the second half using the StringBuilder class.
		secondHalf = new StringBuilder(secondHalf).reverse().toString();
		
		// Check if similar.
		if (firstHalf.equals(secondHalf)) return true;
		return false;
	}
	
	public static void findShortestAndLongestWord(String str) {
		String[] splitStr = str.split(" ");
		Arrays.sort(splitStr, (a, b) -> Integer.compare(a.length(), b.length()));
		
		System.out.println("Smallest word: " + splitStr[0] + " with " 
		+ splitStr[0].length() + " characters.");
		
		System.out.println("Longest word: " + splitStr[splitStr.length - 1] + " with " 
				+ splitStr[splitStr.length - 1].length() + " characters.");
	}

}
