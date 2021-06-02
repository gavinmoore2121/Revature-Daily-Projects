package day.one;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		
		System.out.println("Quotient = " + (x/y));
		System.out.println("Remainder = " + (x%y));
		
		scnr.close();
	}
}
