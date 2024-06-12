package arrays;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		String[] arr = {"grapes", "banana", "apple", "orange"};
		
	
		
		int[] a = {3,5,1,4,15,7,9};

		sortString(arr);
		sortIntArray(a);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(a));

	}
	
	static void sortString(String[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[i].compareToIgnoreCase(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
	}
	
	static void sortIntArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j =0+i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
	}
	
	
	

}
