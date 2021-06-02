package day.one;

import java.util.Scanner;

public class CheckAlphabet {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		char userChar = scnr.next().charAt(0);
		// switch statement method
		switch(Character.toLowerCase(userChar)) 
		{
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println("User input a vowel."); break;
		default: System.out.println("User did not input a vowel.");
		}
		
		//clean if/else statement method
		if ("aeiou".indexOf(Character.toLowerCase(userChar)) != -1) {
			System.out.println("User input a vowel (if/else).");
		}
		else System.out.println("User did not input a vowel (if/else).");
		
		scnr.close();
	}
}
