package string;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {

		String n = "aab";
		String n1 = "asa";
		String str = "hello my name is ravi";

	//	System.out.println(isPalindrome(n));
		
		//rev(str);
		
		String[] ar = {"apple", "grape", "four", "ab"};
		
		
		
		
		
		
	}

	static boolean isPalindrome(String s) {

		int start = 0;
		int end = s.length() - 1; // 8

		for (int i = 0; i < end; i++) { // 0-7

			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;

		}

		return true;

	}
	
	static void rev(String str) {
		
		String revString = "";
		
		for(int i =str.length()-1; i>=0; i--) {
			revString= revString+str.charAt(i);
		}System.out.println(revString);
		
	}
	


}
