package arrays;

import java.util.Arrays;

public class SqSorted {

	public static void main(String[] args) {
		
		int[] ar = {-6, -3, -1, 3, 6, 9};
		
		System.out.println(Arrays.toString(sqSort(ar)));

	}
	
	static int[] sqSort(int[] arr) {
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		
		for(int i=0; i< arr.length; i++) {
			for(int j=1; j< arr.length; j++) {
				if(arr[j] < arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}return arr;
		
	}

}
