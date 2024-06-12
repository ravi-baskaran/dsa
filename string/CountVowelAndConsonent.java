package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountVowelAndConsonent {

	public static void main(String[] args) {

		String str = "hello world";

		//count(str);
		
		String[] splt = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s : splt) {
			sb.append(s);
			
		}//System.out.println(sb.reverse());
		
		List<String> s = Arrays.stream(splt).map(e -> new StringBuilder(e).reverse().toString()).collect(Collectors.toList());

		System.out.println(s);
	}

	private static void count(String str) {

		int vowelCount = 0;
		int consonentCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				vowelCount++;
			} else {
				consonentCount++;
			}
		}

		System.out.println(vowelCount);
		System.out.println(consonentCount);

	}

	private static boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}

}
