package bubbleSort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {

		int[] arr = { 12, 5, 1, 6, 8, 12, 7 };

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {

				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
