package string;

import java.util.Arrays;

public class SwapChar {

	public static void main(String[] args) {
		String str = "HelloRavi";
		
		String str1 = "HelloRavi";
		
		String s = "0000034232";
		
		System.out.println(swap(str));
		
		System.out.println(sort(str));
		
		System.out.println(isEqual(str, str1));

	}
	static boolean isEqual(String str, String str1) {
		
		if(str.length() != str1.length()) {
			return false;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != str1.charAt(i)) {
				return false;
			}
		}return true;
		
	}
	
	static String sort(String str) {
		char[] ch = str.toLowerCase().toCharArray();
		
		Arrays.sort(ch);
		return new String(ch);
	}

	
	static String swap(String str) {
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length-1; i=i+2) {
			char temp = ch[i+1];
			ch[i+1] = ch[i];
			ch[i]=temp;
			
		}return new String(ch);
		
		
	}
}
