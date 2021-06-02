package day.one;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int num = scnr.nextInt();
		if (num < 0) {
			System.out.println("Negative.");
		}
		else System.out.println("Positive or 0.");

		scnr.close();
	}
}
