package recursion;

import java.util.ArrayList;

public class ReturnAllIndex {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 4, 8, 7 };

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(getAllIndex(arr, 4, 0, list));

	}

	static ArrayList<Integer> getAllIndex(int[] arr, int target, int i, ArrayList<Integer> list) {

		if (i == arr.length) {
			return list;
		}
		if (arr[i] == target) {
			list.add(i);
		}

		return getAllIndex(arr, target, i + 1, list);

	}

}
