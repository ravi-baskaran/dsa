package learnWithKS;

import java.util.HashSet;
import java.util.Set;

public class FindMissingElementInArray {

	public static void main(String[] args) {
		
		Integer[] arr = {2,4,1,5,7,8,0};
		
		findMissing(arr);

	}
	
	static void findMissing(Integer[] a) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num :a) {
			set.add(num);
		}
		
		for(int i=0; i<a.length+1; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
			
		}
		
	}

}
