package day.one;

import java.util.Scanner;

public class SwapWithoutTemp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int x = scnr.nextInt();
		int y = scnr.nextInt();

		x += y;
		y = x - y;
		x = x - y;
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
		scnr.close();

	}
}
