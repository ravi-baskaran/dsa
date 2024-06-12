package arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMajoriyElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {2,3,2,4,7,7,2,2,2,2,2};
		
		System.out.println(majorityElement(arr, arr.length));

	}
	
	static int majorityElement(int[] arr, int size) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int a : arr) {
			map.put(a, map.containsKey(a) ? map.get(a)+1 :1);
		}
		
		for(Entry<Integer, Integer> entry :map.entrySet()) {
			
			if(entry.getValue()>size/2) {
				return entry.getKey();
			}
			
		}return -1;
		
//		return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//				.findFirst().map(Map.Entry::getKey).get();
		
	}

}
