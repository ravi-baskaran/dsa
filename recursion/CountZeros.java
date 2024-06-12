package recursion;

public class CountZeros {

	public static void main(String[] args) {

		int n = 20304;
		
		System.out.println(countZero(n, 0));

	}

	static int countZero(int n, int count) {

		return helper(n, count);

	}

	static int helper(int n, int count) {

		int rem = n % 10;

		if (n == 0) {
			return count;
		}
		if (rem == 0) {
			return helper(n / 10, ++count);
		}
		return helper(n / 10, count);

	}

}
