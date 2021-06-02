package day.one;

import java.util.Scanner;

public class ReadAndPrintISBN {
	public static void main(String[] args) {
		
	}
	
	public static void getAndPrintInfo() {
		Scanner scnr = new Scanner(System.in);
		
		long isbn = scnr.nextLong();
		// Correct whitespace.
		scnr.nextLine();
		String name = scnr.nextLine();
		String author = scnr.nextLine();
		double price = scnr.nextDouble();
		int numPrinted = scnr.nextInt();
		
		System.out.println("ISBN: " + isbn);
		System.out.println("Name: " + name);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		System.out.println("Number printed: " + numPrinted);
		
		scnr.close();
	}
}
