package arrays;

import java.util.Arrays;
import java.util.List;

public class CommonElementsInArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,4,6,7};
		int[] arr2 = {9,6,3,2,12};
		
		
		
		commonElements(arr1, arr2);
	}
	
	static void commonElements(int[] arr1, int[] arr2) {
		
		for(int i =0; i<arr1.length; i++) {
			for(int j=0; j< arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		
	}

}
