package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 45, 12, 33, 23, 9 };
		reverse(arr1);
		System.out.println(Arrays.toString(arr1));

		Scanner input = new Scanner(System.in);

		int[] arr = new int[5];

//		for(int i =0; i<arr.length; i++) {
//			
//			arr[i] = input.nextInt();
//			
//		}

		// print using toString

		// System.out.println(Arrays.toString(arr));

		// print using enhansed for loop

//		for(int a : arr){
//			System.out.print(a + " ");
//		}

		/////////////////////////////////////////////////////////////////////////////
		// 2D ARRAY

		int[][] arr2 = new int[3][3];

		for (int row = 0; row < arr2.length; row++) {

			for (int col = 0; col < arr2[row].length; col++) {
				arr2[row][col] = input.nextInt();
			}

		}

		// print
		for (int[] a : arr2) {
			System.out.println(Arrays.toString(a));
		}

	}

	static void reverse(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		for (int i = start; i < end; i++) {
			for (int j = start; j < end; j++) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}

		}

	}

}
