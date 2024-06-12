package string;

public class FindFirstCharInString {

	public static void main(String[] args) {

		String str = "lets start this practice";

		getFirstLetter(str);

	}

	static void getFirstLetter(String str) {

		String[] split = str.split(" ");

		for (String s : split) {
			System.out.println(s.charAt(0));
		}

	}

}
