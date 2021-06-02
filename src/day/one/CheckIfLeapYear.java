package day.one;

import java.util.Scanner;

public class CheckIfLeapYear {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int year = scnr.nextInt();
		if (year % 4 == 0) {
			System.out.println("Leap year.");
		}
		else System.out.println("Not a leap year.");
		
		scnr.close();

	}

}
