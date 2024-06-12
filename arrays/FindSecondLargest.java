package arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] arr = { 2, 45, 3, 23, 12 };

		System.out.println(seconSmallest(arr));

	}

	static int secondLargest(int[] arr) {

		int max1 = 0;
		int max2 = 0;
		if (arr[0] > arr[1]) {
			max1 = arr[0];
			max2 = arr[1];
		} else {
			max1 = arr[1];
			max2 = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}
			if (arr[i] > max2) {
				max2 = arr[i];
			}

		}
		return max2;

	}

	static int seconSmallest(int[] arr) {

		int min1 = 0;
		int min2 = 0;
		if (arr[0] < arr[1]) {
			min1 = arr[0];
			min2 = arr[1];
		} else {
			min1 = arr[1];
			min2 = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] < min1) {
				min2 = min1;
				min1 = arr[i];
			}
			if (arr[i] < min2) {
				min2 = arr[i];
			}

		}
		return min2;

	}

}
