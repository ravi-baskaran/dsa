package arrays;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 0, 12, 0, 3, 11, 0 };

		System.out.println(Arrays.toString(moveZero(arr)));

	}

	static int[] moveZero(int[] arr) {

		int[] newArr = new int[arr.length];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				newArr[j++] = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 1) {
				newArr[j++] = arr[i];
			}
		}
		return newArr;

	}

}
