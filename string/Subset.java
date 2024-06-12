package string;

import java.util.Arrays;

public class Subset {

	public static void main(String[] args) {
		String s = "abcade";
		String s1 = "is my apple a good apple";
		String s2 = "MyAppleLaptopHasAApp";
		//System.out.println(rem(s, 'a'));
		 System.out.println(removeRecStringButNot(s2, ""));

	}

	static String removeRec(String str, String ans) {

		if (str.length() == 0) {
			return ans;
		}

		if (str.charAt(0) == 'a') {
			return removeRec(str.substring(1), ans);
		}

		return removeRec(str.substring(1), ans = ans + str.charAt(0));

	}
	
	static String removeRecString(String str, String ans) {

		if (str.length() == 0) {
			return ans;
		}

		if (str.startsWith("Apple")) {
			return removeRecString(str.substring(5), ans);
		}

		return removeRecString(str.substring(1), ans = ans + str.charAt(0));

	}
	
	static String removeRecStringButNot(String str, String ans) {

		if (str.length() == 0) {
			return ans;
		}

		if (str.startsWith("App") && !str.startsWith("Apple")) {
			return removeRecStringButNot(str.substring(3), ans);
		}

		return removeRecStringButNot(str.substring(1), ans = ans + str.charAt(0));

	}

	
	
	
	
	

	

	static String remString(String s, String toRemove) {

		String[] str = s.split(" ");

		StringBuilder sb = new StringBuilder();

		for (String string : str) {
			if (!string.equalsIgnoreCase(toRemove)) {
				sb.append(string + " ");
			}
		}
		return sb.toString().trim();

	}

	static String rem(String str, char c) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != c) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();

	}

}
