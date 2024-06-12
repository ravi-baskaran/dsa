package binarySearch;

import java.util.Arrays;

public class StartAndEndIndex {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 12, 12, 12, 12, 12, 88, 91 };
		int target = 12;
		
		int[] searchIndex1 = searchIndex(arr, target);
		
		System.out.println(Arrays.toString(searchIndex1));
	}

	static int[] searchIndex(int[] arr, int target) {
		
		int[] ans = {-1, -1};

		int start = search(arr, target, true);
		int end = search(arr, target, false);
		
		ans[0] = start;
		ans[1] = end;
		
		return ans;
	}
	
	static int search(int[] arr, int target, boolean firstOrLast ) {
		
		int ans =-1;
		
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				ans = mid;
				if (firstOrLast) {
					end = mid-1;
				}else {
					start=mid+1;
				}
			}

		}
		return ans;
		
	}

}
