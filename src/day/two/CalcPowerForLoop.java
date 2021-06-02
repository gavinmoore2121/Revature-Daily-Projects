package day.two;

public class CalcPowerForLoop {

	public static void main(String[] args) {
		System.out.println(calcPower(2, 5));
		System.out.println(calcPower(3, -2));

	}
	
	public static double calcPower(int num, int power) {
		double product = 1;
		for (int i=0; i < Math.abs(power); i++) {
			product = num * product;
		}
		if (power < 0) {
			return 1/product;
		}
		return product;
	}

}
