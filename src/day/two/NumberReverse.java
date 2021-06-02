package day.two;

public class NumberReverse {
	public static void main(String[] args) {
		System.out.println(reverseAnInt(321));
		System.out.println(reverseAnInt(7));
		System.out.println(reverseAnInt(52923));
		System.out.println(reverseAnInt(-17));
	}
	
	public static int reverseAnInt(int num) {
		int reversedNum = 0;
		int nextDigit;
		while (num != 0) {
			nextDigit = num%10;
			reversedNum = reversedNum*10 + nextDigit;
			num = (num - nextDigit) / 10;
		}
		return reversedNum;
	}
}
