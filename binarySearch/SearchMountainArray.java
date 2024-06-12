package binarySearch;

public class SearchMountainArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 1 };

		System.out.println(search(arr, 1));

	}

	static int search(int[] arr, int target) {

		int peek = findPeek(arr);

		int firstTry = orderAgnostic(arr, target, 0, peek);

		if (firstTry != -1) {
			return firstTry;
		}
		return orderAgnostic(arr, target, peek + 1, arr.length - 1);

	}

	static int findPeek(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (mid > mid + 1) {
				end = mid;
			} else {
				start = mid + 1;
			}

		}
		return start;

	}

	static int orderAgnostic(int[] arr, int target, int start, int end) {

		boolean isAsec = arr[start] < arr[end];

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (isAsec) {

				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					start = mid + 1;
				} else {
					return mid;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;

				} else if (target < arr[mid]) {
					start = mid + 1;
				} else {
					return mid;
				}
			}

		}
		return -1;

	}

}
