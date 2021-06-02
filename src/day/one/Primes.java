package day.one;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int num = scnr.nextInt();
		int num2 = scnr.nextInt();
		for (int i = num; i < num2; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

		scnr.close();
	}
	
	private static boolean isPrime(int num) {
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
