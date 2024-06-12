package string;

public class RotatedStringOrNot {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "bcda";
		
		System.out.println(isRotated(s1, s2));

	}
	
	static boolean isRotated(String org, String rotated) {
		
		if(org == null || rotated ==null) {
			return false;
		}else if(org.length() != rotated.length()){
			return false;
		}else {
			String temp = org+org;
			return temp.contains(rotated);
		}
		
	}

}
