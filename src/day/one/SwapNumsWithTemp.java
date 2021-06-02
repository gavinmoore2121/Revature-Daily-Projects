package day.one;

import java.util.Scanner;

public class SwapNumsWithTemp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
		scnr.close();

	}

}
