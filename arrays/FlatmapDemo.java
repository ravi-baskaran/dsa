package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatmapDemo {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 3, 5, 3, 6, 5, 7, 9 };
		Integer[] arr2 = { 2, 3, 6, 7, 0 };
		Integer[] arr3 = { 2, 12, 15, 6 };

		List<Integer> list1 = Arrays.asList(arr1);
		List<Integer> list2 = Arrays.asList(arr2);
		List<Integer> list3 = Arrays.asList(arr3);

		List<List<Integer>> totalList = Arrays.asList(list1, list2, list3);
		Set<Integer> set = new HashSet<>();

		List<Integer> list = totalList.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		// list.stream().filter(e -> !set.add(e)).forEach(System.out::println);

		//////////////////////////////////////////////////////////////////////////

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i : arr1) {
			map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);

		}System.out.println(map);

		Integer i = map.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst().get();

		System.out.println(i);

	}

}
