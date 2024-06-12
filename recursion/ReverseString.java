package recursion;

public class ReverseString {

	public static void main(String[] args) {
		
		String str ="java code";
		
		System.out.println(rev(str, "", str.length()-1));

	}
	
	static String rev(String s, String rev, int i) {
		
		if(i<0) {
			return rev;
		}
		
		return rev(s, rev+s.charAt(i), --i);
		
	}

}
