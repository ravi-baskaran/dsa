package LinearSearch;

public class LinearSearchDemo {
	/*
	 *
	 * find min of array find max of array find min/max in between rangeh
	 */

	public static void main(String[] args) {

		int[] num = { 12, 1, 24, -36, 47, 13 };

		System.out.println(searchIndex(num, 47));

		 System.out.println(findMin(num));

	}

	static int searchIndex(int[] a, int target) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				return i;
			}
		}
		return -1;

	}

	static int findMin(int[] a) {

		if (a.length == 0) {
			return Integer.MIN_VALUE;
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;

	}

}
