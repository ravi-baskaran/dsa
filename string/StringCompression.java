package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {

	public static void main(String[] args) {

		String str = "aabbbccccdd";

		System.out.println(stringCompression(str));

	}

	static String stringCompression(String str) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		char[] ch = str.toCharArray();

		for (char c : ch) {

			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);

		}

		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		return sb.toString();

	}

}
