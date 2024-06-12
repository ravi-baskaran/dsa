package string;

public class PrintAllSubstrings {

	public static void main(String[] args) {

		String str = "ravi";
		String str1 = "ravi is great";

		printSubstring(str);

	}

	static void printSubstring(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}

	}

}
