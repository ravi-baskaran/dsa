package LinearSearch;

public class LinearSearchString {

	public static void main(String[] args) {
		
		String s = "ravi";
		
		System.out.println(isCharPresent(s, 'l'));

	}
	
	static boolean isCharPresent(String str, char target) {
		
		if(str==null) {
			return false;
		}
		
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == target) {
				return true;
			}
		}return false;
		
		
	}

}
