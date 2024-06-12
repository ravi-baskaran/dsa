package string;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "avaj";
		
		String sort = "november";
		
		char[] ch = sort.toCharArray();
		
		Arrays.sort(ch);
		System.out.println(new String(ch));

		System.out.println(isAnagram(s1, s2));

	}

	static boolean isAnagram(String str1, String str2) {

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}
	
	

}
