package recursion;

import java.util.Arrays;

public class RotatedArraySearch {

	public static void main(String[] args) {

		// Note: have this two case in mind
	//	int[] arr = { 6, 7, 1, 2, 3, 4, 5 };
		 int[] arr = {5,6,7,8,9,1,2,3,4};
		 
		 System.out.println(search(arr, 1));
		

	}

	
	 static int search(int[] nums, int target) {
		
		 return findRotatedRecursion(nums, target, 0, nums.length-1);
	 }

	static int findRotatedRecursion(int[] arr, int target, int start, int end) {

		if (start > end) {
			return -1;
		}

		int mid = start + (end - start) / 2;

		if (target == arr[mid]) {
			return mid;
		}

		if (arr[start] <= arr[mid]) {
			if (target >= arr[start] && target <= arr[mid]) {
				return findRotatedRecursion(arr, target, start, mid - 1);
			} else {
				return findRotatedRecursion(arr, target, mid + 1, end);
			}
		} else {

			if (target >= arr[mid] && target <= arr[end]) {
				return findRotatedRecursion(arr, target, mid + 1, end);
			} else {
				return findRotatedRecursion(arr, target, start, mid - 1);
			}

		}
	}

}
