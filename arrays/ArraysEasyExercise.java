package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArraysEasyExercise {

	/*
	 * swap 2 numbers find largest number in array find largest number in a range of
	 * array reverse an array
	 */

	public static void main(String[] args) {

		int[] arr = { 2, 45, 3, 23, 12 };
	

		// swap(arr, 0, 4);

		// System.out.println(lar(arr));

		//reverse(arr);

		//System.out.println(Arrays.toString(arr));

		// System.out.println(Arrays.toString(arr));

	}

	static void reverse(int[] s) {

		int start = 0;
		int end = s.length - 1;

		while (start < end) {
			swap(s, start, end);
			start++;
			end--;
		}

	}

	static void swap(int[] a, int startIn, int endIn) {

		int temp = a[startIn];

		a[startIn] = a[endIn];

		a[endIn] = temp;
	}
	
	

	static int lar(int[] a) {

		int lar = 0;
		if (a.length != 0) {

			for (int i = 1; i < a.length - 1; i++) {

				if (a[i] > lar) {
					lar = a[i];
				}
			}
			return lar;

		} else {
			return -1;
		}

	}

}
