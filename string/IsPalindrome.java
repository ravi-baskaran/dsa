package string;

public class IsPalindrome {

	public static void main(String[] args) {

		String str = "121321";

		String s = "hello my world";

		System.out.println(isPalindrome(str));

		int n1 = 0;
		int n2 = 1;
		int sum = 0;

		System.out.print(n1 + " " + n2);

		for (int i = 2; i <= 10; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
		System.out.println();

		System.out.println(rvFullWord(s));

	}

	static String rvFullWord(String str) {

		String[] split = str.split(" ");

		String revResult = "";

		for (int i = split.length - 1; i >= 0; i--) {
			revResult = revResult + split[i] + " ";
		}

		return revResult;

	}

	static String revEach(String str) {

		String[] split = str.split(" ");

		String revResult = "";

		for (String s : split) {
			String revWord = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				revWord = revWord + s.charAt(i);
			}
			revResult = revResult + revWord + " ";

		}
		return revResult;

	}

	static boolean isPalindrome(String str) {

		int start = 0;
		int end = str.length() - 1;

		for (int i = start; i < end; i++) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

}
