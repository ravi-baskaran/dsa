package recursion;

public class ReverseNumber {

	public static void main(String[] args) {

		int n = 237811;
		int r = 0;
		//System.out.println(revRecursion(n, r));
		System.out.println(rev(n));

	}

	static int revRecursion(int n, int rev) {

		if (n == 0) {
			return rev;
		}

		return revRecursion(n / 10, rev*10 + (n % 10));

	}

	static int rev(int n) {

		int reverse = 0;

		while (n != 0) {

			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}
		return reverse;

	}

}
