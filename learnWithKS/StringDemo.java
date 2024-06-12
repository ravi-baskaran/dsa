package learnWithKS;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDemo {

	public static void main(String[] args) {

		String s = "Hello my name is ravi";

//		String[] s = str.split(" ");
//
//		for (String st : s) {
//			int len = st.length();
//			System.out.println(st + "->" + len);
//		}

		// System.out.println(revUsingRecursion(s));

		revWordsInString(s);

	}

	static String revUsingRecursion(String str) {

		if (str == null || str.length() <= 1) {
			return str;
		}

		return revUsingRecursion(str.substring(1)) + str.charAt(0);
	}

	static void revWordsInString(String str) {

		String[] s = str.split(" ");

		for (int i = s.length - 1; i >= 0; i--) {
			System.out.println(s[i]);
		}

	}

}
