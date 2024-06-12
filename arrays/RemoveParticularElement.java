package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveParticularElement {

	public static void main(String[] args) {
		
		int[] arr = {2,4,2,2,5,7,9,8};
		
		int[] sub = {2,4,2,5,6,7,8,9,2,4};
		
		System.out.println(Arrays.toString(rmo(arr, 9)));
		
		//System.out.println(subarr(sub));

	}
	
//	static List<Integer> subarr(int[] arr) {
//		
//		Set<Integer> set = new LinkedHashSet<>();
//		
//		List<Integer> current = new ArrayList<>();
//		List<Integer> ovrall = new ArrayList<>();
//		
//		for(Integer i : arr) {
//			if(set.contains(i)) {
//				set.clear();
//				current.clear();
//			}
//			
//			set.add(i);
//			current.add(i);
//			ovrall.add(i);
//		}
//		
//		if(ovrall.size()>current.size()) {
//			return ovrall;
//		}return current;
//		
//		
//	}
	
	static int[] rmo(int[] arr, int target) {
		
		int j=0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] != target) {
				arr[j++] = arr[i];
			}
		}return Arrays.copyOf(arr, j);
		
	}

}
