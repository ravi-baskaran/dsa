package dsa;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = { 12, 5, 1, 6, 8, 12, 7 };

		System.out.println(Arrays.toString(twoSum(arr, 13)));

	}

	static int[] twoSum(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;

	}

}
