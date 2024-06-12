package binarySearch;

import java.util.Arrays;

public class BinarySearchBasics {

	/*
	 * simple binary search - find target index celing of a given number floor of a
	 * given number
	 */

	public static void main(String[] args) {

		int[] arr = { 2, 17, 4, 12, 24, 33, 42, 57, 88, 91 };
		int target = 12;

		//System.out.println(searchIndex(arr, target));
		
		int[] newArr = new int[arr.length];
		
		System.out.println(Arrays.toString(move(arr, newArr)));

	}

	static int[] move(int[] arr, int newArr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				newArr[j++] = arr[i];
			}

		}
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] %2 !=0) {
				newArr[j++] = arr[i];
			}
		}return newArr;

	}

	static int searchIndex(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;

	}

}
