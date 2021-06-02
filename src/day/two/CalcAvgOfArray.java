package day.two;

public class CalcAvgOfArray {

	public static void main(String[] args) {
		double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0};
		System.out.println(calcAverageOfArray(arr));
		double[] arr2 = {-1.0, 1.0, -2.0, 2.0, -3.0};
		System.out.println(calcAverageOfArray(arr2));

	}
	
	public static double calcAverageOfArray(double[] nums) {
		double sum = 0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		return sum/nums.length;
	}

}
