package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 4, 4, 6, 8 };

//		Set<Integer> set = new LinkedHashSet<>();
//
//		for (int i : arr) {
//			set.add(i);
//		}

		// System.out.println(set);
		
		/////////doubt/////////////

		
		int num = removeDup(arr);
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static int removeDup(int[] arr) {
		
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
				arr[j++] = arr[arr.length - 1];
			}
		}
		return j;
		
	}
	
	
	

}
