package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {

	public static void main(String[] args) {
		
		int[] arr= {2,3,4};
		
		String s = "abc";
		
		//System.out.println(subsets(arr));
		System.out.println(subsetString(s));

	}
	
	static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int num : nums) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                List<Integer> curr = new ArrayList<>(res.get(i));
                curr.add(num);
                res.add(curr);
            }
        }
        return res;
    }
	
	static List<List<Character>> subsetString(String s) {
        List<List<Character>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (char c : s.toCharArray()) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Character> curr = new ArrayList<>(outer.get(i));
                curr.add(c);
                outer.add(curr);
            }
        }
        return outer;
    }

}
