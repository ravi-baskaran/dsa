package recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 12, 6, 1, 9 };
		bubbleSort(arr, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

	static void bubbleSort(int[] arr, int len) {

		if (len == 1) {
			return;
		}

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

		}
		bubbleSort(arr, len - 1);

	}

}
