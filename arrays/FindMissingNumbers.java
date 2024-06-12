package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumbers {

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,8,9,3,4,2,5};

		//missing(arr);	
		
		findDup(arr);
		
	}
	
	static void findDup(int[] arr) {
		
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
	}
	
	
	
	static void missing(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		
		for(Integer n : arr) {
			set.add(n);
		}
		
		int min = Collections.min(set);
		int max = Collections.max(set);
		
		for(int i = min; i<=max; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
		
	}

}
