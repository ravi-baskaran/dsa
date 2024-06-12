package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "hEllo World";
		
		char[] ch = str.toCharArray();
		
		int upCase = 0;
		
		for(char c : ch) {
			if(c>=65 && c<=90) {
				upCase++;
			}
		}System.out.println(upCase);
		
		
		//System.out.println(removDup(str));

	}
	
	static String removDup(String str) {
		
		Set<Character> set = new HashSet<>();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i =0; i<str.length(); i++) {
			
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				sb.append(str.charAt(i));
			}
			
		}return sb.toString();
		
		
	}

}
