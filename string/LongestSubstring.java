package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		String str = "abcdabcdefghabcdef";

		System.out.println(longestSubString(str));

	}

	static String longestSubString(String str) {

		Set<Character> set = new HashSet<>();

		char[] ch = str.toCharArray();

		String currentLongestSubString = "";
		String overallLongestSubString = "";

		for (char c : ch) {

			if (set.contains(c)) {
				set.clear();
				currentLongestSubString = "";
			}
			set.add(c);
			currentLongestSubString = currentLongestSubString + c;

			if (currentLongestSubString.length() > overallLongestSubString.length()) {
				overallLongestSubString = currentLongestSubString;
			}

		}
		return overallLongestSubString;

	}

}
