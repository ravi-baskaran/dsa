package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCharCount {

	public static void main(String[] args) {

		String str = "aaabccdddd";
		
		System.out.println(findFirstNonRepeated(str));

	}

	static char findFirstNonRepeated(String str) {
		
		int[] arr = {1,1,3,4,9};

		Map<Character, Integer> map = new LinkedHashMap<>();
		Set<Integer> set = Collections.<Integer> emptySet();
		//Collections.addAll(set= new HashSet<Integer>(Arrays.asList(arr)));
		//Collections.addAll(set, Arrays.asList(arr));
		//set.addAll(set= new HashSet<Integer>(Arrays.asList(arr)));

		char[] ch = str.toCharArray();

		for (char c : ch) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		
	//	System.out.println(map);
		//To print desc based on values
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

		for (Entry<Character, Integer> entry : map.entrySet()) {

			if(entry.getValue()==1) {
				return entry.getKey();
			}
			
		}throw new RuntimeException("no rep char");

	}

}
