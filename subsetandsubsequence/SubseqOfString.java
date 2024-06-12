package subsetandsubsequence;

import java.util.ArrayList;

public class SubseqOfString {

	public static void main(String[] args) {

		String str = "abc";
		subseq(str, "");

	}

	static void subseq(String s, String ans) {

		if (s.isEmpty()) {
			System.out.println(ans);
			return;
		}

		subseq(s.substring(1), ans + s.charAt(0));
		subseq(s.substring(1), ans);

	}
	
	

}
