package arrays;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {2,5,6,8,8,12,12,24};
		duplicate(arr);

	}
	
	static void duplicate(int[] arr) {
		
		int j =0;
		
		for(int i=0; i< arr.length-1; i++) {
			
			if(arr[i] != arr[i+1]) {
				arr[j] = arr[i];
				j++;
			}
			
		}
		
		arr[j] = arr[arr.length-1];
		j++;
		
		for(int i=0; i<j; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	

}
