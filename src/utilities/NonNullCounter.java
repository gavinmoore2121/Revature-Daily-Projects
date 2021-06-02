package utilities;

public class NonNullCounter {

	public static void main(String[] args) {
		Integer[] integers = new Integer[5];
		integers[2] = 3;
		System.out.println(countNonNullEntries(integers));
	}
	
	/**
	 * Generic method to count the number of non-null entries in an array.
	 * @param <T>: Generic type parameter. Functions with any Object.
	 * @param arrayToCount: The array of Objects to count.
	 * @return an integer count of non-null entries.s
	 */
	public static <T> int countNonNullEntries(T[] arrayToCount) {
		int counter = 0;
		for (T object: arrayToCount) {
			if (object != null) {
				counter++;
			}
		}
		return counter;
	}
	

}
