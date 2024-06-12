package binarySearch;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 97, 88, 63, 44, 24, 21, 18, 7 };
		int target = 63;
		
		System.out.println(searchIndex(arr, target));

	}

	static int searchIndex(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		boolean isAsec = arr[start] < arr[end];

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (isAsec == true) {

				if (target > arr[mid]) {
					start = mid + 1;
				} else if (target < arr[mid]) {
					end = mid - 1;
				} else {
					return mid;
				}
			} else {
				if (target < arr[mid]) {
					start = mid + 1;
				} else if (target > arr[mid]) {
					end = mid - 1;
				} else {
					return mid;
				}
			}

		}
		return -1;

	}

}
