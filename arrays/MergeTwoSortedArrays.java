package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = { 2, 13, 22, 28 };
		int[] arr2 = { 1, 3, 9, 13, 22, 25, 27 };
		
		System.out.println(Arrays.toString(merge(arr1, arr2)));

	}

	static int[] merge(int[] arr1, int[] arr2) {

		int[] mix = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				mix[k] = arr1[i];
				i++;
			} else {
				mix[k] = arr2[j];
				j++;
			}
			k++;

		}

		while (i < arr1.length) {
			mix[k] = arr1[i];
			i++;
			k++;

		}
		while (j < arr2.length) {
			mix[k] = arr2[j];
			j++;
			k++;

		}
		return mix; 

	}

}
